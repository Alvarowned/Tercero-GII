(define (domain blocks)
    (:requirements :strips :typing)
    (:types block)
    (:predicates 
            (on ?x ?y)        ; significa que ?x está sobre ?y
            (ontable ?x)      ; indica que ?x está sobre la mesa
            (clear ?x)        ; clear indica que encima del bloque no hay otro bloque
            (handempty)       ; indica si la mano está vacía o no
            (holding ?x)      ; indica que la mano está sujetando ?x
    )
    (:action pick-up
        :parameters (?x - block)
        :precondition (and (clear ?x) (ontable ?x) (handempty))
        :effect
            (and (not (ontable ?x))
                 (not (clear ?x))
                 (not (handempty))
                 (holding ?x))
    )
    (:action unstack
        :parameters (?x - block ?y - block)
        :precondition (and (on ?x ?y) (clear ?x) (handempty))
        :effect
            (and (holding ?x)
                 (clear ?y)
                 (not (clear ?x))
                 (not (handempty))
                 (not (on ?x ?y)))
    )  
    (:action stack
        :parameters (?x - block ?y - block)
        :precondition (and (holding ?x) (clear ?y))
        :effect
            (and (not (holding ?x))
                 (clear ?x)
                 (not (clear ?y))
                 (on ?x ?y)
                 (handempty)
                 (not (holding ?x))
            )
    )
    (:action put-down
        :parameters (?x - block)
        :precondition (and (holding ?x))
        :effect
            (and (not (holding ?x))
                 (handempty)
                 (ontable ?x)
                 (clear ?x)
            )
    )  
)