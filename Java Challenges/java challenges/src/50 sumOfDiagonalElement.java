class sumOfDiagonalElement {

    public static void main(String[] args) {

         //Create a Program to print the sum of Diagonal Element of 2D Array

        System.out.println("Welcome to sum of Diagonal Element.\n");
        int [][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.print("Sum of All the Diagonal Elements is : "+ sum);

    }

    public static long sumOfDiagonal(int [][] numArr){

        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;

        if(numArr.length % 2 != 0){
            int ind = numArr.length / 2;
            sum = sum - numArr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int [][] numArr){

        long sum = 0;
        int i = 0;

        while(i < numArr.length){

            sum = sum + numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int [][] numArr){

        long sum = 0;
        int i = 0;   //here i is row and j is column so here if i increase then j decreases.

        while(i < numArr.length){
            int col = numArr.length - 1 - i;
            sum = sum + numArr [i][col];
            i++;
        }
        return sum;
    }
}
