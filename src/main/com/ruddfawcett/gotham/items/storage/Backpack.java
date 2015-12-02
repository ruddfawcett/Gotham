package com.ruddfawcett.gotham.items.storage;

import java.util.List;
import java.util.ArrayList;

import com.ruddfawcett.gotham.items.Item;

public class Backpack {
  private final int MAX_ITEMS = 10;

  private List<Item> items;

  public Backpack() {
    this.items = new ArrayList<Item>();
  }

  public Backpack(List<Item> items) {
    this.items = items.subList(0, MAX_ITEMS);
  }

  public boolean add(Item item) {
    if (this.items.size() < MAX_ITEMS) {
      return this.items.add(item);
    }

    return false;
  }

  public boolean remove(Item item) {
    return this.items.remove(item);
  }

  public boolean isFull() {
    return this.items.size() < MAX_ITEMS;
  }

  public boolean isEmpty() {
    return this.items.size() == 0;
  }

  public void empty() {
    this.items.clear();
  }

  public List<Item> getItems() {
    return this.items;
  }

  @Override
  public String toString() {
    return "Backpack -> " + this.items;
  }
}
