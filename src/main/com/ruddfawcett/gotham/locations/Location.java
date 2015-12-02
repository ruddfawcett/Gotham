package com.ruddfawcett.gotham.locations;

public class Location {
  private String name;
  private String description;

  public Location() {}
  
  public Location(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
	return this.name;
  }

  public String getDescription() {
	return this.description;
  }
}
