import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//This declares the scanner as the variable sc

        System.out.println("Type Fahrenheit Number");
        double fnumber = sc.nextDouble();//Assigns the number you type into the variable fnumber

        final double Kelvin = 273.15;
        double far = ((fnumber - 32) * 5/9);//Does the conversion and puts into the variable far
        double kel = (far + Kelvin);

        System.out.printf("Here's your Celsius number %.2f %n", far);//outputs the text and then the converted number in two decimal places
        System.out.printf("Here's your Kelvin number %.2f %n", kel);



    }
}
