import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Days Checker.\n");
        System.out.print("Please Enter the number of day in Week: ");
        int day = sc.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }

    public static void newSwitch(int day){

        String dayStr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "sunday";
            default -> "invalid day";
        };

        System.out.println(dayStr);

    }

    public static void oldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("It's a Monday.");
                break;
            case 2:
                System.out.println("It's a Tuesday");
                break;
            case 3:
                System.out.println("It's a Wednesday");
                break;
            case 4:
                System.out.println("It's a Thursday");
                break;
            case 5:
                System.out.println("It's a Friday");
                break;
            case 6:
                System.out.println("It's a Saturday");
                break;
            case 7:
                System.out.println("It's a Sunday");
                break;
            default:
                System.out.println("You entered a Invalid day");
                break;
        }
    }
}
