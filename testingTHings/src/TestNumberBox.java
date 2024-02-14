import java.util.Scanner;

public class TestNumberBox {
    public static void main(String[] args) {
        //get rows and columns
        Scanner in = new Scanner(System.in);
        System.out.println("How many rows do you want?: ");
        int rows = in.nextInt();
        System.out.println("How many columns do you want?: ");
        int columns = in.nextInt();
        //prints rows and columns
        printRows(rows, columns);

    }

    //print number x times based on columns requested
    public static void getColumns(int columnNum, int number) {
        //both of these ended up getting pretty complicated as I adjusted the code to get what I initially had in mind, which is needlessly complicated, but I think looks pretty cool
        for (int count = number + 1; count < columnNum; count += 1) {
            System.out.print(count + " "); 
        }
    }

    //print columns into rows based on rows requested
    public static void printRows(int rowNum, int columnVar) {
        for (int counter = 0; counter < rowNum; counter += 1) {
            System.out.println();
            columnVar += 1;
            getColumns(columnVar,counter);

        }
    }
}
