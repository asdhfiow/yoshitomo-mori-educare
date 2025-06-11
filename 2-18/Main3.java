public class Main3 {
    public static void main(String[] args){
        String input ="Hello";
        String reversed = reverse(input);
        System.out.println(input);
        System.out.println(reversed);
    }   
    public static String reverse(String input){
        String reversed = new StringBuilder("Hello").reverse().toString();

        return reversed;
    }
}
