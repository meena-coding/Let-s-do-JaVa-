public class revisionChallenges46 {

    public static void main(String[] args) {

        //To check if Array is palindrome or not

        System.out.println("Welcome to Palindrome Checker.\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPal = isPalindrome(numArr);
        if(isPal){
            System.out.println("\nYour Array is Palindrome.");
        }else
            System.out.println("\nYour Array is not Palindrome.");

    }

    public static boolean isPalindrome(int[] numArr){

        int i = 0;
        while(i < numArr.length /2 ){
            if(numArr[i] != numArr[(numArr.length - 1) - i ]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
