package oopsconcepts;

public class Rectangle extends Shape {
	
    private double length;
    private double width;
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12.5, 10);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + ((Rectangle) rectangle).calculatePerimeter());
    }
}

