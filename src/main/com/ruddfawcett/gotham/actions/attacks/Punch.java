package com.ruddfawcett.gotham.actions.attacks;

import com.ruddfawcett.gotham.actions.attacks.Attack;

public class Punch extends Attack {
  public Punch(String name, String description) {
    super(name, description);

    this.damage = 10;
  }
}
