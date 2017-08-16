package com.fp.trafficsignal

import com.fp.trafficsignal.Direction._

trait TrafficState {
  def allowedTurns: List[DirectionTuple]
}

object TrafficState_ONE extends TrafficState {
  override def allowedTurns: List[DirectionTuple] = {
    List(
      (NORTH, EAST),
      (EAST, SOUTH),
      (SOUTH, WEST),
      (WEST, NORTH),
      (SOUTH, NORTH),
      (NORTH, SOUTH)
    )
  }
}

object TrafficState_TWO extends TrafficState {
  override def allowedTurns: List[DirectionTuple] = {
    List(
      (NORTH, EAST),
      (EAST, SOUTH),
      (SOUTH, WEST),
      (WEST, NORTH),
      (SOUTH, NORTH),
      (SOUTH, EAST)
    )
  }
}

object TrafficState_THREE extends TrafficState {
  override def allowedTurns: List[DirectionTuple] = {
    List(
      (NORTH, EAST),
      (EAST, SOUTH),
      (SOUTH, WEST),
      (WEST, NORTH),
      (NORTH, WEST),
      (NORTH, SOUTH)
    )
  }
}

object TrafficState_FOUR extends TrafficState {
  override def allowedTurns: List[DirectionTuple] = {
    List(
      (NORTH, EAST),
      (EAST, SOUTH),
      (SOUTH, WEST),
      (WEST, NORTH),
      (EAST, WEST),
      (WEST, EAST)
    )
  }
}

object TrafficState_FIVE extends TrafficState {
  override def allowedTurns: List[DirectionTuple] = {
    List(
      (NORTH, EAST),
      (EAST, SOUTH),
      (SOUTH, WEST),
      (WEST, NORTH),
      (WEST, EAST),
      (WEST, SOUTH)
    )
  }
}

object TrafficState_SIX extends TrafficState {
  override def allowedTurns: List[DirectionTuple] = {
    List(
      (NORTH, EAST),
      (EAST, SOUTH),
      (SOUTH, WEST),
      (WEST, NORTH),
      (EAST, NORTH),
      (EAST, WEST)
    )
  }
}