package com.ruddfawcett.gotham.entities;

import com.ruddfawcett.gotham.actions.Actions;
import com.ruddfawcett.gotham.actions.attacks.*;

import com.ruddfawcett.gotham.locations.*;

public class Entity implements Actions {
  protected String name;
  protected String alias;
  
  public Location location;

  public static final double MAX_HEALTH = 100.0;
  public static final double MAX_EXPERIENCE = 100.0;

  protected double health = MAX_HEALTH;
  protected double experience = 0;

  public Entity(String name, String alias, Location location) {
    this.name = name;
    this.alias = alias;
    this.location = location;
  }

  public String getName() {
    return name;
  }
  
  public String getAlias() {
	 return alias;
  }

  public double getHealth() {
    return health;
  }

  public double getExperience() {
    return experience;
  }
  
  public Location getLocation() {
	 return this.location;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public void setExperience(double experience) {
    this.experience = experience;
  }
  
  public void setLocation(Location location) {
	 this.location = location;
  }
  @Override
  public void move(Direction direction) {
	 if (this.location.getClass().equals(Room.class)) {
		 Room room = (Room)this.location;
		 
		 if (room.getExits().size() > 0 && !room.getExits().get(direction).equals(null)) {
			 this.location = room.getExits().get(direction);
			 System.out.println("You have moved to the " + this.location.getName() + ".");
		 }
		 else {
			 System.out.println("You can't go that way!");
		 }
	 }
  }

  @Override
  public void attack(Attack attack, Entity target) {
	  
  }
}
