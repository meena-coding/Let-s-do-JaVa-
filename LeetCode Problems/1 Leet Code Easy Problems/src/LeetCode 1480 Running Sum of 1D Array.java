import java.util.Arrays;

class RunningSum {

    public int[] runningSum(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];
        for (int i = 1; i < n; i++) {
            result[i] = nums[i] +  result[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        RunningSum sum = new RunningSum();
        int[] a = new int[]{4,3,2,4,5,9};
        System.out.println(Arrays.toString(sum.runningSum(a)));
    }

}
