import java.util.Scanner;

public class LargestPowerOf2MoreThanN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please provide a number");
        int arg = in.nextInt();

        System.out.println(powerOf2GreaterThanN(arg));
        System.out.println(powerOf2GreaterThanNIterative(arg));
    }

    //wouldn't it be the smallest power of 2 greater than N?
    public static int powerOf2GreaterThanN(int n) {
        return powerOf2GreaterThanN(n, 2);
    }

    //I don't know if this counts, but I don't know how to have it keep track without a second argument
    public static int powerOf2GreaterThanN(int n, int two) {
       if (two <= n){
           return powerOf2GreaterThanN(n, two * 2);
       }else {
           return two;
       }
    }

    public static int powerOf2GreaterThanNIterative(int n) {
        int twos = 2;
        while(twos <= n){
            twos = twos * 2;
        }
        return twos;
    }
}
