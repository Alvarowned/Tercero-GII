(define (domain dominioEdificio)

    (:requirements 
        :strips 
        :fluents 
        :durative-actions 
        :timed-initial-literals 
        :typing 
        :conditional-effects 
        :negative-preconditions 
        :equality
    )

    (:types lift 
            mode
            person 
            numero
    )

    (:predicates (isEven ?n - numero)
        (at ?l - lift ?f - numero)
        (is ?l - lift ?lt - mode)
        (inMove ?l - lift)
        (atPerson ?p - person ?at - (either lift numero))
        (still ?l - lift)
    )

    (:constants
        slowlift - mode
        fastlift - mode
    )

    (:functions
        (moveTime ?lt - mode)
        (int ?n - numero)
        (totalTime)
        (inside ?l - lift)
    )

    (:durative-action moveUpSlow
        :parameters (?l - lift ?level1 ?level2 - numero ?lt - mode)
        :duration (= ?duration (* (moveTime ?lt) (- (int ?level2) (int ?level1))))
        :condition (and 
            (over all (= ?lt slowlift))
            (over all (< (int ?level1) (int ?level2)))
            (at start (at ?l ?level1))
            (over all (is ?l ?lt))
        )
        :effect (and 
            (at start (not (at ?l ?level1)))
            (at start (not (still ?l)))
            (at start (inMove ?l))
            (at end (at ?l ?level2))
            (at end (not (inMove ?l)))
            (at end (still ?l))
            (at end (increase (totalTime) (moveTime ?lt)))
        )
    )

    (:durative-action moveUpFast
        :parameters (?l - lift ?level1 ?level2 - numero ?lt - mode)
        :duration (= ?duration (* (moveTime ?lt) (- (int ?level2) (int ?level1))))
        :condition (and 
            (over all (= ?lt fastlift))
            (over all (< (int ?level1) (int ?level2)))
            (at start (at ?l ?level1))
            (over all (is ?l ?lt))
            (at end (isEven ?level2))
        )
        :effect (and 
            (at start (not (at ?l ?level1)))
            (at start (not (still ?l)))
            (at start (inMove ?l))
            (at end (at ?l ?level2))
            (at end (not (inMove ?l)))
            (at end (still ?l))
            (at end (increase (totalTime) (moveTime ?lt)))
        )
    )

    (:durative-action moveDownSlow
        :parameters (?l - lift ?level1 ?level2 - numero ?lt - mode)
        :duration (= ?duration (* (moveTime ?lt) (- (int ?level1) (int ?level2))))
        :condition (and 
            (over all (= ?lt slowlift))
            (over all (> (int ?level1) (int ?level2)))
            (at start (at ?l ?level1))
            (over all (is ?l ?lt))
        )
        :effect (and 
            (at start (not (at ?l ?level1)))
            (at start (not (still ?l)))
            (at start (inMove ?l))
            (at end (at ?l ?level2))
            (at end (not (inMove ?l)))
            (at end (still ?l))
            (at end (increase (totalTime) (moveTime ?lt)))
        )
    )

    (:durative-action moveDownFast
        :parameters (?l - lift ?level1 ?level2 - numero ?lt - mode)
        :duration (= ?duration (* (moveTime ?lt) (- (int ?level1) (int ?level2))))
        :condition (and 
            (over all (= ?lt fastlift))
            (over all (> (int ?level1) (int ?level2)))
            (at start (at ?l ?level1))
            (over all (is ?l ?lt))
            (at end (isEven ?level2))
        )
        :effect (and 
            (at start (not (at ?l ?level1)))
            (at start (not (still ?l)))
            (at start (inMove ?l))
            (at end (at ?l ?level2))
            (at end (not (inMove ?l)))
            (at end (still ?l))
            (at end (increase (totalTime) (moveTime ?lt)))
        )
    )

    (:durative-action board
        :parameters (?p - person ?l - lift ?level ?num1 ?num2 - numero)
        :duration (= ?duration 1)
        :condition (and 
            (at start (atPerson ?p ?level))
            (over all (at ?l ?level))
            (over all (still ?l))
            (at start (= (int ?num1) (inside ?l)))
            (at start (= (int ?num2) (inside ?l)))
        )
        :effect (and 
            (at start (not (atPerson ?p ?level)))
            (at end (atPerson ?p ?l))
            (at end (increase (int ?num2) 1))
            (at end (increase (inside ?l) 1))
        )
    )    

    (:durative-action leave
        :parameters (?p - person ?l - lift ?level ?num1 ?num2 - numero)
        :duration (= ?duration 1)
        :condition (and 
            (at start (atPerson ?p ?l))
            (over all (at ?l ?level))
            (over all (still ?l))
            (at start (= (int ?num1) (inside ?l)))
            (at start (= (int ?num2) (inside ?l)))
        )
        :effect (and 
            (at start (not (atPerson ?p ?l)))
            (at end (atPerson ?p ?level))
            (at end (decrease (int ?num2) 1))
            (at end (decrease (inside ?l) 1))
        )
    )
)