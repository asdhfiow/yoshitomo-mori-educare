public class Main4 {
    public static void main(String[] args){
    Weapon weapon = new Weapon(); // Weaponクラスのインスタンスを作成

    weapon.setWeapon("伝説の剣", 100);//伝説の剣の攻撃力を１００に設定

    //武器を10回使用
        for(int i = 0; i < 11; i++){
            weapon.use(); 
        }

    //武器を修理
    weapon.repair();

    //修理後に武器を使用
        for(int i = 0; i < 1; i++){
            weapon.use(); 
        }
    }
}

