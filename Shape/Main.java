//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        while (true) {
            System.out.println("\nSelect a Shape to Calculate Area & Volume:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid (Square Base)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the Circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length of the Rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth of the Rectangle: ");
                    double breadth = scanner.nextDouble();
                    shape = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.print("Enter side of the Square: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius of the Sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    shape = new Sphere(sphereRadius);
                    break;
                case 5:
                    System.out.print("Enter radius of the Cylinder: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height of the Cylinder: ");
                    double cylinderHeight = scanner.nextDouble();
                    shape = new Cylinder(cylinderRadius, cylinderHeight);
                    break;
                case 6:
                    System.out.print("Enter base side of the Pyramid: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of the Pyramid: ");
                    double pyramidHeight = scanner.nextDouble();
                    shape = new EquilateralPyramid(base, pyramidHeight);
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            shape.calculateShape();
            shape.calculatePerimeter();
            if (shape instanceof Volume) {
                ((Volume) shape).calculateVolume();
            }
        }
    }
}
