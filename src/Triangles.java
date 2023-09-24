import java.util.Scanner;
public class Triangles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(t){
            System.out.println("Enter the size: ");
            int size = sc.nextInt();
            while(true){

                if (size > 50 || size < 1){
                    System.out.println("Error, enter a number between 1-50");
                    continue;
                }
                if (size <= 50){
                    break;
                }
            }

            System.out.println("Enter the fill character: ");
            char c = sc.next().charAt(0);


        }






    }
}
