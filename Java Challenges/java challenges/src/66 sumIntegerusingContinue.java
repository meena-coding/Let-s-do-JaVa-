import java.util.Scanner;

class sumIntegerusingContinue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to sum of all positive numbers\n");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;

        for(int num : arr){
            if(num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("sum of all Positive Number is: " + sum);
    }
}
