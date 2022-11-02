import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double randomNumber = Math.random()*6;
        int secretNumber = (int)randomNumber;
//        System.out.println(secretNumber);            //This line is for checking purposes

        System.out.println("I chose a number between 0 and 5. Try to guess it: ");
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();

        while(userGuess != secretNumber){
            System.out.println("Please try to guess it again: ");
            userGuess = scan.nextInt();
        }

        System.out.println("You got it!");

        scan.close();
    }
}
