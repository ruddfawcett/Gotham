package com.ruddfawcett.gotham.items;

import java.util.List;

import com.ruddfawcett.gotham.items.Attribute;

public class Item {
  private String name;
  private String description;

  private List<Attribute> attributes;

  public Item(String name, String description, List<Attribute> attributes) {
    this.name = name;
    this.description = description;
    this.attributes = attributes;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public List<Attribute> getAttributes() {
    return this.attributes;
  }

  @Override
  public String toString() {
    return "[Item -> " + this.name + ": " + this.attributes + "]";
  }
}
