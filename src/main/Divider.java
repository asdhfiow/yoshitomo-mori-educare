package main;

public class Divider {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("ゼロで除算できません");
        }
        return a / b;
    }
}
