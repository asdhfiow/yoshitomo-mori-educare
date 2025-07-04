public class Main1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String message = str1 + str2;
        System.out.println("元の文字列１：" + str1);
        System.out.println("元の文字列２：" + str2);
        System.out.println("連結後：" + message);

        String pickOut = message.substring(3,7);
        System.out.println("部分文字列（2-7）：" + pickOut);
    }
}
