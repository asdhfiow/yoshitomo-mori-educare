// 親クラス
public abstract class Employee{
    protected String name;
    protected String job;

    public Employee(String name){
        this.name = name;
    }
    // 名前を取得するメソッド
    public String getName(){
        return this.name; // クラスが持っているnameを返す。引数はいらない。
    }
    // 役職名を取得するメソッド
    public String getRole(){
        return this.job; // クラスが持っているnameを返す。引数はいらない。
    }
    public abstract int calculateSalary();
}