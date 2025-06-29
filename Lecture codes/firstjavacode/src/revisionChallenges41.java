import java.util.Scanner;

public class revisionChallenges41 {

    public static void main(String[] args) {

        //Create a Program that give the no of occurrences of an element in the Array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the No of occurrences Program.\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("\nNow Enter The Number you want to Find : ");
        int num = sc.nextInt();
        int occurrences = noOfOccurrences(numArray,num);
        System.out.println("\nYour Element was found "+ occurrences + " Times in the Array.");


    }


    public static int noOfOccurrences(int[] numArray, int num){
        int occ = 0;
        int i = 0;
        while(i < numArray.length){
            if(num == numArray[i])
                occ++;
            i++;
        }
        return occ;
    }
}
