import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select a beverage; Water (1), Coke (2), Coffee (3): ");
        int select = in.nextInt();

        //outputs based on user input (2 = coke, 3 = coffee, anything else is water)
        if (select == 2) {
            System.out.println("You selected Coke");
        } else if (select == 3) {
            System.out.println("You selected Coffee");
        } else {
            System.out.println("You selected Water");
        }
    }
}