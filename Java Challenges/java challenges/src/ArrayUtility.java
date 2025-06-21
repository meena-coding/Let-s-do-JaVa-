import java.util.Scanner;

public class ArrayUtility {
    //We can call this class whenever we want to use this Array code for any program. e.g. revisionChallenges40

    public static int[] inputArray(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the Size of Array You want : ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while(i < size){
            System.out.print("Please Enter Element No "+ (i+1)+ " : ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }

    public static String[] inputStringArray(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the Size of Array You want : ");
        int size = sc.nextInt();
        String[] words = new String[size];

        int i = 0;
        while(i < size){
            System.out.print("Please Enter Element No "+ (i+1)+ " : ");
            words[i] = sc.next();
            i++;
        }
        return words;
    }


    public static int [] [] input2DArray(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter the No. of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Please Enter the No. of Columns : ");
        int columns = sc.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while(i < rows){
            int j = 0;
            while (j < columns){
                System.out.print("Please Enter Element in Row "+ (i+1) + " : " + " Column " + (j + 1) + " : ");
                numArray[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }


    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
    }
}
