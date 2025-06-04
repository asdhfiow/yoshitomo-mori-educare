public class Main7 {
        public static void main(String[] args) {
            int key = 2;
            int pressCount = 2;
    
            switch (key) {
                case 1:
                    switch (pressCount) {
                        case 1:
                            System.out.println("A");
                            break;
                        case 2:
                            System.out.println("B");
                            break;
                        default:
                            System.out.println("C"); // key1でその他の押下回数
                    }
                    break;
    
                case 2:
                    switch (pressCount) {
                        case 1:
                            System.out.println("D");
                            break;
                        case 2:
                            System.out.println("E");
                            break;
                        default:
                            System.out.println("F"); // key2でその他の押下回数
                    }
                    break;
    
                default:
                    System.out.println("invalid key"); // key1・key2以外
            }
        }
    }
    
    
