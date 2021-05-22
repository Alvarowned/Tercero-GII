;Header and description

(define (domain dominioTaxi)
    (:requirements 
        :strips 
        :fluents 
        :durative-actions 
        :timed-initial-literals 
        :typing 
        :conditional-effects 
        :negative-preconditions 
        :duration-inequalities 
        :equality 
        :universal-preconditions
    )

    (:types
        taxi - object
        person - object
        location - object
        gasStation - location
        speedMode - object
    )

    (:constants 
        slow medium fast - speedMode
    )

    (:predicates
        (moving ?t - taxi)
        (still ?t - taxi)
        (speedType ?t - taxi ?sm - speedMode)
        (at ?x - (either taxi person) ?l - location)
        (in ?t - taxi ?p - person)
        (different ?l1 ?l2 - location)
    )

    (:functions
        (maxCapacity ?t - taxi)
        (peopleInside ?t - taxi)
        (maxFuel ?t - taxi)
        (fuelSpentRate ?sm - speedMode)
        (speed ?sm - speedMode)
        (remainingFuel ?t - taxi)
        (distance ?l1 ?l2 - location)
        (timeToPickUp)
        (timeToGetDown)
        (timeToRefuel)
        (changeMovSpeedTime)
        (totalTime)
        (totalFuel)
    )

    (:constraints (and
        (forall (?t - taxi) (always (> (remainingFuel ?t) 0)))
    ))

    (:durative-action move
        :parameters (?t - taxi ?sm - speedMode ?l1 ?l2 - location)
        :duration (= ?duration (/ (distance ?l1 ?l2) (speed ?sm)))
        :condition (and 
            (at start (still ?t))
            (at start (at ?t ?l1))
            (over all (speedType ?t ?sm))
            (over all (different ?l1 ?l2))
        )
        :effect (and 
            (at start (moving ?t))
            (at start (not (still ?t)))
            (at start (not (at ?t ?l1)))
            (at end (not (moving ?t)))
            (at end (still ?t))
            (at end (at ?t ?l2))
            (at end (increase (totalTime) (/ (distance ?l1 ?l2) (speed ?sm))))
            (at end (decrease (remainingFuel ?t) (* (fuelSpentRate ?sm) (/ (distance ?l1 ?l2) (speed ?sm)))))
            (at end (increase (totalFuel) (* (fuelSpentRate ?sm) (/ (distance ?l1 ?l2) (speed ?sm)))))
        )
    )

    (:durative-action changeMovSpeed
        :parameters (?t - taxi ?sm1 ?sm2 - speedMode)
        :duration (= ?duration (changeMovSpeedTime))
        :condition (and 
            (over all (still ?t))
            (at start (speedType ?t ?sm1))
        )
        :effect (and 
            (at start (not (speedType ?t ?sm1)))
            (at end (speedType ?t ?sm2))
            (at end (increase (totalTime) (changeMovSpeedTime)))
        )
    )
    
    (:durative-action pickUp
        :parameters (?t - taxi ?p - person ?l - location)
        :duration (= ?duration (timeToPickUp))
        :condition (and 
            (at start (at ?p ?l))
            (at start (< (peopleInside ?t) (maxCapacity ?t)))
            (over all (at ?t ?l))
            (over all (still ?t))
        )
        :effect (and 
            (at end (not (at ?p ?l)))
            (at end (in ?t ?p))
            (at end (increase (peopleInside ?t) 1))
            (at end (increase (totalTime) (timetoPickUp)))
        )
    )
    
    (:durative-action getDown
        :parameters (?t - taxi ?p - person ?l - location)
        :duration (= ?duration (timeToGetDown))
        :condition (and 
            (at start (in ?t ?p))
            (over all (at ?t ?l))
            (over all (still ?t))
        )
        :effect (and 
            (at end (at ?p ?l))
            (at end (not (in ?t ?p)))
            (at end (decrease (peopleInside ?t) 1))
            (at end (increase (totalTime) (timeToGetDown)))
        )
    )

    (:durative-action reFuel
        :parameters (?t - taxi ?gs - gasStation)
        :duration (= ?duration (timeToRefuel))
        :condition (and 
            (over all (at ?t ?gs))
            (over all (still ?t))
        )
        :effect (and 
            (at end (increase (totalFuel) (- (maxFuel ?t) (remainingFuel ?t))))
            (at end (assign (remainingFuel ?t) (maxFuel ?t)))
            (at end (increase (totalTime) (timeToRefuel)))
        )
    )
    
)