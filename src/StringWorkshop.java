import java.util.Scanner;
public class StringWorkshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, enter a starting string");
        String startingString = sc.next();

        while (true) {
            System.out.println(
                    "\n" +
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
                startingString += addingContent(sc,startingString);
                System.out.println(startingString);
            } else if (numberAnswer == 2) {
                checkForSub(startingString, sc);

            } else if (numberAnswer == 3) {
                outputLength(startingString);

            } else if (numberAnswer == 4) {
                outputPrefix(startingString, sc);

            } else if (numberAnswer == 5) {
                outputSuffix(startingString, sc);

            } else if (numberAnswer == 6) {
                outputBetweenSufPre(startingString, sc);

            } else if (numberAnswer == 7) {
                System.out.println("Bye!");
                break;

            }


        }


    }

    public static String addingContent(Scanner sc, String startingString) {//1
        sc.nextLine();
        String addedCont = sc.nextLine();
        return addedCont;
    }

    public static void checkForSub (String startingString, Scanner sc ) {//2
        sc.nextLine();
        System.out.println("Enter substring for checking");
        String substring = sc.nextLine();
        if (startingString.contains(substring)){
            System.out.println("Your string " + startingString + " does contain the substring " + substring);

        }
        else{
            System.out.println("Your string " + startingString + " does not contain the substring " + substring);
        }

    }

    public static void outputLength(String startingString) {//3
        int stringLength = startingString.length();
        System.out.println("Your word " + startingString +  " is " + stringLength + " characters long");
    }

    public static void outputPrefix(String startingString, Scanner sc){//4
        System.out.println("Prefix: ");
        String prefix = sc.next();
        int index = startingString.indexOf(prefix);
        if (index != -1) {
            String substringAfterPrefix = startingString.substring(index + prefix.length());
            System.out.println("Substring:" + substringAfterPrefix);
        }
        else {
            System.out.println("Prefix not found");
        }


    }

    public static void outputSuffix(String startingString, Scanner sc) {//5
        System.out.println("Suffix: ");
        String suffix = sc.next();
        int index = startingString.indexOf(suffix);
        if (index != -1) {
            String substringAfterSuffix = startingString.substring(0, index);
            System.out.println("Substring:" + substringAfterSuffix);
        }
        else {
            System.out.println("Suffix not found");
        }

    }

    public static void outputBetweenSufPre(String startingString, Scanner sc) {//6
        System.out.println("Prefix: ");
        String prefix = sc.next();
        System.out.println("Suffix: ");
        String suffix = sc.next();
        int indexPre = startingString.indexOf(prefix);
        int indexSuf = startingString.indexOf(suffix);
        if (indexPre != -1) {
            String substringAfterPreSuf = startingString.substring(indexPre + prefix.length() + 0, indexSuf);
            System.out.println("Substring:" + substringAfterPreSuf);
        }
        else {
            System.out.println("Prefix or Suffix not found");
        }


    }



}
