package org.example;

public class Product implements Item {
  private String name;
  private int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }


  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getPrice() {
    return this.price;
  }
}
