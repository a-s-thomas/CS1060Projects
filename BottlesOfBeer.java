import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get number of bottles
        System.out.print("How many bottles of beer?: ");
        int bottles = in.nextInt();

        for (int count = bottles; count >= 0; count -= 1) {
            if (count > 2) {
                //n to 3 bottles, count and count - 1 are plural
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (count - 1) + " bottles of beer on the wall.");
                System.out.println();
            } else if (count == 2) {
                //2 bottles, count - 1 is singular (can only be 1)
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.");
                System.out.println();
            } else if (count == 1) {
                //1 bottle, count is singular (count - 1 can only be 0)
                System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer.");
                System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.");
                System.out.println();
            } else {
                //no more bottles, final verse, resets to n
                System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
                System.out.println("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
                System.out.println();
            }
        }

    }
}
