(define (problem p1Satellite)
    (:domain domainSatellite)
    (:objects s1 - satellite
              i1 - instrument
              DirPhenomenon4 DirStar5 DirPhenomenon6 - direction
              ModeThermograph0 - mode)
    (:init (pointing s1 DirPhenomenon4)
           (on-board i1 s1)  (supports i1 ModeThermograph0)
    )
    (:goal (and (have-image DirPhenomenon4 ModeThermograph0)
                (have-image DirStar5 ModeThermograph0)
                (have-image DirPhenomenon6 ModeThermograph0))
    )
)