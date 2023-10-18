public class LogicKnowledge {

    public static void main (String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        greenTicket(a,b,c);

        int largeFivePound = 5;
        int small = 13;
        int goal = 15;
        makeChocolate(largeFivePound,small,goal);


    }

    public static void greenTicket(int a, int b, int c) {



        if ((a == b) && (a == c) || (b == a) && (b == c) || (c == a) && (c == b)){
            System.out.println("20");

        }

        else if (a == b || a == c || b == c){
            System.out.println("10");

        }
        else {
            System.out.println("0");
        }

    }

    public static void makeChocolate(int largeFivePound, int small, int goal) {
        int large = 1 * largeFivePound;
        int remainingGoalAfterLarge = goal - large;//5

        if (large == 15) {
            System.out.println(small);

        }
        else if (small >= remainingGoalAfterLarge) {
            int smallAfter = small - remainingGoalAfterLarge;
            System.out.println(smallAfter);
        }
        else {
            System.out.println(-1);
        }
    }
}
