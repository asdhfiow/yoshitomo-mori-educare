public class Main4{
    public static void main(String[] args){
        int [][] seats = new int[5][6];

        int[][] seat= {
            {0,0,1,0,0,0},
            {0,1,0,0,1,0},
            {0,0,0,1,0,0},
            {1,0,0,0,0,1},
            {0,0,1,0,0,0}
        };
        
        int row = 2;
        int column = 3;
        if (row < 0 || row >= seat.length || column < 0 || column >= seat[0].length){
            System.out.println("無効な座席番号です");
        }else if(seats [row][column] == 1){
            System.out.println("その席はすでに予約されています");
        }else {
            System.out.println((row + 1) + "行" + (column + 1) + "列の席を予約しました");
        }
    }
}

