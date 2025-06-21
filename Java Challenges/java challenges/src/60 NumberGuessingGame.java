import java.util.Scanner;

class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number guessing game");
        int num = 5 , guess;

        do{
            System.out.print("Please guess the Number between 0 to 10 : ");
            guess = sc.nextInt();
        }while(guess != num);
        System.out.println("congratulations You've Guessed the Correct Number.");
    }
}
