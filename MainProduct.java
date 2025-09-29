package org.example;

import java.math.BigDecimal;

public class MainProduct extends Product{

  public MainProduct(String name, BigDecimal price) {
    super(name, price); // 親クラスのコンストラクタを呼び出す
  }
}
