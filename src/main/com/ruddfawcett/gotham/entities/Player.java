package com.ruddfawcett.gotham.entities;

import com.ruddfawcett.gotham.items.storage.Backpack;
import com.ruddfawcett.gotham.locations.Location;

public class Player extends Entity {
  public Backpack backpack;

  private int level = 1;

  public Player(String name, String alias, Location location) {
    super(name, alias, location);

    this.backpack = new Backpack();
  }

  public int getLevel() {
    return level;
  }

  public void levelUp() {
    this.level++;
  }
}
