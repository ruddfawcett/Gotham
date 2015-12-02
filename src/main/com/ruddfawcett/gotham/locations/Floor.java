package com.ruddfawcett.gotham.locations;

import java.util.List;
import java.util.ArrayList;

import com.ruddfawcett.gotham.locations.Location;
import com.ruddfawcett.gotham.locations.Room;

public class Floor extends Location {  
  private int floor;
  
  private List<Room> rooms;

  public Floor(int floor, List<Room> rooms) {
    this.rooms = rooms;
  }

  public int getFloor() {
	 return floor;
  }

  public void setFloor(int floor) {
	this.floor = floor;
  }
}
