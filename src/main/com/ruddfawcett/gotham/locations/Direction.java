package com.ruddfawcett.gotham.locations;

public enum Direction {
  North, East, South, West;

  public String toString() {
    return "Direction -> " + name();
  }
}
