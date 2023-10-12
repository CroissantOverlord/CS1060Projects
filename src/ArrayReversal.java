import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 0;

        int[] inputArray = new int[100];
        int arraySize = 0;

        while (times < 100) {
            int num = getNumber(sc);
            if (num < 0) {
                break;
            }
            inputArray[arraySize] = num;
            arraySize++;
            times++;
        }
        reverseArray(inputArray, arraySize);
        printArray(inputArray, arraySize);
    }

    public static int getNumber(Scanner sc) {
        System.out.println("Enter a value (-1 to stop program)");
        return sc.nextInt();
    }

    public static void reverseArray(int[] array, int size) {
        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = array[size - 1 - i];
        }

        System.arraycopy(reversedArray, 0, array, 0, size);
    }
    public static void printArray(int[] array, int size) {
        System.out.print("Your values in reverse order: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
