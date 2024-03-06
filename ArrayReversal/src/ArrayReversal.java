import java.util.*;
import java.util.List;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialization of num
        int num = 0;
        //yes this uses a list, array would mean creating a new one every time, potentially creating dozens of arrays when only the last one is really used
        List<Integer> numsList = new ArrayList<>();

        //while loop to get multiple num
        while(true){
            //get new num for list if okay to do so
            if(num > -1 && numsList.size() < 100) {
                System.out.println("Please insert a positive integer (or -1 to quit): ");
                num = in.nextInt();
                if(num > -1) {
                    numsList.add(num);
                }
            //reverse numList and print at end
            } else{
                List<Integer> revList = new ArrayList<>(numsList);
                Collections.reverse(revList);
                System.out.println(revList);
                break;
            }
        }
    }
}