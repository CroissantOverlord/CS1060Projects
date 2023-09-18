import java.util.Scanner;//imports the scanner form the java library
public class CircleCalculations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//This declares the scanner as the variable sc

        System.out.println("Enter circle radius.");//prints out text saying Enter circle radius
        double radius = sc.nextDouble();//puts the number they entered into the variable radius
        diameter(radius);//calls the function diameter
        area(radius);//calls the function area
        circumference(radius);//calls the function circumference
    }
    public static void diameter(double radius) {//makes a new function called diameter and pulls the variable radius for usage

        double diameter = (2 * radius);// takes the radius and calculates the diameter by multiplying it by 2 and puts the calcutaion into the variable diameter
        System.out.println("Diameter: " + diameter);// prints out the diameter
    }
    public static void area(double radius) {
        double area = (Math.PI * (radius * radius));
        System.out.println("Area: " + area);
    }
    public static void circumference(double radius) {
        double circ = (2 * Math.PI * radius);
        System.out.println("Circumference: " + circ);
    }

}
