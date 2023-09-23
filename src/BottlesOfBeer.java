import java.util.Scanner;
public class BottlesOfBeer {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the starting number of bottles: ");
        int numBottles = sc.nextInt();
        String bottles = ("bottles");

        for (int x = numBottles; x > 0; x--) {
            for (string y = bottles; y >;   )
            System.out.println( x + " bottles of beer on the wall, " +  x + " bottles of beer.\n" +
                    " Take one down and pass it around," + (x-1)  + " bottles of beer on the wall.");
        }

        System.out.println("\nYou need help");


    }
}
