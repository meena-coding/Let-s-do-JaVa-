import java.util.Scanner;

class deleteNumberFromArray {

    public static void main(String[] args) {

        //Create a program that delete a user entered no. from the Array

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Array deletion.\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("\nEnter the Number You want to Delete : ");
        int numToDelete = sc.nextInt();
        int[] newArray = deleteNumber(numArray, numToDelete);

        System.out.print("\nHere is your newly printed Array.\n");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteNumber(int[] numArray, int numToDelete) {

        int occ = NoOfOccurrences.noOfOccurrences(numArray, numToDelete);

        if (occ == 0) {
            return numArray;
        }
        int newSize = numArray.length - occ;

        int[] newArray = new int[newSize];

        int i = 0, j = 0;
        while (i < numArray.length) {

            if (numArray[i] != numToDelete) {
                newArray[j] = numArray[i];
                j++;
            }
            i++;
        }
        return newArray;
    }

}
