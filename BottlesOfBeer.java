import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many bottles of beer?: ");
        int bottles = in.nextInt();

        for (int count = bottles; count >= 0; count -= 1) {
            if (count > 2) {
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (count - 1) + " bottles of beer on the wall.");
                System.out.println();
            } else if (count == 2) {
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
                System.out.println();
            } else if (count == 1) {
                System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer.");
                System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
                System.out.println();
            } else {
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out.println("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
                System.out.println();
            }
        }

    }
}