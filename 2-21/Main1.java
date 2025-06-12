public class Main1 {
    public static void main(String[] args) {
        String input = "Hello World";
        processString(input);
    }
    public static void processString(String input){
        String upper = input.toUpperCase();
        int length = input.length();
        System.out.println("入力：" + input);
        System.out.println("出力：" + upper);
        System.out.println("文字数：" + length);
    }
  
}
