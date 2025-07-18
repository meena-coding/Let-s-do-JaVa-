/**
 * Given an integer x, return true if x is
 * palindrome integer.

 * An integer is a palindrome when it reads
 * the same backward as forward.

 * For example, 121 is a palindrome while 123
 * is not.


 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to
 * right and from right to left.

 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads
 * -121. From right to left, it becomes 121-.
 * Therefor it is not a palindrome.

 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left.
 * Therefor it is not a palindrome.

 * Constraints:
 * -231 <= x <= 231 - 1
 */

class PalindromeNumber {

    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        if(n < 0) return false;

        while (temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(2121));
    }
}
