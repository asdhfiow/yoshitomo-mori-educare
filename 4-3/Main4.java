import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main4 {

    // フィールド
    private String eventName;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    // コンストラクタ
    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    public String getEventDuration() {
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

        // ZonedDateTime型変数start、endに時刻を取得してくるメソッドを入れる。
        ZonedDateTime start = ZonedDateTime.of(2024,7,1, 10,00,00,00, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime end = ZonedDateTime.of(2024,7,15,22,00,00,00,  ZoneId.of("Asia/Tokyo"));

        Main4 main4 = new Main4("サマーフェスティバル", start, end);

        System.out.println("イベント: " + main4.eventName);
        System.out.println("開始: " + start.format(formatter));
        System.out.println("終了: " + end.format(formatter));
        System.out.println("期間: " + main4.getEventDuration());
        System.out.println("現地時間: " + main4.getLocalTime());
        System.out.println("UTC時間: " + main4.getUtcTime());
        }
}
