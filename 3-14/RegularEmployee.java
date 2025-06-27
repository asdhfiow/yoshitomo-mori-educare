// 小クラス
public class RegularEmployee extends Employee{
    int baseSalary;
    String name;
    public RegularEmployee(String name,int baseSalary){
        super(name);
        this.baseSalary = baseSalary;
    }
    @Override       //getRoleメソッドをオーバーライドして、役職名を返す
    public String getRole(){
        return "正社員";
    }
    
    // calculateSalaryメソッドでbaseSalaryを返す
    public int calculateSalary(){
        return baseSalary;
    }
}
