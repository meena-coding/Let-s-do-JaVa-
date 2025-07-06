package in.MeenaCoding.DSA.Sorting.Algos;

public class QuickSort implements SortingAlgo{

    private static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int partition(int[] nums, int low, int high){

        int pivot = nums[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                swap(nums, i++ , j);
            }
        }
        swap(nums, i, high);
        return i;
    }

    private void quickSort(int[] nums, int low, int high){

        if(low < high){
            int partitionIndex = partition(nums, low, high);
            quickSort(nums,0,partitionIndex - 1);
            quickSort(nums,partitionIndex + 1, high);
        }

    }

    @Override
    public void sort(int[] nums) {

        quickSort(nums, 0 , nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {44,3,2,66,5,75,9};
        int n = nums.length;
        SortingAlgo sortingAlgo = new QuickSort();
        sortingAlgo.sort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums,n);
    }

    private static void printArray(int[] nums, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
}
