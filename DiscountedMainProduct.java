package org.example;

public class DiscountedMainProduct extends MainProduct {
  private final int discount; // インスタンスごとに

  public DiscountedMainProduct(String name, int price, int discount) {
    // 親クラスのコンストラクタを呼び出して、名前と価格を初期化
    super(name, price);

    // 割引のバリテーション
    if (discount >= 0 && discount <= price) {
      this.discount = discount; // 割引額の初期化
    } else {
      throw new IllegalArgumentException("割引額は0以上で、価格以下である必要があります");

    }
  }

  @Override
  public int getPrice() {
    // 親クラスの価格から割引額を引く
    int discountedPrice = super.getPrice() - this.discount;

    return discountedPrice;
  }
}




