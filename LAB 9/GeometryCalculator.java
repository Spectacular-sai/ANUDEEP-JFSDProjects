package saijavafullstackdevelopement;
import java.util.Scanner;

public class GeometryCalculator {
	double AreaRectangle(double length, double width) {
        return length * width;
    }

    double AreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    double VolumeBox(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate area of a rectangle");
        System.out.println("2. Calculate area of a circle");
        System.out.println("3. Calculate volume of a box");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.next().charAt(0);

        GeometryCalculator calculator = new GeometryCalculator();

        switch (choice) {
            case '1':
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                double areaRectangle = calculator.AreaRectangle(length, width);
                System.out.println("Area of rectangle: " + areaRectangle);
                break;
            case '2':
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                double areaCircle = calculator.AreaCircle(radius);
                System.out.println("Area of circle: " + areaCircle);
                break;
            case '3':
                System.out.print("Enter length of box: ");
                double boxLength = scanner.nextDouble();
                System.out.print("Enter width of box: ");
                double boxWidth = scanner.nextDouble();
                System.out.print("Enter height of box: ");
                double boxHeight = scanner.nextDouble();
                double volumeBox = calculator.VolumeBox(boxLength, boxWidth, boxHeight);
                System.out.println("Volume of box: " + volumeBox);
                break;
            case '4':
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

       
    }

}
