public class Main1 {
    public static void main(String[] args) {
       int [] studentScores = {85, 90, 75, 95, 80};
       int [] count = {1, 2, 3, 4, 5};
       for(int i = 0; i < studentScores.length; i++){
            System.out.println(count[i] + "番目の生徒：" + studentScores[i] + "点");
       }
    }
}
