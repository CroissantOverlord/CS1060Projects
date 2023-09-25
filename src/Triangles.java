import java.util.Scanner;//imports scanner from library
public class Triangles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//declares scanner as variavle sc
        while (true){
            int size = getSize(sc);//declares that size it what getSize is
            char c = getChar(sc);//declares that c is what getChar is

            makeTriangle(size,c);//calls the method and prints out the triangle according to their answers

            System.out.println("Would your like to do it again? Y/N: ");//Ask if they want to play again
            String answer = sc.next();

            if (!answer.equalsIgnoreCase("Y")) {//if the letter Y is put in after the question it continues the loop but if anything else is put in it will end it
                break;
            }
        }
        System.out.println("Bye");
        
    }
    private static int getSize(Scanner sc){//method for getting the size of the triangle
        int size;
        while(true){
            System.out.println("Enter the size 1-50: ");//asks for the size of the triangle
            size = sc.nextInt();//puts their answer into the variable size

            if (size > 50 || size < 1){//if they put in a number out of 1-50 its says error and resets the loop until they put in a right number
                System.out.println("Error, enter a number between 1-50");
                continue;
            }
                break;
        }
        return size;
    }
    private static char getChar(Scanner sc){//method for getting the character for triangle

        System.out.println("Enter the fill character: ");//asks them to pick a character for the triangle
        char c = sc.next().charAt(0);//reads the first character in their answer and puts it into c
        return c;
    }
    private static void makeTriangle(int size, char c) {//method for printing out the triangle with the desired size and character
        for (int i = 1; i <= size; i++) {
            // Prints the leading spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print("  ");
            }

            // Prints the filled character and spaces between them
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(c);
                if (j < 2 * i - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();//makes a new line
        }
    }
}
