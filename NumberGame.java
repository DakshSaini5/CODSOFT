import java.util.Scanner;
import java.util.Random;


public class NumberGame {
    public static void main(String Args[]) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int targetnumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxattempts = 10;
        boolean GuessedCorrectly = false;

        System.out.println("Welcome To The Game Of Guessing!!!");
        System.out.println("You have " + maxattempts + " attempts to guess it.");

        while(attempts < maxattempts){
            System.out.println("Attemps" +(attempts+1)+"\nEnter The Guess Number :");
            guess = sc.nextInt();
            attempts++;


            if (targetnumber == guess) {
                GuessedCorrectly = true;
                System.out.println("Congratulations!!");
                break;
            }

            else if (guess < targetnumber){
                System.out.println("📈 Too Low.Try Again\n");
            }

            else if (guess > targetnumber){
                System.out.println("📉Too High.Try Again\n");
            }

        }
           if(!GuessedCorrectly){
            System.out.println("You've used all your attempts!");
            System.out.println("The correct number was: " + targetnumber);
           }
        System.out.println("THANKS FOR PLAYING!!");
        
    sc.close();

    }
}