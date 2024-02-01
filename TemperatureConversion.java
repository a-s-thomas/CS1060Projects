import java.util.Scanner;
//gets scanner for input

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input temperature:");
        double number = in.nextDouble();
        //setup scanner and get temperature value

        System.out.println("what scale is it? (C/F/K)");
        String letter = in.next();
        //get temperature scale

        if (letter.equals("C") || letter.equals("c")) {   //branch if input is Celsius
            double numberK = number + 273.15;
            System.out.println(numberK + " degrees Kelvin");
            double numberF = number * 1.8 + 32;
            System.out.println(numberF + " degrees Fahrenheit");
            //calculates and prints temperature in both Kelvin and Fahrenheit

        } else if (letter.equals("F") || letter.equals("f")) {   //branch if input is Fahrenheit
            double numberC = (number - 32) / 1.8;
            System.out.println(numberC + " degrees Celsius");
            double numberK = numberC + 273.15;
            System.out.println(numberK + " degrees Kelvin");
            //calculates and prints temperature in both Celsius and Kelvin

        } else {   //branch if input is Kelvin
            double numberC = number - 273.15;
            System.out.println(numberC + " degrees Celsius");
            double numberF = numberC * 1.8 + 32;
            System.out.println(numberF + " degrees Fahrenheit");
            //calculates and prints temperature in both Celsius and Fahrenheit

        }
    }
}