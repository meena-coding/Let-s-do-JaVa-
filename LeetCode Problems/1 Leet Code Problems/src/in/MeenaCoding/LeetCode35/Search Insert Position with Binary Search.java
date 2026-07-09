package in.MeenaCoding.LeetCode35;
import java.util.*;

//putting 2 end so it doesn't clash with other same name file

class SearchInsertPosition2 {

//    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//    You must write an algorithm with O(log n) runtime complexity.
//
//
//
//    Example 1:
//
//    Input: nums = [1,3,5,6], target = 5
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,3,5,6], target = 2
//    Output: 1
//    Example 3:
//
//    Input: nums = [1,3,5,6], target = 7
//    Output: 4


    public int searchInsert(int[] nums, int target){

        int beg = 0, end = nums.length - 1;
        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                beg = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end + 1;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SearchInsertPosition2 sol = new SearchInsertPosition2();

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Call searchInsert
        int result = sol.searchInsert(nums, target);

        // Output result
        System.out.println("Target should be at index: " + result);

        sc.close();

    }

}
