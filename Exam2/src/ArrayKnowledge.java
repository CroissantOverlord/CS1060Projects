import java.util.*;
public class ArrayKnowledge {
    public static void main (String[] args) {

        String string = "Airplane";
        stringToArray(string);



    }


    public static void stringToArray(String string) {

        char[] array = new char[string.length()];
        System.out.println("[");
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);

            System.out.println(" '" + array[i] + "',");

        }
        System.out.println("]");



    }
}
