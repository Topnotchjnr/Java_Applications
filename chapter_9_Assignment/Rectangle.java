package chapter_9_Assignment;

public class Rectangle extends Parallelogram{
    
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public double getArea() {
        // Calculate the area of the rectangle
        // ... (Implementation needed)
        return 0.0; // Placeholder
    }

    @Override
    public String toString() {
        return "Rectangle: " + getPoint1() + ", " + getPoint2() + ", " + getPoint3() + ", " + getPoint4();
    }
    
}
