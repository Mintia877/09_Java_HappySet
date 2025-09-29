package org.example;

public class HappySet implements Printable {
  private Item main;
  private Item sub;
  private Item drink;

  public HappySet(Item main, Item sub, Item drink) {
    this.main = main;
    this.sub = sub;
    this.drink = drink;

  }

  // 合計金額を外部から取得できるようにする
  public int getGrandTotal() {
    return main.getPrice() + sub.getPrice() + drink.getPrice();
  }

  // 合計金額を計算するメソッド
  private int getSubTotal() {

    return main.getPrice() + sub.getPrice() + drink.getPrice();
  }

  @Override
  public void printReceipt() {
    //System.out.println("--------------------");
    System.out.println("メイン： " + main.getName() + " (" + main.getPrice() + "円)");
    System.out.println("サブメニュー：　" + sub.getName() + " (" + sub.getPrice() + "円)");
    System.out.println("ドリンクメニュー：　" + drink.getName() + " (" + drink.getPrice() + "円)");
    System.out.println("--------------------");
    System.out.println("小計：　" + getSubTotal() + "円");
    System.out.println("--------------------");

  }
}


