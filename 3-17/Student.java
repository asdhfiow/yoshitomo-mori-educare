public class Student {
    private String name;
    private int score;

    public void setScore(int score){
        if(score < 0 || score > 100){
            System.out.println("エラー：点数は0-100の範囲で設定してください");
        }else{
            this.score = score;
        }
    }
    public void setName(String name){
        if(name.length() < 1 || name.length() > 20){
            System.out.println("エラー：名前は0〜20文字で入力してください");
        }else {
            this.name = name;
        }
    }


    public int getScore(){
        return this.score;
    }
    
    public String getName(){
        return this.name;
    }
}
