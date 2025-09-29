package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    // 商品を準備
    // メイン
    Item hamburger = new MainProduct("ハンバーガー", 230);
    Item cheeseburger = new MainProduct("チーズバーガー", 250);
    Item chickenNuggets = new MainProduct("チキンナゲット",270 );

    // サブ
    Item potato = new SubProduct("ポテト", 150);
    Item salad = new SubProduct("サラダ", 270);

    // ドリンク
    Item orangeJuice = new DrinkProduct("オレンジジュース", 120);
    Item appleJuice = new DrinkProduct("リンゴジュース", 150);
    Item vanillaShake = new DrinkProduct("バニラシェイク", 120);

    // 注文を印刷
    HappySet myOrder1 = new HappySet(cheeseburger, potato, orangeJuice);
    HappySet myOrder2 = new HappySet(hamburger, potato, vanillaShake);
    HappySet myOrder3 = new HappySet(chickenNuggets, potato, appleJuice);


    // レシートを印刷
    System.out.println("***** Happy Hamburger Shop *****");
    System.out.println("---- お買い上げありがとうございます ---");

    System.out.println("◎ハッピーセットのご注文番号1");
    myOrder1.printReceipt();

    System.out.println("◎ハッピーセットのご注文番号2");
    myOrder2.printReceipt();

    System.out.println("◎ハッピーセットのご注文番号3");
    myOrder3.printReceipt();

    // 総計を計算
    int totalSum = 0;
    totalSum += myOrder1.getGrandTotal();
    totalSum += myOrder2.getGrandTotal();
    totalSum += myOrder3.getGrandTotal();

    // 総計を印刷
    System.out.println("=====================");
    System.out.println("合計金額：　" + totalSum + "円");
    System.out.println("=====================");

  }
}