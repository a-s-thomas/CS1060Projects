import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //scanner stuff to get input
        Scanner in = new Scanner(System.in);
        System.out.println("What is the grade?: ");
		double gradePercent = in.nextDouble();

        //conditionals to get output
        if(gradePercent >= 60){
            //divides between A/B and C/D
            if(gradePercent < 79){
                if(gradePercent < 69){
                    if(gradePercent < 67){
                        //print grade D if 60-67
                        System.out.println("Your grade is: D");
                    } else{
                        //print grade D+ if 67-69
                        System.out.println("Your grade is: D+");
                    }
                } else{
                    if(gradePercent < 72){
                        //print grade C- if 69-72
                        System.out.println("Your grade is: C-");
                    } else if(gradePercent < 77){
                        //print grade C if 72-77
                        System.out.println("Your grade is: C");
                    } else{
                        //print grade C+ if 77-79
                        System.out.println("Your grade is: C+");
                    }
                }
            } else{
                if(gradePercent < 89){
                    if(gradePercent < 82){
                        //print grade B- if 79-82
                        System.out.println("Your grade is: B-");
                    } else if(gradePercent < 87){
                        //print grade B if 82-87
                        System.out.println("Your grade is: B");
                    } else{
                        //print grade B+ if 87-89
                        System.out.println("Your grade is: B+");
                    }
                } else{
                    if(gradePercent < 92){
                        //print grade A- if 89-92
                        System.out.println("Your grade is: A-");
                    } else{
                        //print grade A if 92+
                        System.out.println("Your grade is: A");
                    }
                }
            }

        } else if(gradePercent >= 0){
            //print grade F if 0-60
            System.out.println("Your grade is: F");

        } else{
            //print error if below 0
            System.out.println("ERROR improper value");
        }
    }
}