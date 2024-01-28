package oopsconcepts;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        Shape triangle1 = new Triangle(5.0, 3.0);
        System.out.println("Area: " + triangle1.area());
    }
}
