package in.MeenaCoding.DSA.Sorting.Algos;

public class BubbleSort implements SortingAlgo{


    private static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Override
    public void sort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length -1 -i; j++) {
                if(nums[j] > nums[j + 1]){
                    swap(nums, j, j+1);
                }
            }
            printArray(nums);
        }
    }

    public static void main(String[] args) {

        int[] nums = {44,3,2,66,5,75,9};

        SortingAlgo sortingAlgo = new BubbleSort();
        sortingAlgo.sort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }

    public static void printArray(int[] nums){

        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
