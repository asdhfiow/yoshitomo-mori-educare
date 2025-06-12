public class Main2 {
    public static void main(String[] args){

        int radius = 5;
        calculateCircle(radius);
    }  
    public static void calculateCircle(double radius){
       double squareMeasure = radius * radius * Math.PI;
       double circumference = 2 * radius * Math.PI;

       System.out.println("円の面積：" + squareMeasure);
       System.out.println("円周：" + circumference);
    }
  
}
