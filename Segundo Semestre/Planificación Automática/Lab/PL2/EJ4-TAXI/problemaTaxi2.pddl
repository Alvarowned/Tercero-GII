(define (problem problemaTaxi2) (:domain dominioTaxi)
  (:objects 
      taxi1 taxi2 - taxi
      l1 l2 l3 l4 - location
      p1 p2 p3 p4 p5 p6 - person
      gs1 gs2 - gasStation
  )

  (:init
      (= (totalFuel) 0) 
      (= (totalTime) 0)
      
      (= (maxCapacity taxi1) 3)
      (= (maxCapacity taxi2) 3)
      (= (peopleInside taxi1) 0)
      (= (peopleInside taxi2) 0)
      (= (maxFuel taxi1) 45)    ; Litros de gasolina del depósito
      (= (maxFuel taxi2) 45)

      (= (fuelSpentRate fast) 30)      ; Litros gastados por hora
      (= (fuelSpentRate medium) 20)
      (= (fuelSpentRate slow) 10)
      
      (= (speed fast) 60)            ; 60km/h
      (= (speed medium) 40)          ; 40km/h
      (= (speed slow) 20)            ; 20km/h

      (= (remainingFuel taxi1) 15)
      (= (remainingFuel taxi2) 20)

      (= (timeToPickUp) 0.15) (= (timeToGetDown) 0.15)
      (= (timeToRefuel) 0.15) (= (changeMovSpeedTime) 0.05)

      (= (distance l1 l2) 30) (= (distance l1 l3) 50) (= (distance l1 l4) 70) (= (distance l1 gs1) 20) (= (distance l1 gs2) 80)
      (= (distance l2 l1) 30) (= (distance l2 l3) 30) (= (distance l2 l4) 35) (= (distance l2 gs1) 35) (= (distance l2 gs2) 60)
      (= (distance l3 l1) 50) (= (distance l3 l2) 30) (= (distance l3 l4) 15) (= (distance l3 gs1) 50) (= (distance l3 gs2) 30)
      (= (distance l4 l1) 70) (= (distance l4 l2) 35) (= (distance l4 l3) 15) (= (distance l4 gs1) 60) (= (distance l4 gs2) 15)
      (= (distance gs1 l1) 20) (= (distance gs1 l2) 35) (= (distance gs1 l3) 50) (= (distance gs1 l4) 60) (= (distance gs1 gs2) 90)
      (= (distance gs2 l1) 80) (= (distance gs2 l2) 60) (= (distance gs2 l3) 30) (= (distance gs2 l4) 15) (= (distance gs2 gs1) 90)

      (at p1 l1) (at p2 l1)
      (at p3 l2) (at p4 l3)
      (at p5 l2) (at p6 l4)

      (different l1 l2) (different l1 l3) (different l1 l4) (different l1 gs1) (different l1 gs2)
      (different l2 l1) (different l2 l3) (different l2 l4) (different l2 gs1) (different l2 gs2)
      (different l3 l1) (different l3 l2) (different l3 l4) (different l3 gs1) (different l3 gs2)
      (different l4 l1) (different l4 l2) (different l4 l3) (different l4 gs1) (different l4 gs2)
      (different gs1 l1) (different gs1 l2) (different gs1 l3) (different gs1 l4) (different gs1 gs2)
      (different gs2 l1) (different gs2 l2) (different gs2 l3) (different gs2 l4) (different gs2 gs1)

      (at taxi1 l1)
      (still taxi1)
      (speedType taxi1 slow)

      (at taxi2 l4)
      (still taxi2)
      (speedType taxi2 slow)
  )

  (:goal (and
      (at p1 gs2) (at p2 l4)
      (at p3 l3) (at p4 l2)
      (at p5 l3) (at p6 gs1)
    )
  )

  (:metric
      minimize (+ (* 0.5 (totalFuel)) (* 0.5 (totalTime)))
  )
)
