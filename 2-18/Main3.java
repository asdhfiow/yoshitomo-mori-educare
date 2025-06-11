public class Main3 {
    public static void main(String[] args){
        String input ="Hello";
        String reversed = reverse(input);
        System.out.println( "入力：" + "\"" + input + "\"");
        System.out.println("出力：" + "\"" + reversed + "\"");
    }   
    public static String reverse(String input){
        String reversed = new StringBuilder(input).reverse().toString();

        return reversed;
    }
}
