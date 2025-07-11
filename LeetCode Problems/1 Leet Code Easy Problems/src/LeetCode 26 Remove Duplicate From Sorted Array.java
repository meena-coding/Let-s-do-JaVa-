class removeDuplicateSortedArray {

    public int removeDuplicates(int[] nums){

        if(nums.length == 0) return 0;
        int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[prev] != nums[i]){
                nums[++prev] = nums[i];  //[++prev] means prev index is increased first.
            }
        }
        return prev + 1;
    }

    public static void main(String[] args) {
        removeDuplicateSortedArray n = new removeDuplicateSortedArray();
        int[] arr = new int[]{3,4,4,4,5,5,6,6,7};
        System.out.println(n.removeDuplicates(arr));
    }
}
