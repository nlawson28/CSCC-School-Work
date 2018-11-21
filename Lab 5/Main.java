import java.util.Scanner;
import java.lang.Math;

//Nathan Lawson - Lab 5 Java program (Area & Perimeter Calculations)
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double radius;
        double area;
        double perimeter;

        System.out.println("Circle program");
        System.out.println("Enter the raidus of your circle: ");
        radius = input.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        perimeter = 2 * Math.PI * radius;
        System.out.println("The area of a circle with a radius of " + radius + " is " + area);
        System.out.println("The perimeter of a circle with a radius of " + radius + " is " + perimeter);
    }
}
