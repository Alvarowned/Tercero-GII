(define (problem problemaEdificio) (:domain dominioEdificio)
  (:objects 
    n0 n1 n2 n3 n4 n5 n6 n7 n8 - numero
    l0 l1 l2 l3 - lift
    p0 p1 p2 p3 - person
  )

  (:init
    (= (totalTime) 0)
    (= (moveTime fastlift) 1)
    (= (moveTime slowlift) 0.5)
    (= (int n0) 0) (= (int n1) 1) (= (int n2) 2) (= (int n3) 3) (= (int n4) 4)
    (= (int n5) 5) (= (int n6) 6) (= (int n7) 7) (= (int n8) 8) 
    (isEven n0) (isEven n2) (isEven n4) (isEven n6) (isEven n8)

    (still l0)  (still l1) (still l2) (still l3)

    (is l0 slowlift) (at l0 n0) (= (inside l0) 0) 
    (is l1 slowlift) (at l1 n0) (= (inside l1) 0) 
    (is l2 fastlift) (at l2 n0) (= (inside l2) 0) 
    (is l3 fastlift) (at l3 n0) (= (inside l3) 0) 

    (atPerson p0 n0)
    (atPerson p1 n0)
    (atPerson p2 n5)
    (atPerson p3 n8)
  )

  (:goal (and
    (atPerson p0 n8)
    (atPerson p1 n6)
    (atPerson p2 n0)
    (atPerson p3 n0)
  ))

  (:metric minimize (totalTime))
)