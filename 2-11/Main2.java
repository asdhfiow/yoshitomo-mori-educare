public class Main2 {
    public static void main(String[] args) {
        int timesTable = 1;
        int count = 1;

        for(timesTable = 1; timesTable <= 5; timesTable++){
            for(count = 1; count <= 9; count++){
                System.out.println(timesTable + "*" + count + "=" + (timesTable * count));
            }
        }
        }
}
