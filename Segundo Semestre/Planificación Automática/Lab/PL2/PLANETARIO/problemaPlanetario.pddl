(define (problem problemaPlanetario) (:domain dominioPlanetario)
  (:objects
    r0 r1 - robot
    l0 l1 l2 - lugar
    rapido lento - velocidad
    excavar fotografia - accion
  )

  (:init
    (= (tiempoTotal) 0)
    (= (bateriaTotal) 0)
    (= (distanciaRecorrida) 0)
    (= (numRecargas) 0)
    (quieto r0) (quieto r1)

    (en r0 l0)
    (= (velocidadReal r0 lento) 0.3) (= (velocidadReal r0 rapido) 0.6)
    (= (consumoPorMov r0 lento) 0.2) (= (consumoPorMov r0 rapido) 0.5)
    (= (bateriaRestante r0) 100) (= (bateriaMaxima r0) 100) (= (puntoDeRecarga r0) 20) (= (velocidadDeRecarga r0) 0.05)
    (= (tiempoAccion r0 excavar) 20) (= (tiempoAccion r0 fotografia) 10)
    (= (consumoPorAccion r0 excavar) 30) (= (consumoPorAccion r0 fotografia) 5)

    (conexion l0 l1) (conexion l1 l0)
    (conexion l1 l2) (conexion l2 l1)

    (= (distancia l1 l0) 5) (= (distancia l0 l1) 5)
    (= (distancia l1 l2) 3) (= (distancia l2 l1) 3)
    (= (distancia l2 l0) 2) (= (distancia l0 l2) 2)

    (distinto l0 l1) (distinto l1 l0)
    (distinto l1 l2) (distinto l2 l1)
    (distinto l2 l0) (distinto l0 l2)

    (= (actividad l0 excavar) 0) (= (actividad l0 fotografia) 0)
    (= (actividad l1 excavar) 0) (= (actividad l1 fotografia) 0)
    (= (actividad l2 excavar) 0) (= (actividad l2 fotografia) 0)
  )

  (:goal (and
    (= (actividad l0 fotografia) 6)
    (= (actividad l1 excavar) 2)
    (= (actividad l2 fotografia) 3)
  ))

  (:metric minimize (tiempoTotal))
)
