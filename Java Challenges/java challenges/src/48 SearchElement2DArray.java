import java.util.Scanner;

class SearchElement2DArray {

    public static void main(String[] args) {

    //Create a program to search Element in 2D Array.

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to 2D Array search.!\n");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Now Enter the Number You want to Search.");
        int num = sc.nextInt();
        boolean isFound = search(numArr, num);

        if (isFound){
            System.out.println("Your number was found.");
        }
        else {
            System.out.println("Your number was not found.");
}
    }

    public static boolean search(int [][] numArr, int num){

        int i = 0;

        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){

                if(num == numArr[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }


}
