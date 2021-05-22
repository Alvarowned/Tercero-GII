(define (problem p2Satellite)
    (:domain domainSatellite)
    (:objects satellite1 - satellite
              instrument1 - instrument
              spectrograph2 - mode
              phenomenon3 star0 - direction)
    (:init (pointing satellite1 star0)
           (on-board instrument1 satellite1)
           (supports instrument1 spectrograph2)
    )
    (:goal (and (have-image phenomenon3 spectrograph2)))
)