public class ReviseProblems {

    //Target sum

    public int[] sum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for(int j = i+ 1; j < nums.length; j++){
                if(nums[i] + nums [j] == target){
                    return new int[] {i, j};
                }
            }

        }

        throw new IllegalArgumentException();
    }


    //Remove duplicate from sorted Arrays

    public int removeDuplicate(int[] nums){
        if(nums.length == 0) return 0;

        int prev = 0;
        for(int i = 1; i < nums.length ; i ++){
            if(nums[prev] != nums[i]){
                prev++;
                nums[prev] = nums[i];
            }
        }

        return prev + 1;
    }
}
