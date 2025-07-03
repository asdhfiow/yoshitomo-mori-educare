import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main4 {

    // イベントの名前と、イベントが始まる時間と終わる時間を定義
    private String eventName;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    // コンストラクタで、name、start, endを初期化。名前と始まる時間と終わる時間をコンストラクタで返す
    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    // getEventDurationメソッド
    public String getEventDuration() {

        // durationクラスで日付と時間をとってくる
        Duration duration = Duration.between(startTime, endTime);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        return days + "日と" + hours + "時間";
    }

    // 現地時間（東京）
    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.format(formatter);
    }

    // 協定世界時
    public String getUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.withZoneSameInstant(ZoneId.of("UTC")).format(formatter);
    }

    // mainメソッド
    public static void main(String[] args) {
        // ここにテスト用のコードを書いてください
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");

        ZonedDateTime start = ZonedDateTime.parse("2024年7月1日 10:00 JST", formatter);
        ZonedDateTime end = ZonedDateTime.parse("2024年7月15日 22:00 JST", formatter);

        Main4 main4 = new Main4("サマーフェスティバル", start, end);

        System.out.println("イベント: " + main4.eventName);
        System.out.println("開始: " + start.format(formatter));
        System.out.println("終了: " + end.format(formatter));
        System.out.println("期間: " + main4.getEventDuration());
        System.out.println("現地時間: " + main4.getLocalTime());
        System.out.println("UTC時間: " + main4.getUtcTime());
        }
}