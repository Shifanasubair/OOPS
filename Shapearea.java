import java.util.Scanner;
class AreaCalculator 
{
    public double areaCircle(double radius) 
    {
        return Math.PI * radius * radius; 
    }
    public double areaRectangle(double length, double width)
    {
        return length * width;
    }
    public double areaTriangle(double base, double height) 
    {
        return 0.5 * base * height;
    }
}
public class Shapearea 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        if (choice == 1) 
        {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = calculator.areaCircle(radius);
            System.out.println("Area of Circle: " + area);
        } 
        else if (choice == 2) 
        {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double area = calculator.areaRectangle(length, width);
            System.out.println("Area of Rectangle: " + area);
        } 
        else if (choice == 3) 
        {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            double area = calculator.areaTriangle(base, height);
            System.out.println("Area of Triangle: " + area);
        } 
        else
        {
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }
        scanner.close();
    }
}

