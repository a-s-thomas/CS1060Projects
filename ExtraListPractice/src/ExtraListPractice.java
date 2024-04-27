import java.util.*;

public class ExtraListPractice {
    public static void main(String[] args) {
        //each one has its own scanner just so I don't have to worry about it messing up
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);

        reverseList();

        System.out.println("2: Please enter a string: ");
        String arg = in2.nextLine();
        stringToList(arg);

        System.out.println("3: please enter a start point: ");
        int start = in3.nextInt();
        System.out.println("Please enter an end point: ");
        int end = in3.nextInt();
        System.out.println("Please enter a step value: ");
        int step = in3.nextInt();
        createListWithBounds(start, end, step);

        List<String> stringList = new ArrayList<>();
        String string4 = "";
        while(!string4.equals("done")){
            System.out.println("4: Please insert a string (or 'done' to quit): ");
            string4 = in4.nextLine();
            if(!string4.equals("done")) {
                stringList.add(string4);
            }
        }
        findAndDestroyAllAmoebas(stringList);
    }

    public static void reverseList(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        List<Integer> numsList = new ArrayList<>();

        while(num > -1 && numsList.size() < 100){
            System.out.println("1: Please insert a positive integer (or -1 to quit): ");
            num = in.nextInt();
            if(num > -1) {
                numsList.add(num);
            }
        }
        List<Integer> revList = new ArrayList<>(numsList);
        Collections.reverse(revList);
        System.out.println(revList);
    }

    public static void stringToList(String arg){
        char[] stringList = new char[arg.length()];
        for (int i = 0; i < arg.length(); i++){
            stringList[i] = arg.charAt(i);
        }
        System.out.println(Arrays.toString(stringList));
    }

    public static void createListWithBounds(int start, int end, int step){
        double x = (double) (end - start) / step;
        int xInt = (int) x;
        if (x > xInt) {
            xInt++;
        }
        int[] boundList = new int[xInt];
        for (int i = 0; i < xInt; i++) {
            boundList[i] = start + (step * i);
        }
        System.out.println(Arrays.toString(boundList));
    }

    public static void findAndDestroyAllAmoebas(List<String> stringList){
        for (int i = 0; i < stringList.size();){
            String str = stringList.get(i);
            String strLower = str.toLowerCase();
            int index = strLower.indexOf("amoeba");
            if (index != -1){
                stringList.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(stringList);
    }
}