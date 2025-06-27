public class Circle extends Shape {

    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
    return radius * radius * 3.14;
    }
}
