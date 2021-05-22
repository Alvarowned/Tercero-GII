(define (problem p1Rocket)
    (:domain domainRocket)
    (:objects r1 r2 - rocket
              c1 c2 c3 c4 - cargo
              a1 a2 a3 a4 - astronaut
              l1 l2 - location
    )
    (:init (= (capacityAstronauts r1) 1) (= (capacityCargo r1) 4)
           (= (capacityAstronauts r2) 2) (= (capacityCargo r2) 2)
           (at r1 l1) (at r2 l1)
           (at c1 l1) (at c2 l1) (at c3 l1) (at c4 l1)
           (at a1 l1) (at a2 l1) (at a3 l1) (at a4 l1)
           (= (costFuel) 0)
    )
    (:goal (and (at c1 l2) (at c2 l2) (at c3 l2) (at c4 l2)
                (at a1 l2) (at a2 l2) (at a3 l2) (at a4 l2))
    )
  
    (:metric minimize (costFuel))
)