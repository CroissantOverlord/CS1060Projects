import java.util.Scanner;
public class StringWorkshop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting string");
        String startingString = sc.next();

        while(true){
            System.out.println(
                    "Would you like to:\n" +
                            "1. Add content\n" +
                            "2. Check if string contains substring\n" +
                            "3. Output length\n" +
                            "4. Output substring after prefix\n" +
                            "5. Output substring before suffix\n" +
                            "6. Output substring between prefix and suffix\n" +
                            "7. Exit");

            int numberAnswer = sc.nextInt();

            if (numberAnswer == 1) {
                addingContent(sc, startingString);
                startingString += addedCont;
                System.out.println(startingString);
            }
            else if (numberAnswer == 2) {

            }
            else if (numberAnswer == 3) {
                outputLength(startingString);
            }
            else if (numberAnswer == 4){
                outputPrefix(startingString,sc);

            }
            else if (numberAnswer == 5){

            }
            else if (numberAnswer == 6){

            }
            else if (numberAnswer == 7){
                break;

            }


        }




    }

    public static String addingContent(Scanner sc, String startingString){
        System.out.print("");
        String addedCont = sc.next();
        return addedCont;
    }

    //public static boolean checkingSub (String startingString){


    //}

    public static String outputLength(String startingString){
        int stringLength = startingString.length();
        System.out.println("Your word is " + stringLength + " characters long");

        return startingString;
    }

    public static String outputPrefix(String startingString, Scanner sc){
        System.out.println("Prefix: ");
        String prefix = sc.next();
        int size = startingString.length();
        int index = startingString.indexOf(prefix);
        System.out.println(index);

        return startingString;

    }



}
