import java.util.Scanner;

class monthSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Month Printer\n");
        System.out.print("Please Enter the Number of month : ");
        int num = sc.nextInt();

        switch (num){

            case 1 :
                System.out.println("This is the Month of january");
                break;
            case 2 :
                System.out.println("This is the Month of February");
                break;
            case 3 :
                System.out.println("This is the Month of March");
                break;
            case 4 :
                System.out.println("This is the Month of April");
                break;
            case 5 :
                System.out.println("This is the Month of May");
                break;
            case 6 :
                System.out.println("This is the Month of June");
                break;
            case 7 :
                System.out.println("This is the Month of July");
                break;
            case 8 :
                System.out.println("This is the Month of August");
                break;
            case 9 :
                System.out.println("This is the Month of September");
                break;
            case 10 :
                System.out.println("This is the Month of October");
                break;
            case 11 :
                System.out.println("This is the Month of November");
                break;
            case 12 :
                System.out.println("This is the Month of December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
