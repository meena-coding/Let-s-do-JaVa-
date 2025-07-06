package in.MeenaCoding.DSA.Sorting.Algos;

public class MergeSort implements SortingAlgo{

    private void mergeSort(int[] nums){
        int n = nums.length;
        if(n < 2){
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[ i - mid] = nums[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(nums, left, right);
    }

    private void merge(int[] result , int[] first, int[] second){

        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length){

            if (first[i] <= second[j]){
                result[k++] = first[i++];
            }
            else{
                result[k++] = second[j++];
            }
        }

        while(i < first.length){
            result[k++] = first[i++];
        }
        while (j < second.length){
            result[k++] = second[j++];
        }

        }


    public static void main(String[] args) {

        int[] arr = {44,3,2,66,5,75,9};
        int n = arr.length;
        SortingAlgo sortingAlgo = new MergeSort();
        sortingAlgo.sort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr, n);
    }

    private static void printArray(int[] nums, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }

    @Override
    public void sort(int[] nums) {
        mergeSort(nums);
    }
}
