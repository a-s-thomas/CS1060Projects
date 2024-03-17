import java.util.Scanner;
import java.util.Arrays;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //second scanner because nextLine() is a picky baby
        Scanner inButAnnoying = new Scanner(System.in);
        System.out.println("Please select a program: string->array(1), array w/ bounds(2), quit(0)");
        int select = in.nextInt();
        //while loop for multi
        while (select != 0) {
            if (select == 1) {
                System.out.println("Please enter a string: ");
                String arg1 = inButAnnoying.nextLine();
                stringToArray(arg1);
            } else {
                System.out.println("please enter a start point: ");
                int startArg = in.nextInt();
                System.out.println("Please enter an end point: ");
                int endArg = in.nextInt();
                System.out.println("Please enter a step value: ");
                int stepArg = in.nextInt();
                generateArrayWithBounds(startArg, endArg, stepArg);
            }
            System.out.println("Please select a program: string->array(1), array w/ bounds(2), quit(0)");
            select = in.nextInt();
        }
        //nice little end message
        System.out.println("Thank you");

    }

    //stringToArray takes a string and places it in an array, then prints (with little fancy formatting)
    public static void stringToArray(String arg) {
        char[] strArr = new char[arg.length()];
        for (int i = 0; i < arg.length(); i++) {
            strArr[i] = arg.charAt(i);
        }
        System.out.println(Arrays.toString(strArr));

    }

    //this one takes the given start, end, and step values and makes a seq. with them
    public static void generateArrayWithBounds(int start, int end, int step) {
        //this part calculates the necessary length of the array
        double x = (double) (end - start) / step;
        int xInt = (int) x;
        if (x > xInt) {
            xInt++;
        }
        int[] stepper = new int[xInt];
        for (int i = 0; i < xInt; i++) {
            stepper[i] = start + (step * i);
        }
        System.out.println(Arrays.toString(stepper));
    }
}
