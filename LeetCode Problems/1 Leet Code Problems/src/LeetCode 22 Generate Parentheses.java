/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.



Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]


Constraints:

1 <= n <= 8*/

import java.util.*;
class generateParentheses {

    private void generate(String current, int open, int close, int n , List<String> ans){

        if(open == n && close == n){
            ans.add(current);
            return;
        }

        if(open < n){
            generate(current + "(", open + 1, close, n , ans);
        }

        if(close < open){
            generate(current + ")", open, close + 1, n, ans);
        }
    }

    public List<String> generateParenthesesSolution(int n){
        List<String> ans = new ArrayList<>();
        generate("",0,0,n,ans);
        return ans;
    }

    public static void main(String[] args) {
        generateParentheses case1 = new generateParentheses();
        List<String> ans = new ArrayList<>();

        ans = case1.generateParenthesesSolution(2);

        System.out.println(ans);

    }
}
