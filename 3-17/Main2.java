public class Main2 {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("太郎");
        stu.setScore(85);
        System.out.println(stu.getName() + "さんの点数；" + stu.getScore());

        stu.setName("太郎");
        stu.setScore(102398);

        stu.setName("asd;lfkjasasd;lfkjadsfasdfdf"); 
        stu.setScore(100);
}
}