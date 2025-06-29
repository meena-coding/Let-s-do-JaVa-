public class revisionChallenges42 {

    public static void main(String[] args) {

        //Create a Program That prints the Maximum and Minimum Element of an Array.

        System.out.println("Welcome to Minimum and maximum Number Finder.\n");
        int[] numArray = ArrayUtility.inputArray();
        int min = minNum(numArray);
        int max = maxNum(numArray);
        System.out.print("\nMaximum Number in the Array is : "+ max);
        System.out.print("\n Minimum Number in the Array is : "+ min);
    }

    public static int maxNum(int[] numArray){

        if(numArray.length== 0){
            return Integer.MIN_VALUE;
        }

        int max = numArray[0];
        int i = 1;
        while(i < numArray.length){
            if(max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }

    public static int minNum(int[] numArray){

        /* if(numArray.length== 0){
            return Integer.MIN_VALUE;
        } */

        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < numArray.length){
            if(min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }

}
