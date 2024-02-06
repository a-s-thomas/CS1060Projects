import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?:"); //query input 1 for greeting
        String name1 = in.next();
        System.out.println("Where are you from?:"); //query input 2 for greeting
        String from1 = in.next();
        System.out.println("How old are you?:"); //query input 3 for greeting
        int age1 = in.nextInt();
        System.out.println(greeter(name1, from1, age1)); //pass greeting inputs to method and print
        System.out.println("What do you like to do?:"); //query input for hobby
        String hobby = in.next();
        System.out.println(hobbies(hobby)); //pass hobby input to method and print
        System.out.println("How much would you like to donate today?:"); //query donation input
        double donation = in.nextInt();
        System.out.println(donationVal(donation)); //pass donation input to method and print

    }
    public static String greeter(String name, String from, int age){
        return("Hello " + name + ", " + age + ", from " + from + ".");
        //greeter returns a message including name, age, and where from
    }
    public static String hobbies(String something) {
        return("Have fun next time you " + something);
        //hobbies returns a message for inputted hobby
    }
    public static String donationVal(double amount){
        return("You will donate $" + amount + " today. Thank You!");
        //donationVal returns a message thanking the user for donating (assuming they do)
    }
}