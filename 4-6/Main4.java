// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        // 発見したモンスターを管理するHashSet（重複なし）
        Set<String> monsters = new HashSet<>();

        // 戦闘履歴を管理するArrayList（重複あり）
        List<String> history = new ArrayList<>();
        
        // 全モンスターのリスト
        monsters.add("スライム");
        monsters.add("ドラゴン");
        monsters.add("ゴブリン");
        monsters.add("フェニックス");
        monsters.add("ユニコーン");
        
        // 戦闘履歴を記録
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("スライム");
        history.add("ドラゴン");
        history.add("ドラゴン");
        history.add("ゴブリン");
        history.add("ゴブリン");

        
        // 発見済みモンスターを表示
        Set<String> discovered = new HashSet<>(history);
        System.out.println("発見済みモンスター: " + discovered);
        System.out.println("発見済みモンスター数: " + discovered.size());
        
        // スライムとの戦闘回数を計算
        int slime = 0;
        for (String name : history){
            if(name.equals("スライム"))
            slime++;
            
        }
        System.out.println("スライムとの戦闘回数：" + slime);
        
        // 未発見のモンスターを計算
        Set<String> undiscovered = new HashSet<>(monsters);
        undiscovered.removeAll(discovered);
        System.out.println("未発見のモンスター: " + undiscovered);

    }
}
