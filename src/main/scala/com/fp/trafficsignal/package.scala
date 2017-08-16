package com.fp

package object trafficsignal {

  object Direction extends Enumeration {
    type Direction = Value
    val NORTH, SOUTH, EAST, WEST = Value
  }

  object Signal extends Enumeration {
    type Signal = Value
    val RED, GREEN = Value
  }

  import com.fp.trafficsignal.Direction.Direction
  type DirectionTuple = (Direction, Direction)

}
