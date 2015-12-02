package com.ruddfawcett.gotham.locations;

public enum Direction {
  NORTH, EAST, SOUTH, WEST;

  public Direction getOpposite() {
	Direction opposite = null;
	switch (this) {
		case NORTH:
			opposite = Direction.SOUTH;
			break;
		case SOUTH:
			opposite = Direction.NORTH;
			break;
		case EAST:
			opposite = Direction.WEST;
			break;
		case WEST:
			opposite = Direction.EAST;
			break;
		default:		
			break;
	}
		
		return opposite;
  }
	
  public String toString() {
//    return "Direction -> " + name();
	  return name();
  }
}
