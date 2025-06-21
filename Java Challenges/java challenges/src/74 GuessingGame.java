import java.util.Scanner;

class GuessingGame {

    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * guess number. The number that player guessed
     * @return
     * - Negative if the guessed number is lower
     * - 0 if the guessed number is correct
     * - positive if the guessed number is higher
     */

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("\nWelcome to Guessing the number. Please Enter the number between 1-100");

        int guess;
        int result;

        do{
            System.out.print("\nGuess the Number: ");
            guess = sc.nextInt();
            result = game.guess(guess);

            if(result == 0){
                System.out.print("Congratulations You've Guessed the Correct Number.");
            } else if (result < 0) {
                System.out.print("Please Guess Higher.");
            } else {
                System.out.print("Please Guess Lower.");
            }
        }while (guess != 0);
    }
}
