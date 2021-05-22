(define (problem p2RobotMotion)
    (:domain domainRobotMotion)
    (:objects shakey - robot
              r1 r2 r3 r4 r5 r6 r7 r8 - location
              d1 d2 d3 d4 d5 d6 d7 d8 - door
              ls1 ls2 ls3 ls4 ls5 ls6 ls7 ls8 - lightSwitch
              b1 b2 b3 b4 b5 - box
    )
    (:init (at shakey r1) (at b1 r3) (at b2 r5) (at b3 r6) (at b4 r7) (at b5 r8)
           (at ls1 r1) (at ls2 r2) (at ls3 r3) (at ls4 r4) (at ls5 r5) (at ls6 r6) (at ls7 r7) (at ls8 r8)
           (nextTo d1 r1 r2) (nextTo d1 r2 r1)
           (nextTo d2 r2 r3) (nextTo d2 r3 r2)
           (nextTo d3 r3 r4) (nextTo d3 r4 r3)
           (nextTo d4 r4 r5) (nextTo d4 r5 r4)
           (nextTo d5 r5 r6) (nextTo d5 r6 r5)
           (nextTo d6 r6 r7) (nextTo d6 r7 r6)
           (nextTo d7 r7 r8) (nextTo d7 r8 r7)
           (nextTo d8 r8 r1) (nextTo d8 r1 r8)
    )
    (:goal (and (turnedOn ls1)
                (turnedOn ls2)
                (turnedOn ls3)
                (turnedOn ls4)
                (turnedOn ls5)
                (turnedOn ls6)
                (turnedOn ls7)
                (turnedOn ls8))
    )
)