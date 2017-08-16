package com.fp.trafficsignal

import org.junit.Test
import org.scalatest.Matchers._

import com.fp.trafficsignal.Direction._
import com.fp.trafficsignal.Signal._

class TrafficSignalTest {

  @Test
  def isShouldCreateTrafficSignalWithInitialStateONE(): Unit = {
    //given
    val expectedState: TrafficState = TrafficState_ONE
    val trafficSignal: TrafficSignal = TrafficSignal()
    //when
    //then
    expectedState should be(trafficSignal.trafficState)
  }

  @Test
  def isShouldReturnTrafficSignalWithNextState(): Unit = {
    //given
    val expectedState: TrafficState = TrafficState_TWO
    val trafficSignal: TrafficSignal = TrafficSignal()
    //when
    val trafficSignal2 = trafficSignal.nextState()
    //then
    expectedState should be(trafficSignal2.trafficState)
  }

  @Test
  def isShouldValidateAllowedTurns(): Unit = {
    //given
    val trafficSignal: TrafficSignal = TrafficSignal()
    //when
    //then
    trafficSignal.isTurnAllowed(NORTH, NORTH) should be(RED)
    trafficSignal.isTurnAllowed(NORTH, SOUTH) should be(GREEN)
    trafficSignal.isTurnAllowed(NORTH, EAST) should be(GREEN)
    trafficSignal.isTurnAllowed(NORTH, WEST) should be(RED)
    trafficSignal.isTurnAllowed(SOUTH, NORTH) should be(GREEN)
    trafficSignal.isTurnAllowed(SOUTH, WEST) should be(GREEN)
    trafficSignal.isTurnAllowed(WEST, SOUTH) should be(RED)
    trafficSignal.isTurnAllowed(EAST, WEST) should be(RED)
    trafficSignal.isTurnAllowed(WEST, NORTH) should be(GREEN)
  }

}