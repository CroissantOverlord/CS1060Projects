import java.util.Scanner;//imports scanner from java library
public class BottlesOfBeer {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//Declares the scanner as the variable sc
        System.out.println("Please enter the starting number of bottles: ");// Asks for the number of bottles
        int numBottles = sc.nextInt();// takes the input of number of bottles and puts it into a variable

        if (numBottles < 0){//If the user puts in a number of bottles below 0 it will end the programs and ask for a valid number of bottles
            System.out.println("PLease enter a valid number of bottles");
            return;
        }

        for (int x = numBottles; x >= 0; x--) {//If x is greater than 0 it stays in the loop and also minuses one of the bottles each pass through the loop
            if (x >=3){//if x is greater than or equal to 0 it will out put the word bottles for correct plurality
                System.out.println( x + " bottles of beer on the wall, " +  x + " bottles of beer.\n" +
                        " Take one down and pass it around," + (x-1)  + " bottles of beer on the wall.");
            }
            else if (x == 2) {//if x equals 0 the word bottles change to bottle for correct plurality
                System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer.\n" +
                        " Take one down and pass it around," + (x - 1) + " bottle of beer on the wall.");
            }
            else if (x == 1) {
                System.out.println(x + " bottle of beer on the wall, " + x + " bottle of beer.\n" +
                        " Take one down and pass it around," + (x = 0) + " bottles of beer on the wall.");
            }
            if (x < 1 ) {
                System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer.\n" +
                        " Go to the store and buy some more, " + numBottles + " bottles of beer on the wall.");
            }




        }



    }
}
