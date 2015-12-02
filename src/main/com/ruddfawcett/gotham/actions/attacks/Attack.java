package com.ruddfawcett.gotham.actions.attacks;

public class Attack {
  private String name;
  private String description;

  protected double damage = 30.0;

  public Attack(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
	return this.name;
  }

  public String getDescription() {
	return this.description;
  }

  public double getDamage() {
    return this.damage;
  }
}
