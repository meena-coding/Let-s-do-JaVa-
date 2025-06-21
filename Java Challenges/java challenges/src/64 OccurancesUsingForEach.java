import java.util.Scanner;

class OccurancesUsingForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Finding Occurrences\n");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now Enter the Number you want to Find: ");
        int num = sc.nextInt();
        int occ = countOccurances(arr,num);
        System.out.println("Your number was found: " + occ + " Times.");
    }

    public static int countOccurances(int[] arr, int num){

        int occ = 0;
        for(int nums : arr){
            if(nums == num){
                occ++;
            }
        }
        return occ;
    }
}
