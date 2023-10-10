import java.util.Scanner;
public class ArrayReversal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        getNumber(sc);





    }

    public static void getNumber(Scanner sc){
        int num;
        int times = 0;
        while(times <= 100) {
            System.out.println("Enter a value (-1 to stop program)");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("Error enter a positive number");
                continue;
            }
            break;
        }
        
    }




    }
}
