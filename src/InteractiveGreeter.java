import java.util.Scanner;
public class InteractiveGreeter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello stranger, what is your name?");//asks for the persons name
        String name = sc.nextLine();//reads the input from the previous line and puts it into the variable name
        System.out.println("Where are you from?");
        String place = sc.nextLine();
        System.out.println("How old are you?(In years)");
        String age = sc.nextLine();
        System.out.println("Hello " + name + " from " + place + " who is " + age + "." +
                " What do you like to do for fun?!");//outputs the name, place, and age of the person in a greeting sentence
        String answer = sc.nextLine();
        System.out.println(answer + " sounds like a lot of fun!");
        System.out.println("How much money are you willing to donate today?");
        int donate = sc.nextInt();//takes the number input from the previous line and puts it into the variable donate
        System.out.println("Thank you " + name + " for your donation of " + "$" + donate);//outputs a thanks for the donation using the donation amount and name
        System.out.println("Hope to see you again. Have a nice day!");//says goodbye




    }


}
