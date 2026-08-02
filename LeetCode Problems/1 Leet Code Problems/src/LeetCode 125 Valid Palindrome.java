
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
        Example 3:

        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.


        Constraints:

        1 <= s.length <= 2 * 105
        s consists only of printable ASCII characters.*/


import java.util.Arrays;

class ValidPalindrome {

    public boolean isPalindrome(String s){

        int left = 0;
        int right = s.length() -1;

        while(left < right){

            //skip invalid character from left

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            //skip invalid character from right

            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            //now both character are valid

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            
            if(leftChar != rightChar){
                return false;
            }
            
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome checkPalindrome = new ValidPalindrome();
        
        String case1 = "A man, a plan, a canal: Panama";
        
        boolean result = checkPalindrome.isPalindrome(case1);

        System.out.println(result);


        
    }


}
