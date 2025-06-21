public class revisionChallenges47 {

    public static void main(String[] args) {

        // Create a program to merge and print the already sorted Arrays.

        System.out.println("Welcome to sorted Array merger.\n");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        System.out.println("The merged sorted Array is : \n");
        int[] mergedArr = merged(arr1, arr2);
        ArrayUtility.displayArray(mergedArr);

    }

    public static int[] merged(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
