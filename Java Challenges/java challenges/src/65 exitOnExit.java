import java.util.Scanner;

class exitOnExit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter the Command: ");
            String command = sc.next();
            if(command.equals("exit")){
                break;
            }
        }
        System.out.println("You've successfully Exited.");
    }
}
