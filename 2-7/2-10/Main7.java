public class Main7 {
    public static void main(String[] args) {
        int key = 2;
        int pressCount = 2;

        String combo = key + "-" + pressCount;
        switch (combo){
            case "1-1":{
                System.out.println("A");
            }break;
            case "1-2":{
                System.out.println("B");
            }break;
            case "1-3": {
                System.out.println("C");
            }break;
        }
        switch (combo){
            case "2-1":{
                System.out.println("D");
            }break;
            case "2-2":{
                System.out.println("E");
            }break;
            case "2-3": {
                System.out.println("F");
            }break;
        default:{
            System.out.println("Invalid key");
        }
    }
}
}
