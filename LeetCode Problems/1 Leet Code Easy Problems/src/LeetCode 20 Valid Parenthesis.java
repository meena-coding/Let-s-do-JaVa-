/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order.
 * <p>
 * <p>
 * Example 1: Input: s = "()" Output: true
 * <p>
 * Example 2: Input: s = "()[]{}" Output: true
 * <p>
 * Example 3: Input: s = "(]" Output: false
 * <p>
 * Constraints: 1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
 */

import java.util.Scanner;
import java.util.Stack;

class ValidParenthesis {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c){
                case '('://pass through
                case '{'://pass through
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.empty() || '(' != stack.pop()){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.empty() || '{' != stack.pop()){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.empty() || '[' != stack.pop()){
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid Input");
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("{()[}"));

    }

    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Taking the number of testcases
        while (t-- > 0) {
            int a = sc.nextInt();
            String s = sc.nextLine();
            sc.nextLine();

            // Your code here


            System.out.println(a);
            System.out.println(s);
        }
    }

}
