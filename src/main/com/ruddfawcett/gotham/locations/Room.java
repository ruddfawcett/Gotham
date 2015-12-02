package com.ruddfawcett.gotham.locations;

import java.util.Map;
import java.util.HashMap;

import com.ruddfawcett.gotham.locations.Room;
import com.ruddfawcett.gotham.locations.Direction;

public class Room extends Location {
  private Map<Direction, Room> exits;

  public Room(String name, String description, Map<Direction, Room> exits) {
    super(name, description);
    
    this.exits = exits;
  }

  public Map<Direction, Room> getExits() {
	return this.exits;
  }
  
  public void setExits(Map<Direction, Room> exits) {
	  this.exits = exits;
  }
  
}
