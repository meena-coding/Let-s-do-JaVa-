package in.MeenaCoding.LeetCode1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            indexMap.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int numB = target - arr[i];
            int indexNumB = indexMap.getOrDefault(numB, -1);

            if(indexNumB != -1 && indexNumB != i){
                return new int[]{i, indexNumB};
            }
        }
        throw new IllegalArgumentException("Invalid Entry of Array");
    }

    public static void main(String[] args) {
        TwoSum index = new TwoSum();
        System.out.println(Arrays.toString(index.twoSum(new int[]{2,7,11,15},9)));
    }
}
