import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt user for circle radius
        System.out.println("What is the radius of the circle?: ");
        double rads = in.nextDouble();
        //pass radius input to methods to calculate diameter, circumference, and area, and print result
        System.out.println("Diameter: " + getDiameter(rads));
        System.out.println("Circumference: " + getCircumference(rads));
        System.out.println("Area: " + getArea(rads));
    }

    //calculate diameter based on given argument
    public static double getDiameter(double rad) {
        return (rad * 2);
    }

    //calculate circumference based on given argument
    public static double getCircumference(double rad) {
        return (rad * 2 * Math.PI);
    }

    //calculate area based on given argument
    public static double getArea(double rad) {
        return (rad * rad * Math.PI);
    }
}