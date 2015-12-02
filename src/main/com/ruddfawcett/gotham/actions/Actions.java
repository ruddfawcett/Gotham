package com.ruddfawcett.gotham.actions;

import com.ruddfawcett.gotham.locations.Direction;
import com.ruddfawcett.gotham.actions.attacks.Attack;
import com.ruddfawcett.gotham.entities.Entity;

public interface Actions {
  public void walk(Direction direction);
  public void attack(Attack attack, Entity target);
}
