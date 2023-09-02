import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type Fahrenheit Number");
        int number = sc.nextInt();


        System.out.println(number - 32 * 5/9);



    }
}
