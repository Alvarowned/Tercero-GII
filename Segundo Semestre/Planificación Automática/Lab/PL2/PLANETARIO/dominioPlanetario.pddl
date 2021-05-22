;Header and description

(define (domain dominioPlanetario)
    (:requirements 
        :strips 
        :fluents 
        :durative-actions 
        :timed-initial-literals 
        :typing 
        :conditional-effects 
        :adl
        :negative-preconditions  
        :equality 
        :preferences)
    (:types robot lugar velocidad accion)

    (:predicates 
        (enMovimiento ?r - robot)
        (en ?r - robot ?l - lugar)
        (conexion ?l1 ?l2 - lugar)
        (quieto ?r - robot)
        (distinto ?l1 ?l2 - lugar)
    )

    (:functions 
        (tiempoTotal)
        (bateriaTotal)
        (distanciaRecorrida)
        (numRecargas)
        (distancia ?l1 - lugar ?l2 - lugar)
        (velocidadReal ?r - robot ?v - velocidad)     ; Devuelve un valor cualitativo para la velocidad rapida o lenta
        (bateriaRestante ?r - robot)
        (bateriaMaxima ?r - robot)
        (puntoDeRecarga ?r - robot)          ; Nivel de bateria al que se cargara el robot
        (velocidadDeRecarga ?r - robot)
        (consumoPorMov ?r - robot ?v - velocidad)
        (consumoPorAccion ?r - robot ?a - accion)
        (actividad ?l - lugar ?a - accion)       ; Numero de veces que se ha realizado una accion ?a en un determinado lugar ?l
        (tiempoAccion ?r - robot ?a - accion)
    )

    (:durative-action desplazamiento
        :parameters (?r - robot ?l1 ?l2 - lugar ?v - velocidad)
        :duration (= ?duration (/(distancia ?l1 ?l2) (velocidadReal ?r ?v)))
        :condition (and 
            (over all (distinto ?l1 ?l2))
            (over all (conexion ?l1 ?l2))
            (over all (> (bateriaRestante ?r) (puntoDeRecarga ?r)))
            (at start (en ?r ?l1))
            (at start (> (bateriaRestante ?r) (* (distancia ?l1 ?l2) (consumoPorMov ?r ?v))))
        )
        :effect (and 
            (at start (not (quieto ?r)))
            (at start (not (en ?r ?l1)))
            (at start (enMovimiento ?r))
            (at end (en ?r ?l2))
            (at end (not (enMovimiento ?r)))
            (at end (quieto ?r))
            (at end (decrease (bateriaRestante ?r) (* (distancia ?l1 ?l2) (consumoPorMov ?r ?v))))
            (at end (increase (bateriaTotal) (* (distancia ?l1 ?l2) (consumoPorMov ?r ?v))))
            (at end (increase (tiempoTotal) (/ (distancia ?l1 ?l2) (velocidadReal ?r ?v))))
            (at end (increase (distanciaRecorrida) (distancia ?l1 ?l2)))
        )
    )

    (:durative-action recargar
        :parameters (?r - robot ?l - lugar)
        :duration (= ?duration (* (velocidadDeRecarga ?r) (- (bateriaMaxima ?r) (bateriaRestante ?r))))
        :condition (and
            (over all (en ?r ?l))
            (over all (quieto ?r))
            (at start (< (bateriaRestante ?r) (bateriaMaxima ?r)))
        )
        :effect (and 
            (at end (assign (bateriaRestante ?r) (bateriaMaxima ?r)))
            (at end (increase (tiempoTotal) (* (velocidadDeRecarga ?r) (- (bateriaMaxima ?r) (bateriaRestante ?r)))))
            (at end (increase (numRecargas) 1))
        )
    )

    (:durative-action realizarAccion
        :parameters (?r - robot ?l - lugar ?a - accion)
        :duration (= ?duration (tiempoAccion ?r ?a))
        :condition (and
            (over all (quieto ?r))
            (over all (en ?r ?l))
            (at start (> (bateriaRestante ?r) (consumoPorAccion ?r ?a)))
        )
        :effect (and
            (at end (increase (actividad ?l ?a) 1))
            (at end (decrease (bateriaRestante ?r) (consumoPorAccion ?r ?a)))
            (at end (increase (bateriaTotal) (consumoPorAccion ?r ?a)))
            (at end (increase (tiempoTotal) (tiempoAccion ?r ?a)))
        )
    )
)