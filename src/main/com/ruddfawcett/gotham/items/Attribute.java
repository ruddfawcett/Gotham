package com.ruddfawcett.gotham.items;

public enum Attribute {
  HEAVY, LIGHT,
  BIG, SMALL,
  TALL, SHORT,
  CUBIC, ROUND;

  public String toString() {
    return "Property -> " + name().toLowerCase();
  }
}
