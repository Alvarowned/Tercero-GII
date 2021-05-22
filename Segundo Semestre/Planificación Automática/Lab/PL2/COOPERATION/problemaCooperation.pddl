(define (problem problemaCooperation) (:domain dominioCooperation)
  (:objects 
    Leader - UAV
    Follower0 - UGV
    N0 N1 - navMode
    cb1 cb2 - chargeBase
    cam1 cam2 - camera

    X0 X1 X2 X3 X4 X5 X6 X7 X8 X9 X10 X11 X12 X13 X14 X15 X16 - X
    Y0 Y1 Y2 Y3 Y4 Y5 Y6 Y7 Y8 Y9 Y10 Y11 Y12 Y13 - Y

    P_0 P_45 P_90 P_135 P_180 P_225 P_270 P_315 - pan
    T_0 T_45 T_90 T_270 T_315 - til
  )

  (:init 
    (undocked Leader) (undocked Follower0)
    (at Leader X10 Y2) (at Follower0 X6 Y10)
    (at cb1 X10 Y2) (at cb2 X6 Y10)
    (navigation Leader N0) (navigation Follower0 N0)
    (still Leader) (still Follower0)
    (has Leader cam1) (has Follower0 cam2)
    (camFocus cam1 P_0 T_0) (camFocus cam2 P_0 T_0)

    (nextToPan P_0 P_45) (nextToPan P_45 P_0)
    (nextToPan P_45 P_90) (nextToPan P_90 P_45)
    (nextToPan P_90 P_135) (nextToPan P_135 P_90)
    (nextToPan P_135 P_180) (nextToPan P_180 P_135)
    (nextToPan P_180 P_225) (nextToPan P_225 P_180)
    (nextToPan P_225 P_270) (nextToPan P_270 P_225)
    (nextToPan P_270 P_315) (nextToPan P_315 P_270)

    (nextToTil T_0 T_45) (nextToTil T_45 T_0)
    (nextToTil T_45 T_90) (nextToTil T_90 T_45)
    (nextToTil T_90 T_270) (nextToTil T_270 T_90)
    (nextToTil T_270 T_315) (nextToTil T_315 T_270)

    (= (sendTime) 5) (= (sendBattery) 1)
    (= (makePicTime) 10) (= (makePicBattery) 5)
    (= (chargeBaseDockTime) 1)
    (= (changeNavModeTime) 5) (= (changeNavModeBattery) 2)
    (= (focusTime) 1) (= (focusBattery) 0.5)
    (= (speed Leader N0) 30) (= (speed Leader N1) 60)
    (= (speed Follower0 N0) 10) (= (speed Follower0 N1) 20)
    (= (remainingBattery Leader) 100) (= (remainingBattery Follower0) 100)
    (= (maxBattery Leader) 100) (= (maxBattery Follower0) 100)

    (= (distanceInterPoint) 5)
    (= (distancePoints X6 Y10 X10 Y2) 8.9) (= (distancePoints X10 Y2 X6 Y10) 8.9)
    (= (distancePoints X6 Y10 X5 Y9) 2.6) (= (distancePoints X5 Y9 X6 Y10) 2.6)
    (= (distancePoints X10 Y2 X5 Y9) 8.6) (= (distancePoints X5 Y9 X10 Y2) 8.6)
    (= (distancePoints X6 Y10 X16 Y13) 10.4) (= (distancePoints X16 Y13 X6 Y10) 10.4)
    (= (distancePoints X10 Y2 X16 Y13) 12.5) (= (distancePoints X16 Y13 X10 Y2) 12.5)
  )

  (:goal (and
    (pictureSent X5 Y9 P_0 T_0)
    (pictureSent X16 Y13 P_0 T_0)
  ))

  (:constraints (and
    (preference UAV_NOT_CHARGING (forall (?uav - UAV) (always (undocked ?uav))))
    (preference UGV_NOT_CHARGING (forall (?ugv - UGV) (sometime (undocked ?ugv))))
  ))

  (:metric minimize (+ (* (+ (* (totalTime) 0.9) (* (totalBattery) 0.1)) 0.5)
      (* (+ (* (is-violated UAV_NOT_CHARGING) 0.5) (* (is-violated UGV_NOT_CHARGING) 0.5)) 0.5))
  )
)