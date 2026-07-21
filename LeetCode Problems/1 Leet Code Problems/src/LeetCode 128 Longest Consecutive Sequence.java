import java.util.HashSet;
import java.util.Map;

class longestConsecutiveSequence {

    public int longestConsecutiveSeq(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){

            if(!set.contains(num -1)){
                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        longestConsecutiveSequence LCS = new longestConsecutiveSequence();

        int[] case1 = new int[]{1,3,4,5,6,7,8,3,2,1,3,4,5,6,7,8,9,10};

        System.out.println("This is the longest consecutive sequence in your Array:-" + LCS.longestConsecutiveSeq(case1));
    }

}
