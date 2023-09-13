import java.util.Scanner;//imports the scanner from the java library
public class GradeCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//This declares the scanner as the variable sc

        System.out.println("Please enter your number grade.");//asks for their number grade
        double grade = sc.nextDouble();//puts any integer the person entered into the variable grade

        if (grade >= 92) {//outputs the grade is A if the number in grade is greater than or equal to 92, if not it goes down to the next else if until it finds the right one
            System.out.println(" Your grade is an A.");
        }
        else if (grade >= 89){
            System.out.println(" Your grade is an A-.");

        }
        else if (grade >= 87){
            System.out.println(" Your grade is an B+.");

        }
        else if (grade >= 82){
            System.out.println(" Your grade is an B.");

        }
        else if (grade >= 79){
            System.out.println(" Your grade is an B-.");

        }
        else if (grade >= 77){
            System.out.println(" Your grade is an C+.");

        }
        else if (grade >= 72){
            System.out.println(" Your grade is an C.");

        }
        else if (grade >= 69){
            System.out.println(" Your grade is an C-.");

        }
        else if (grade >= 67){
            System.out.println(" Your grade is an D+.");

        }
        else if (grade >= 60){
            System.out.println(" Your grade is an D.");

        }
        else if (grade >= 0){
            System.out.println(" Your grade is an F. You just suck :(.");

        }
        else if (grade < 0){
            System.out.println(" Error, enter a number greater than or equal to 0.");//outputs a message telling the user to put in a number greater than or equal to 0

        }
    }
}
