package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    // 商品を準備
    // メイン
    Item hamburger = new MainProduct("ハンバーガー", 230);
    Item cheeseburger = new MainProduct("チーズバーガー", 250);
    Item chikenNuggets = new MainProduct("チキンナゲット",270 );

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
    HappySet myOrder3 = new HappySet(chikenNuggets, potato, appleJuice);


    // レシートを印刷
    System.out.println("------ レシート -----");
    myOrder1.printReceipt();
    myOrder2.printReceipt();
    myOrder3.printReceipt();


  }
}