import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //initial variable so inner while loop doesn't complain
        int size = 0;

        //confirmation variable controls loop that allows for multiple triangles
        String confirmation = "y";

        //while loop allows for creating a new triangle
        while ((confirmation.equals("y") || confirmation.equals("Y"))) {
            //get triangle size and fill, while loop ensures size is between 1-50
            while (size <= 0 || size > 50) {
                System.out.print("Enter triangle size (1-50): ");
                size = in.nextInt();
            }
            System.out.print("Enter triangle fill: ");
            char fill = in.next().charAt(0);

            //run method to print triangle
            printTriangle(size, fill);
            System.out.println("Would you like another triangle (Y/N)?: ");
            confirmation = in.next();
            size = 0;
        }

    }

    //prints single line of triangle
    public static void printTriangleLine(int sizeL, char fillL) {
        for (int count = 0; count <= sizeL; count += 1) {
            System.out.print(fillL + " ");
        }
    }

    //calls printTriangleLine repeatedly to print whole triangle
    public static void printTriangle(int sizeT, char fillT) {
        for (int count = sizeT; count > 0; count -= 1) {
            printSpace(count - 1);
            printTriangleLine((sizeT - count), fillT);
            System.out.println();
        }
    }

    //prints spaces for upper lines
    public static void printSpace(int sizeS) {
        for (int count = sizeS - 1; count >= 0; count -= 1) {
            System.out.print(" ");
        }
    }
}