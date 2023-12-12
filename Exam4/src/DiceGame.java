import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DiceGame {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for the dice that wil be used: ");
        int numSides = sc.nextInt();
        System.out.println("How many player will be playing?");
        int numPlayers = sc.nextInt();


        List<Player> players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name for Player " + (i + 1) + ": ");
            String playerName = sc.next();
            Die playerDie = new Die(numSides);
            Player player = new Player(playerName);
            players.add(player);
        }



    }

}
