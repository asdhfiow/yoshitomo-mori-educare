import java.util.Arrays;

public class Main4 {
    public static void main(String[] args){
        int [] price = {100, 200, 300};
        int [] quantities = {1, 2, 3};

        int[] totals = calculateTotal(price, quantities);

        System.out.println("商品価格: " + Arrays.toString(price) + ", 数量: " + Arrays.toString(quantities));
        System.out.println("合計金額: " + Arrays.toString(totals));
    }

    public static int[] calculateTotal(int[] price, int[] quantities){
        int[] result = new int[price.length]; 

        for (int i = 0; i < price.length; i++) {
            int subtotal = price[i] * quantities[i];       
            int taxIncluded = (int)(subtotal * 1.08);      
            result[i] = taxIncluded; 
        }

        return result; 
    }
}
