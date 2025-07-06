package in.MeenaCoding.DSA.Sorting.Algos;

public class InsertionSort implements SortingAlgo{
    @Override
    public void sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {  //start i from 1 considering 0th index is already sorted

            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }

    public static void main(String[] args) {

        int[] nums = {4,3,6,66,75,11,2};

        SortingAlgo sortingAlgo = new InsertionSort();
        sortingAlgo.sort(nums);
        BubbleSort.printArray(nums);



    }
}
