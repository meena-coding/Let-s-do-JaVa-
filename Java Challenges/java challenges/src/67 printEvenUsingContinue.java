import java.util.Scanner;

class printEvenUsingContinue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to print Even Numbers\n");
        System.out.print("Please Enter a Number: ");
        int num = input.nextInt();

        for (int i  = 1; i <= num ; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.print(i+" ");
        }

    }

}
