package in.MeenaCoding.DSA.Sorting.Algos;

import java.sql.Array;
import java.util.Scanner;

public class SelectionSort implements SortingAlgo{

    private static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Override
    public void sort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, minIndex, i);
        }
    }

    public static void main(String[] args) {

        int[] nums = {3,5,2,66,43,17,86,57};

        SortingAlgo sortingAlgo = new SelectionSort();
        sortingAlgo.sort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }

    private static void printArray(int[] nums){

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
