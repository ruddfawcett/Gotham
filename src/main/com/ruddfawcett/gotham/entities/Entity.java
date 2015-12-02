package com.ruddfawcett.gotham.entities;

import com.ruddfawcett.gotham.actions.Actions;
import com.ruddfawcett.gotham.actions.attacks.Attack;
import com.ruddfawcett.gotham.locations.Direction;

public class Entity implements Actions {
  protected String name;

  public static final double MAX_HEALTH = 100.0;
  public static final double MAX_EXPERIENCE = 100.0;

  protected double health = MAX_HEALTH;
  protected double experience = 0;

  public Entity(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getHealth() {
    return health;
  }

  public double getExperience() {
    return experience;
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

  @Override
  public void walk(Direction direction) {
	  // TODO Auto-generated method stub
	
  }

  @Override
  public void attack(Attack attack, Entity target) {
	  // TODO Auto-generated method stub
	
  }
}
