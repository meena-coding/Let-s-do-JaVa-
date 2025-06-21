import java.lang.reflect.Array;

class maxArray {
    public static void main(String[] args) {

        System.out.println("Welcome to finding the maximum\n");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(max < num)
                max = num;
        }
        System.out.println("Maximum Number is: " + max);

    }
}
