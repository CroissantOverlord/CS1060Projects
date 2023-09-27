public class TenMaker {

    public static void main(String[] args){
        int number1 = 4;
        int number2 = 6;

        if (makes10(number1, number2)){
            System.out.println(number1 + " and " + number2 + " add up to 10");
        } else {
            System.out.println(number1 + " and " + number2 + " do not add up to 10");
        }
    }
    public static boolean makes10(int number1, int number2){
        return number1 + number2 == 10;

    }
}
