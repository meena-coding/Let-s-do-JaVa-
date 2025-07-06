package in.MeenaCoding.DSA.Sorting.Algos;

/*
 * implements binary search on sorted array.
 * Example:
 * sortedArr: -8, -5, 3, 4, 7, 11, 15
 * Number to find = 7
 * number to find = 1
 */


import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {-8, -5, 3, 4, 7, 11, 15};

        int[] arr;
        int n = sc.nextInt();
        arr = new int[n];
        

        System.out.println(search(arr,2));
    }

    public static int search(int[] sortedArr, int target){

        int beg = 0, end = sortedArr.length - 1;

        while (beg <= end){
            int mid = beg + (end - beg) / 2;
            if (target == sortedArr[mid]){
                return mid;
            }else if(target < sortedArr[mid]){
                end = mid -1;
            }else {
                beg = mid + 1;
            }
        }
        return -1;  //return -1 if number is not found.
    }
}
