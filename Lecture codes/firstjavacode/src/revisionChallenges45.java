public class revisionChallenges45 {

    public static void main(String[] args) {

        //To create a program to get the reverse of an Array

        System.out.println("Welcome to Reverse of an Array.\n");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("\nYour reversed Array is given below :\n");
        ArrayUtility.displayArray(numArr);

    }

    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1 ) - i] = swap;
            i++;
        }

    }
}
