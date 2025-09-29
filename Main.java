package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    // 商品を準備
    // メイン
    Item humberger = new Product("ハンバーガー", 230);
    Item cheeseburger = new Product("チーズバーガー", 250);
    Item chikenNuggers = new Product("チキンナゲット",270 );

    // サブ
    Item potato = new Product("ポテト", 150);
    Item salad = new Product("サラダ", 270);

    // ドリンク
    Item orangeJuice = new Product("オレンジジュース", 120);
    Item appleJuice = new Product("リンゴジュース", 150);
    Item fantaGrapes = new Product("ファンタグレープ", 120);
    Item milk = new Product("牛乳", 160);
    Item vanillaShake = new Product("バニラシェイク", 120);

    // 注文を印刷
    HappySet myOrder = new HappySet(cheeseburger, potato, milk);


    // レシートを印刷
    myOrder.printReceipt();


  }
}