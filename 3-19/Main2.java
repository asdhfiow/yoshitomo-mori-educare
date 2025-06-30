public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "田中太郎");
        Student s2 = new Student(1001, "佐藤花子");
        Student s3 = new Student(1002, "山田次郎");

        if (s1.equals(s2)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }

        if (s1.equals(s3)) {
            System.out.println("同一の学生です");
        } else {
            System.out.println("違う学生です");
        }
    }
}
