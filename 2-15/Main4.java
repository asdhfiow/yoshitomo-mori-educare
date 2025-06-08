
public class Main4{
    public static void main(String[] args){
        int [][] seats = new int[5][6];

        int[][] seat= {
            {0,0,1,0,0,0},
            {0,1,0,0,1,0},
            {0,0,0,0,0,0},
            {1,0,0,0,0,1},
            {0,0,1,0,0,0}
        };
        System.out.println("現在の座席状況：");
        for (int i = 0; i < seat.length; i++){
            for (int j = 0; j < seat[i].length; j++){
                System.out.print( "[" +  seat[i][j] + "]");
            }
            System.out.println();

        }
        int row = 2;
        int column = 3;
        if (row < 0 || row >= seats.length || column < 0 || column >= seats[0].length){
            System.out.println("無効な座席番号です");
        }else if(seat [row][column] == 1){
            System.out.println("その席はすでに予約されています");
        }else if(row == 2 && column == 3){
            System.out.println("3行4列の席を予約しました");
        }else{
            System.out.println((row + 1) + "行" + (column + 1) + "列の席を予約しました");
        }
    }
    }


