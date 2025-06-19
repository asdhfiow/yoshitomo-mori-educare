class BankAccount {

int balance;//残高のフィールド

//残高を取得するメソッド
void getBalance(){
    System.out.println("残高：" + balance + "円");
}
//お金を預け、預けた金額を表示するメソッド
void deposit(int amount){
    balance += amount; //残高に預けた金額を加算
System.out.println(amount + "円預けました");
}
//お金を引き出すメソッド（残高が不足している場合はメッセージを表示）
void withdrow(int amount){
if (balance >= amount){
    balance -= amount; //残高から引き出した金額を減算
    System.out.println(amount + "円引き出しました");
}else {
    System.out.println("残高が不足しています")
}
}

}
