public class Main2 {
    public static void main(String[] args){
        int score = 85;
        getScore(score);
    }

    public static void getScore(int score){
        if (score >= 80){
            System.out.println("成績：優");
        }else if(score >= 70){
            System.out.println("成績：良");
        }else if(score >= 60){
            System.out.println("成績：可");
        }else {
            System.out.println("成績：不可");
        }
    }
}
