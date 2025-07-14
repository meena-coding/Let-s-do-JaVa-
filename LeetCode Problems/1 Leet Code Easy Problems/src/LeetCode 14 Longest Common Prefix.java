/**
 * Write a function to find the longest common
 * prefix string amongst an array of strings. If
 * there is no common prefix, return an empty
 * string "".
 * <p>
 * Example 1: Input: strs =
 * ["flower","flow","flight"] Output: "fl"
 * <p>
 * Example 2: Input: strs =
 * ["dogasdfasdf","racecar","car"] Output: ""
 * Explanation:
 * There is no common prefix among the input
 * strings.
 * <p>
 * <p>
 * Constraints: 1 <= strs.length <= 200 0 <=
 * strs[i].length <= 200 strs[i] consists of only
 * lower-case English letters.
 */


class LongestCommonPrefix {

    public String longestCommonPrefix(String[] str){
        String result = "";

        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 0; j < str.length; j++) {

                if(str[j].length() <= i || str[0].charAt(i) != str[j].charAt(i)){
                    return result;
                }

            }
            result += str[0].charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] arr = new String[]{"aryan","archi","arnav"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));

    }
}
