abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Program3 {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);

        // Calculating and displaying the area
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}

