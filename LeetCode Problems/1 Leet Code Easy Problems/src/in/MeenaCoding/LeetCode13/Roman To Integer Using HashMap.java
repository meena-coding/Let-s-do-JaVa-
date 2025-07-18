package in.MeenaCoding.LeetCode13;

import java.util.HashMap;
import java.util.Map;

class RomanToIntegerUsingHashMap {

    Map<Character, Integer> SYMBOLS = new HashMap<>();
    {
        SYMBOLS.put('I',1);
        SYMBOLS.put('V',5);
        SYMBOLS.put('X',10);
        SYMBOLS.put('L',50);
        SYMBOLS.put('C',100);
        SYMBOLS.put('D',500);
        SYMBOLS.put('M',1000);
    }

    public int romanToInt(String roman){
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            char current = roman.charAt(i);
            int currentVal = SYMBOLS.get(current);
            int nextValue = 0;

            if(i + 1 < roman.length()){
                char nextChar = roman.charAt(i + 1);
                nextValue = SYMBOLS.get(nextChar);
            }
            if(nextValue > currentVal){
                result += nextValue - currentVal;
                i++;
            }else{
                result += currentVal;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToIntegerUsingHashMap romanToIntegerUsingHashMap = new RomanToIntegerUsingHashMap();

        System.out.println(romanToIntegerUsingHashMap.romanToInt("CXV"));
    }
}
