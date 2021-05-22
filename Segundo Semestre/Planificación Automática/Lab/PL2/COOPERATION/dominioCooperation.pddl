(define (domain dominioCooperation)
    (:requirements 
        :strips 
        :fluents 
        :durative-actions 
        :timed-initial-literals 
        :typing 
        :equality
        :constraints
        :universal-preconditions
        :preferences
    )

    (:types
        chargeBase
        vehicle
        UAV UGV - vehicle
        navMode
        coordinates
        X - coordinates
        Y - coordinates
        pan - cameraFocus
        til - cameraFocus
        camera - tool
    )

    (:predicates
        (undocked ?v - vehicle)(docked ?v - vehicle ?cb - chargeBase)
        (at ?x - (either chargeBase vehicle) ?coor1 - X ?coor2 - Y)
        (navigation ?v - vehicle ?navMode - navMode) (moving ?v)(still ?v)
        (has ?v - vehicle ?t - tool)
        (camFocus ?c - camera ?p - pan ?t - til)
        (pictureMade ?v - vehicle ?x - X ?y - Y ?p - pan ?t - til)
        (pictureSent ?x - X ?y - Y ?p - pan ?t - til)
        (nextToPan ?p1 ?p2) (nextToTil ?t1 ?t2)
    )

    (:functions 
        (sendTime)(sendBattery)
        (makePicTime) (makePicBattery)
        (chargeBaseDockTime)         ; Time to dock or undock
        (changeNavModeTime)(changeNavModeBattery)
        (focusTime) (focusBattery)
        (speed ?v - vehicle ?navMode - navMode)
        (remainingBattery ?v - vehicle)
        (maxBattery ?v - vehicle)
        (distanceInterPoint)       ; Distancia existente entre un punto y otro adyacente
        (distancePoints ?x1 -X ?y1 - Y ?x2 -X ?y2 - Y)
        (batteryUsageRate ?v - vehicle ?navMode - navMode)
        (chargeRate ?v - vehicle)
        (totalTime)(totalBattery) (totalDistance ?v)
    )

    (:constraints (and
        (forall (?v - vehicle) (always (> (remainingBattery ?v) 0)))
    ))

    (:durative-action charge
        :parameters (?v - vehicle ?cb - chargeBase ?x - X ?y - Y)
        :duration (= ?duration (+ (* 2 (chargeBaseDockTime)) (/ (- (maxBattery ?v) (remainingBattery ?v)) (chargeRate ?v))))
        :condition (and 
            (at start (undocked ?v))
            (over all (still ?v))
            (over all (at ?v ?x ?y))
            (over all (at ?cb ?x ?y))
        )
        :effect (and 
            (at start (not (undocked ?v)))
            (at start (docked ?v ?cb))
            (at end (undocked ?v))
            (at end (not (docked ?v ?cb)))
            (at end (assign (remainingBattery ?v) (maxBattery ?v)))
            (at end (increase (totalTime) (+ (* 2 (chargeBaseDockTime)) (/ (- (maxBattery ?v) (remainingBattery ?v)) (chargeRate ?v)))))
        )
    )
    
    (:durative-action makePicture
        :parameters (?v - vehicle ?cam - camera ?x - X ?y - Y ?p - pan ?t - til)
        :duration (= ?duration (makePicTime))
        :condition (and 
            (over all (still ?v))
            (over all (has ?v ?cam))
            (over all (at ?v ?x ?y))
            (over all (camFocus ?cam ?p ?t))
            (over all (undocked ?v))
        )
        :effect (and 
            (at end (pictureMade ?v ?x ?y ?p ?t))
            (at end (increase (totalTime) (makePicTime)))
            (at end (increase (totalBattery) (makePicBattery)))
            (at end (decrease (remainingBattery ?v) (makePicBattery)))
        )
    )

    (:durative-action sendPicture
        :parameters (?v - vehicle ?x - X ?y - Y ?p - pan ?t - til)
        :duration (= ?duration (sendTime))
        :condition (and 
            (over all (still ?v))
            (over all (pictureMade ?v ?x ?y ?p ?t))
            (over all (undocked ?v))
        )
        :effect (and 
            (at end (pictureSent ?x ?y ?p ?t))
            (at end (increase (totalTime) (sendTime)))
            (at end (increase (totalBattery) (sendBattery)))
            (at end (decrease (remainingBattery ?v) (sendBattery)))
        )
    )

    (:durative-action changeNavMode
        :parameters (?v - vehicle ?navMode1 - navMode ?navMode2 - navMode)
        :duration (= ?duration (changeNavModeTime))
        :condition (and 
            (over all (still ?v))
            (over all (undocked ?v))
            (at start (navigation ?v ?navMode1))
        )
        :effect (and 
            (at start (not (navigation ?v ?navMode1)))
            (at end (navigation ?v ?navMode2))
            (at end (increase (totalTime) (changeNavModeTime)))
            (at end (increase (totalBattery) (changeNavModeBattery)))
            (at end (decrease (remainingBattery ?v) (changeNavModeBattery)))
        )
    )

    (:durative-action rotateCamPan
        :parameters (?v - vehicle ?cam - camera ?p1 ?p2 - pan ?t - til)
        :duration (= ?duration (focusTime))
        :condition (and 
            (over all (still ?v))
            (over all (has ?v ?cam))
            (over all (undocked ?v))
            (over all (nextToPan ?p1 ?p2))
            (at start (camFocus ?cam ?p1 ?t))
        )
        :effect (and 
            (at start (not (camFocus ?cam ?p1 ?t)))
            (at end (camFocus ?cam ?p2 ?t))
            (at end (increase (totalTime) (focusTime)))
            (at end (increase (totalBattery) (focusBattery)))
            (at end (decrease (remainingBattery ?v) (focusBattery)))
        )
    )

    (:durative-action rotateCamTil
        :parameters (?v - vehicle ?cam - camera ?p - pan ?t1 ?t2 - til)
        :duration (= ?duration (focusTime))
        :condition (and 
            (over all (still ?v))
            (over all (has ?v ?cam))
            (over all (undocked ?v))
            (over all (nextToTil ?t1 ?t2))
            (at start (camFocus ?cam ?p ?t1))
        )
        :effect (and 
            (at start (not (camFocus ?cam ?p ?t1)))
            (at end (camFocus ?cam ?p ?t2))
            (at end (increase (totalTime) (focusTime)))
            (at end (increase (totalBattery) (focusBattery)))
            (at end (decrease (remainingBattery ?v) (focusBattery)))
        )
    )

    (:durative-action move
        :parameters (?v - vehicle ?x1 ?x2 - X ?y1 ?y2 - Y ?navMode - navMode)
        :duration (= ?duration (/ (* (distanceInterPoint) (distancePoints ?x1 ?y1 ?x2 ?y2)) (speed ?v ?navMode)))
        :condition (and 
            (at start (still ?v))
            (at start (at ?v ?x1 ?y1))
            (over all (undocked ?v))
            (over all (navigation ?v ?navMode))
        )
        :effect (and 
            (at start (not (still ?v)))
            (at start (moving ?v))
            (at start (not (at ?v ?x1 ?y1)))
            (at end (still ?v))
            (at end (not (moving ?v)))
            (at end (at ?v ?x2 ?y2))
            (at end (increase (totalTime) (/ (* distanceInterPoint (distancePoints ?x1 ?y1 ?x2 ?y2)) (speed ?v ?navMode))))
            (at end (increase (totalBattery) (* (batteryUsageRate ?v ?navMode) (/ (* distanceInterPoint (distancePoints ?x1 ?y1 ?x2 ?y2)) (speed ?v ?navMode)))))
            (at end (decrease (remainingBattery ?v) (* (batteryUsageRate ?v ?navMode) (/ (* distanceInterPoint (distancePoints ?x1 ?y1 ?x2 ?y2)) (speed ?v ?navMode)))))
            (at end (increase (totalDistance ?v) (* (distanceInterPoint) (distancePoints ?x1 ?y1 ?x2 ?y2))))
        )
    )
)