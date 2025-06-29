public class revisionChallenges43 {

    public static void main(String[] args) {

        //To show if the Given Elements of Array are sorted or not.

        System.out.println("Welcome to the sorted element Checker.\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec= isDecreasing(numArr);

        if(isInc || isDec){
            System.out.println("\nYour elements Are Sorted.");
        }
        else {
            System.out.println("\nYour elements are not sorted.");
        }
    }
    public static boolean isIncreasing(int [] numArr){

        int i = 1;
        while(i < numArr.length){
            if(numArr[i] < numArr[i-1]){

                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int [] numArr){

        int i = 1;
        while(i < numArr.length){
            if(numArr[i - 1] < numArr[i]){
                return false;
            }
            i++;
        }
        return true;

    }

}
