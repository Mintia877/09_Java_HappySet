package org.example;

public class HappySet implements Printable {
  private Item main;
  private Item sub;
  private Item drink;

  public HappySet(Item main, Item sub, Item drink) {
    // nullチェック
    if (main == null || sub == null || drink == null) {
      throw new IllegalArgumentException("メインメニュー、サブメニュー、飲み物のいずれかが入力されていません。"
          + "注文する商品を選んでください。");
    }

    // 負の値チェック
    if (main.getPrice() < 0 || sub.getPrice() < 0 || drink.getPrice() < 0) {
      throw new IllegalArgumentException("商品の価格がマイナスになっています。修正してください。");

    }


    this.main = main;
    this.sub = sub;
    this.drink = drink;

  }

  // 小計を計算するメソッド
  public int getSubTotal() {

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


