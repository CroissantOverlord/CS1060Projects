import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which beverage would you like? (Enter a Number): (1)Water (2)Coke (3)Coffee ");
        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println("Here is your Water!");
        }
        else if(answer == 2){
            System.out.println("Here is your Coke!");
        }
        else if(answer == 3){
            System.out.println("Here is your Coffee!");
        }
    }
}
