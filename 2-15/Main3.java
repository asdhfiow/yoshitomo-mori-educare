public class Main3 {
    public static void main(String[] args) {
        double[] temparatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        String[] day = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"};
        double totalTemparature = 0;

        for (double temparature: temparatures){
            {
                totalTemparature += temparature;
            }
    }
        for(int i = 0; i < day.length; i++){
           System.out.println(day[i] + "の気温：" + temparatures[i] + "度");
        }
     
    System.out.println("平均気温：" + totalTemparature / 7);

}
}
