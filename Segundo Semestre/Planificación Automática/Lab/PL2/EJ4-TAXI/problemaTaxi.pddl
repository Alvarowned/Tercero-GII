(define (problem problemaTaxi) (:domain dominioTaxi)
  (:objects 
      taxi1 - taxi
      l1 l2 - location
      p1 p2 p3 - person
      gs1 - gasStation
  )

  (:init
      (= (totalFuel) 0) 
      (= (totalTime) 0)
      
      (= (maxCapacity taxi1) 3)
      (= (peopleInside taxi1) 0)
      (= (maxFuel taxi1) 45)    ; Litros de gasolina del depósito

      (= (fuelSpentRate fast) 30)      ; Litros gastados por hora
      (= (fuelSpentRate medium) 20)
      (= (fuelSpentRate slow) 10)
      
      (= (speed fast) 60)            ; 60km/h
      (= (speed medium) 40)          ; 40km/h
      (= (speed slow) 20)            ; 20km/h

      (= (remainingFuel taxi1) 45)

      (= (timeToPickUp) 0.15) (= (timeToGetDown) 0.15)
      (= (timeToRefuel) 0.15) (= (changeMovSpeedTime) 0.05)

      (= (distance l1 l2) 70) (= (distance l1 gs1) 60)
      (= (distance l2 l1) 70) (= (distance l2 gs1) 50)
      (= (distance gs1 l1) 60) (= (distance gs1 l2) 50)

      (at p1 l1) (at p2 l2) (at p3 gs1)

      (different l1 l2) (different l1 gs1) 
      (different l2 l1) (different l2 gs1) 
      (different gs1 l1) (different gs1 l2)

      (at taxi1 l1)
      (still taxi1)
      (speedType taxi1 slow)
  )

  (:goal (and
      (at p1 l2) (at p2 gs1) (at p3 l1)
    )
  )

  (:metric
      minimize (+ (* 0.5 (totalFuel)) (* 0.5 (totalTime)))
  )
)