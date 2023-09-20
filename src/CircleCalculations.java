import java.util.Scanner;//imports the scanner form the java library
public class CircleCalculations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//This declares the scanner as the variable sc

        System.out.println("Enter circle radius.");//prints out text saying Enter circle radius
        double radius = sc.nextDouble();//puts the number they entered into the variable radius
        double diameter = (2 * radius);//puts the calculation to convert radius into diameter into the variable diameter
        double area = (Math.PI * (radius * radius));
        double circ = (2 * Math.PI * radius);
        System.out.println("Diameter: " + diameter);// returns the calculated diameter from the diameter return function
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circ);
    }
    public static double diameter(double radius) {//makes a new function called diameter and pulls the variable radius for usage
        return (2 * radius);
    }
    public static double area(double radius) {
        return (Math.PI * (radius * radius));
    }
    public static double circumference(double radius) {
        return (2 * Math.PI * radius);
    }

}
