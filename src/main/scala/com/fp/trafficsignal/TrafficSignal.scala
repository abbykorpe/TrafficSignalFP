package com.fp.trafficsignal

import com.fp.trafficsignal.Direction._
import com.fp.trafficsignal.Signal._

case class TrafficSignal(trafficState: TrafficState) {

  def isTurnAllowed(inDirection: Direction, outDirection: Direction): Signal =
    if (trafficState.allowedTurns.contains((inDirection, outDirection))) GREEN else RED

  def nextState(): TrafficSignal = TrafficSignal(nextTrafficState())

  private def nextTrafficState(): TrafficState = {
    trafficState match {
      case TrafficState_ONE => TrafficState_TWO
      case TrafficState_TWO => TrafficState_THREE
      case TrafficState_THREE => TrafficState_FOUR
      case TrafficState_FOUR => TrafficState_FIVE
      case TrafficState_FIVE => TrafficState_SIX
      case TrafficState_SIX => TrafficState_ONE
      case _ => TrafficState_ONE
    }
  }
}

object TrafficSignal {
  private val getInitialState: TrafficState = TrafficState_ONE

  def apply(): TrafficSignal = TrafficSignal(getInitialState)
}
