public class Main3 {
    public static boolean validateUsername(String username) {
        // ここにコードを書いてください
        return username.matches("^[A-Za-z_0-9]{4,16}$") && !username.matches("^\\d+$"); 
    }

    public static boolean validatePassword(String password) {
        // ここにコードを書いてください
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }

    public static void main(String[] args) {
        // テストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        // ここにテスト用のコードを書いてください

        // usernamesのテスト
        for(String username : usernames){
            if(validateUsername(username)){
                System.out.println(username + "：有効");
            } else{
                System.out.println(username + "：無効");
            }
        }

        // passwordのテスト
        for(String password : passwords){
            if(validatePassword(password)){
                System.out.println(password + "有効");
            }else {
                System.out.println(password + "無効");

            }
        }
    }
}
