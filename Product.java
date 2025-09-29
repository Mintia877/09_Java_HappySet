package org.example;

import java.math.BigDecimal;

public class Product implements Item {
  private String name;
  private BigDecimal price;

  public Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }


  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public BigDecimal getPrice() {
    return this.price;
  }
}
