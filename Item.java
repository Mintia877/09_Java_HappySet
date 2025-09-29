package org.example;

import java.math.BigDecimal;

public interface Item {
  String getName(); // 商品名の取得
  BigDecimal getPrice(); // 価格を取得する
}