public class Main4 {
    public static void main(String[] args) {
        int[][] seats = {
            {0, 0, 1, 0, 0, 0}, 
            {0, 1, 0, 0, 1, 0}, 
            {0, 0, 0, 0, 0, 0}, 
            {1, 0, 0, 0, 0, 1}, 
            {0, 0, 1, 0, 0, 0}  
        };

        int row = 2;   
        int column = 3; 

        System.out.println("現在の座席状況:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }


                if (row < 0 || row >= seats.length || column < 0 || column >= seats[0].length) {
            System.out.println("無効な座席番号です");
        } else if (seats[row][column] == 1) {
            System.out.println("指定された座席はすでに予約済みです");
        } else {
            seats[row][column] = 1; 
            System.out.println((row + 1) + "行" + (column + 1) + "列の座席を予約しました");
        }
    }
}
