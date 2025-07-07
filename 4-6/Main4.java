// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        // 発見したモンスターを管理するHashSet（重複なし）
        Set<String> discoveredMonsters = new HashSet<>();

        // 戦闘履歴を管理するArrayList（重複あり）
        List<String> battleHistory = new ArrayList<>();
        
        // 全モンスターのリスト
        Set<String> allMonsters = new HashSet<>();
        allMonsters.add("スライム");
        allMonsters.add("ドラゴン");
        allMonsters.add("ゴブリン");
        allMonsters.add("フェニックス");
        allMonsters.add("ユニコーン");

        // モンスターとの遭遇をシミュレート
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("スライム");
        battleHistory.add("ドラゴン");
        battleHistory.add("ドラゴン");
        battleHistory.add("ゴブリン");
        battleHistory.add("ゴブリン");
        
        // 戦闘履歴を記録
        discoveredMonsters.addAll(battleHistory);

        // 発見済みモンスターを表示
        System.out.println("発見済みモンスター：" + discoveredMonsters);
        System.out.println("発見済みモンスター数：" + discoveredMonsters.size());
        
        // スライムとの戦闘回数を計算
        int slime = 0;
        for (String name : battleHistory){
            if(name.equals("スライム"))
            slime++;
            
        }
        System.out.println("スライムとの戦闘回数：" + slime);
        
        // 未発見のモンスターを計算
        Set<String> undiscovered = new HashSet<>(allMonsters);
        undiscovered.removeAll(discoveredMonsters);
        System.out.println("未発見のモンスター：" + undiscovered);

    }
}
