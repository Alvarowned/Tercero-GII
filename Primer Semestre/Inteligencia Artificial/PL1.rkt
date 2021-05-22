#lang racket
(provide (all-defined-out))

(define structVacia '())       ; puede ser una pila o una cola vacía

(define (push p x)             ; función para pilas
  (append x p))

(define (pop p)                ; función para pilas
  (if (null? p)
      null
      (car p)))

(define (insertar c x)         ; función para colas
  (append c x))

(define (extraer c)            ; función para colas
  (car c))

(define (resto pc)              ; sirve para pilas y colas
  (if (null? (pop pc))
      structVacia
      (cdr pc)))

(define (getValor sudoku fil colum)
  (list-ref (list-ref sudoku fil) colum))

(define (setValor sudoku fil colum n)
  (list-set sudoku fil (list-set (getFila sudoku fil) colum n)))

(define (getFila sudoku fil)
  (list-ref sudoku fil))

(define (getColumna sudoku colum)
  (for/list ([i sudoku])
    (list-ref i colum)))

(define (getCuadranteN sudoku n)                 ; devuelve una lista con los valores del cuadrante n
  (getCuadranteFCinit sudoku (* 3 (quotient n 3)) (* 3 (remainder n 3))))

(define (getCuadranteFCinit sudoku fil colum)    ; devuelve una lista con los valores del cuadrante que inicia con la posicion (fil colum)
  (for*/list ([i (in-range fil (+ fil 3))]
              [j (in-range colum (+ colum 3))])
    (getValor sudoku i j)))

(define (getCuadranteFC sudoku fil colum)        ; devuelve una lista con los valores del cuadrante en el que está (fil colum)
  (getCuadranteFCinit sudoku (* (quotient fil 3) 3) (* (quotient colum 3) 3)))

(define (posCuad fil colum)                      ; devuelve la posición dentro del cuadrante en el que esta el elemento (fil colum)
  (+ (* (remainder fil 3) 3) (remainder colum 3)))

(define (comprobarNotRepFila sudoku fil colum n)         ; comprueba si n no está repetido en la fila
  (for/and ([i (in-range 9)])
    (if (equal? (list-ref (list-set (getFila sudoku fil) colum 0) i) n)
        #f
        #t)))

(define (comprobarNotRepColum sudoku fil colum n)         ; comprueba si n no está repetido en la columna
  (for/and ([i (in-range 9)])
    (if (equal? (list-ref (list-set (getColumna sudoku colum) fil 0) i) n)
        #f
        #t)))

(define (comprobarNotRepCuad sudoku fil colum n)         ; comprueba si n no está repetido en el cuadrante
  (for/and ([i (in-range 9)])
    (if (equal? (list-ref (list-set (getCuadranteFC sudoku fil colum) (posCuad fil colum) 0) i) n)
        #f
        #t)))

(define (comprobarValidezCasilla sudoku fil colum)             ; comprueba si el valor dentro de una casilla es válido
  (if (equal? (getValor sudoku fil colum) 0)
      #t
      (if (and (and (comprobarNotRepFila sudoku fil colum (getValor sudoku fil colum)) (comprobarNotRepColum sudoku fil colum (getValor sudoku fil colum))) (comprobarNotRepCuad sudoku fil colum (getValor sudoku fil colum)))
          #t
          #f)))

(define (comprobarValidezSudoku sudoku)                  ; comprueba si es posible resolver el sudoku comprobando si todas las casillas tienen un valor válido (no repetido en fila, columna ni cuadrante)
  (if(member #f (for*/list ([i (in-range 9)]
                            [j (in-range 9)])
                  (comprobarValidezCasilla sudoku i j)))
     #f
     #t))

(define (printSudoku sudoku)                 ; imprime el sudoku dado por pantalla (formateado para mayor legibilidad)
    (for* ([i (in-range 9)]
           [j (in-range 9)])
      (cond
        [(equal? (remainder j 3) 2)
         (if (equal? j 8)
             (if (equal? i 8)
                 (printf  "~a |\n+-------+-------+-------+\n\n"(getValor sudoku i j))
                 (printf "~a |\n" (getValor sudoku i j)))
             (printf "~a | " (getValor sudoku i j)))]
        [(equal? j 0)
         (if (equal? (remainder i 3) 0)
             (printf  "+-------+-------+-------+\n| ~a "(getValor sudoku i j))
             (printf "| ~a "(getValor sudoku i j)))]
        [else (printf "~a " (getValor sudoku i j))])))

(define (listaValoresPosibles sudoku fil colum)
  (for/list ([i (in-range 1 10)] #:when (comprobarValidezSudoku (setValor sudoku fil colum i)))
    i))

(define (listaSudokusPosibles sudoku fil colum)
  (for/list ([i (listaValoresPosibles sudoku fil colum)])
    (setValor sudoku fil colum i)
      ))

(define (primerSudokuPosible sudoku fil colum)
  (setValor sudoku fil colum (car (listaValoresPosibles sudoku fil colum))))
  
(define (sudokuTerminado? sudoku)
  (for*/and ([i (in-range 9)]
             [j (in-range 9)])
    (if (equal? (getValor sudoku i j) 0)
        #f
        #t)))

(define (solucionProf sudoku)
  (if(comprobarValidezSudoku sudoku)
     (when (equal? (solucionProfR sudoku structVacia) #f)
       (printf "Solución al sudoku obtenida.\n"))
     (printf "\nEste sudoku no es válido.\n")))

(define (solucionProfR sudoku pila)
  (printSudoku sudoku)
  (if (sudokuTerminado? sudoku)
      #f
      (for*/and ([i (in-range 9)]
                 [j (in-range 9)])
        (when (equal? (getValor sudoku i j) 0)
          (if (null? (listaSudokusPosibles sudoku i j))
              (when (equal? (solucionProfR (pop pila) (resto pila)) #f)
                #f)
              (when (equal? (solucionProfR (primerSudokuPosible sudoku i j) (push pila (resto (listaSudokusPosibles sudoku i j)))) #f)
                #f))))))

(define (solucionAnch sudoku)
  (if(comprobarValidezSudoku sudoku)
     (when (equal? (solucionAnchR sudoku structVacia) #f)
       (printf "Solución al sudoku obtenida.\n"))
     (printf "\nEste sudoku no es válido.\n")))

(define (solucionAnchR sudoku cola)
  (printSudoku sudoku)
  (if (sudokuTerminado? sudoku)
      #f
      (for*/and ([i (in-range 9)]
                 [j (in-range 9)])
        (when (equal? (getValor sudoku i j) 0)
          (if (null? (listaSudokusPosibles sudoku i j))
              (when (equal? (solucionAnchR (extraer cola) (resto cola)) #f)
                #f)
              (when (equal? (solucionAnchR (extraer (insertar cola (listaSudokusPosibles sudoku i j))) (insertar (resto cola) (listaSudokusPosibles sudoku i j))) #f)
                #f))))))