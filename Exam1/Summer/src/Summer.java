import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //gets starting number
        System.out.println("please input numbers to add together: ");
        double num = in.nextDouble();
        //numAdd is total sum
        double numAdd = 0;
        //while loop adds together consecutive 'num's into numAdd
        while (num != 0) {
            numAdd = numAdd + num;
            System.out.println("please input numbers to add together: ");
            num = in.nextDouble();
            //prints total sum if user inputs 0
            if (num == 0) {
                System.out.println("total sum is: " + numAdd);
                break;
            }
        }
    }
}