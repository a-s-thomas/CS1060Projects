import java.util.Random;
import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        //initiate loop to avoid having to rerun to do 'both'
        Scanner in = new Scanner(System.in);
        System.out.println("Which program would you like to run? Ticket (1) Chocolate (2) Quit (0): ");
        int select = in.nextInt();
        while (select != 0) {
            if (select == 1) {
                greenTicket();
                //return to top of loop
                System.out.println("Which program would you like to run? Ticket (1) Chocolate (2) Quit (0): ");
                select = in.nextInt();
            } else if (select == 2) {
                System.out.println("How many small chocolate bars?: ");
                int chocoS = in.nextInt();
                System.out.println("How many large chocolate bars?: ");
                int chocoL = in.nextInt();
                System.out.println("How many meed to be sold?: ");
                int goal = in.nextInt();
                makeChocolate(chocoS, chocoL, goal);
                System.out.println("Which program would you like to run? Ticket (1) Chocolate (2) Quit (0): ");
                select = in.nextInt();
            } else if (select == 3) {
                System.out.println("Please input the first number: ");
                int first = in.nextInt();
                System.out.println("Please input the second number: ");
                int second = in.nextInt();
                System.out.println("Please input the third number: ");
                int third = in.nextInt();
                greenTicketVerB(first, second, third);
                System.out.println("Which program would you like to run? Ticket (1) Chocolate (2) Quit (0): ");
                select = in.nextInt();
            } else {
                System.out.println("Which program would you like to run? Ticket (1) Chocolate (2) Quit (0): ");
                select = in.nextInt();
            }
        }

    }

    //randomized lotto ticket module gets three random numbers and compares them
    public static void greenTicket() {
        Random random = new Random();
        int lottoOne = random.nextInt(10);
        int lottoTwo = random.nextInt(10);
        int lottoThree = random.nextInt(10);
        if (lottoThree == lottoOne && lottoThree == lottoTwo) {
            System.out.println("(" + lottoOne + ", " + lottoTwo + ", " + lottoThree + ") 20");
        } else if (lottoThree == lottoOne || lottoThree == lottoTwo || lottoOne == lottoTwo) {
            System.out.println("(" + lottoOne + ", " + lottoTwo + ", " + lottoThree + ") 10");
        } else {
            System.out.println("(" + lottoOne + ", " + lottoTwo + ", " + lottoThree + ") 0");
        }
    }

    //non-random version of lotto (I figure random makes more sense for a lottery ticket, but just in case)
    public static void greenTicketVerB(int numOne, int numTwo, int numThree) {
        if (numThree == numOne && numThree == numTwo) {
            System.out.println("(" + numOne + ", " + numTwo + ", " + numThree + ") 20");
        } else if (numThree == numOne || numThree == numTwo || numOne == numTwo) {
            System.out.println("(" + numOne + ", " + numTwo + ", " + numThree + ") 10");
        } else {
            System.out.println("(" + numOne + ", " + numTwo + ", " + numThree + ") 0");
        }
    }

    //takes arguments for small and large bars and returns how many small bars need to be used if possible
    public static void makeChocolate(int sChoco, int lChoco, int goalP) {
        int result = goalP - lChoco * 5;
        if (result <= sChoco) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }
}