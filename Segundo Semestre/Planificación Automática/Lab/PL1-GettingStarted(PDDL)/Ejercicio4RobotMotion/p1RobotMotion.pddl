(define (problem p1RobotMotion)
    (:domain domainRobotMotion)
    (:objects shakey - robot
              r1 r2 r3 r4 corridor - location
              d1 d2 d3 d4 - door
              ls1 ls2 ls3 ls4 lsCorridor - lightSwitch
              b1 b2 - box
    )
    (:init (at shakey r1) (at b1 r1) (at b2 r1)
           (at ls1 r1) (at ls2 r2) (at ls3 r3) (at ls4 r4) (at lsCorridor corridor)
           (nextTo d1 r1 corridor) (nextTo d1 corridor r1)
           (nextTo d2 r2 corridor) (nextTo d2 corridor r2)
           (nextTo d3 r3 corridor) (nextTo d3 corridor r3)
           (nextTo d4 r4 corridor) (nextTo d4 corridor r4)
    )
    (:goal (and (turnedOn ls1)
                (turnedOn ls2)
                (turnedOn ls3)
                (turnedOn ls4)
                (turnedOn lsCorridor))
    )
)