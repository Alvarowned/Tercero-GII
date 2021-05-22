(define (domain domainSatellite)
    (:requirements :negative-preconditions :typing :equality)
    (:types satellite direction instrument mode)
    (:predicates 
        (calibrated ?i - instrument)                     ; indica si el instrumento ?i está calibrado
        (on-board ?i - instrument ?s - satellite)        ; indica si el instrumento ?i está en el satélite ?s
        (supports ?i - instrument ?m - mode)             ; indica si el instrumento ?i soporta el modo ?m
        (power-on ?i - instrument)                       ; indica si el instrumento ?i está encendido
        (pointing ?s - satellite ?d - direction)         ; indica si el satélite ?s está apuntando a la dirección ?d
        (maintenance ?s - satellite)                     ; indica si el satélite ha tenido mantenimiento
        (have-image ?d - direction ?m - mode)            ; indica si tenemos una imagen de la dirección ?d en el modo ?m
    )
    
    (:action turn-to            ; gira el satélite ?s (que está aputando a ?d1) hacia ?d2
        :parameters (?s - satellite ?d1 - direction ?d2 - direction)
        :precondition (and (not (= ?d1 ?d2))
                           (pointing ?s ?d1))
        :effect (and (not (pointing ?s ?d1))
                     (pointing ?s ?d2))
    )
    
    (:action switch-on          ; enciende el instrumento ?i en el satélite ?s
        :parameters (?i - instrument ?s - satellite)
        :precondition (and (on-board ?i ?s)
                           (not (power-on ?i)))
        :effect (and (power-on ?i)
                     (not (calibrated ?i)))
    )
    
    (:action switch-off         ; apaga el instrumento ?i en el satélite ?s
        :parameters (?i - instrument ?s - satellite)
        :precondition (and (on-board ?i ?s)
                           (power-on ?i))
        :effect (and (not (power-on ?i))
                     (not (calibrated ?i)))
    )
    
    (:action calibrate
        :parameters (?s - satellite ?i - instrument ?d - direction)
        :precondition (and (power-on ?i)
                           (not (calibrated ?i))
                           (on-board ?i ?s)
                           (pointing ?s ?d))
        :effect (and (calibrated ?i))
    )
    
    (:action perform-maintenance
        :parameters (?s - satellite)
        :precondition (and (not (maintenance ?s)))
        :effect (and (maintenance ?s))
    )
    
    (:action take-image
        :parameters (?s - satellite ?d - direction ?i - instrument ?m - mode)
        :precondition (and (calibrated ?i)
                           (on-board ?i ?s)
                           (supports ?i ?m)
                           (power-on ?i)
                           (pointing ?s ?d)
                           (maintenance ?s))
        :effect (and (have-image ?d ?m) 
                     (not (maintenance ?s)))
    )
)