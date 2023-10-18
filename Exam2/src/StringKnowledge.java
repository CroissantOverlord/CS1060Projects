public class StringKnowledge {

    public static void main (String[] args) {
        String string1 = "Apple";
        String string2 = "pLe";
        endOther(string1,string2);

    }

    public static void endOther(String string1, String string2) {
        String newString2 = string2.toLowerCase();
        if (string1.endsWith(newString2)) {
            boolean found = true;
            System.out.println(found);
        }
        else {
            boolean notFound = false;
            System.out.println(notFound);

        }

    }

    public static void findRepeats() {
        String toTest = "apple";


    }
}
