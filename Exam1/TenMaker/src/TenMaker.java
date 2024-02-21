import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //gets two numbers from user
        System.out.println("Please input first number: ");
        int num1 = in.nextInt();
        System.out.println("Please input second number: ");
        int num2 = in.nextInt();

        //prints message saying if two numbers add up to ten
        if (makes10(num1, num2)) {
            System.out.println("The two numbers add up to 10");
        } else {
            System.out.println("The two numbers do not add up to 10");
        }
    }

    //method adds two numbers and returns if true or false
    public static boolean makes10(int arg1, int arg2) {
        return arg1 + arg2 == 10;
    }
}