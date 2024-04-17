import java.util.Scanner;

public class RecursiveAppend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please provide a string");
        String arg = in.next();
        System.out.println("How many times do you want it appended? (note, provides this number + 1): ");
        int arg2 = in.nextInt();
        System.out.println(appendNTimes(arg, arg2));
        System.out.println(appendNTimesIterative(arg,arg2));
    }

    public static String appendNTimes(String string, int times){
        if (times > 0) {
            return string + appendNTimes(string, times - 1);
        } else {
            return string;
        }
    }

    public static String appendNTimesIterative(String string, int times){
        String appString = string;
        for (int i = 0; i < times; i++) {
            appString = appString + string;
        }
        return appString;
    }
}