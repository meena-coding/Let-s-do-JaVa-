/* Problem: Given an array of strings strs, group the anagrams together. You can return the answer in any order.



        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]

        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        Explanation:

        There is no string in strs that can be rearranged to form "bat".
        The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
        The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
        Example 2:

        Input: strs = [""]

        Output: [[""]]

        Example 3:

        Input: strs = ["a"]

        Output: [["a"]]



        Constraints:

        1 <= strs.length <= 104
        0 <= strs[i].length <= 100
        strs[i] consists of lowercase English letters. */





import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String [] strs){
        HashMap<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] s = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = solution.groupAnagrams(s);
        System.out.println(result);


    }
}
