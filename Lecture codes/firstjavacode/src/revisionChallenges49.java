public class revisionChallenges49 {

    public static void main(String[] args) {

        //Create a program to get sum and average of 2D array
        System.out.println("Welcome to Sum and Average of 2D Array!\n");
        int[][] numArr = ArrayUtility.input2DArray();
        double sum = sum(numArr);
        double avg = avg(numArr);
        System.out.println("Sum of Elements of 2D Array is : "+ sum);
        System.out.println("Average of Elements of 2D Array is : "+ avg);
    }

    public static double sum(int[][] numArr){

        int i = 0;
        double sum = 0;
        while(i < numArr.length){
            int j = 0;

            while(j < numArr[i].length){
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg(int[][] numArr){

        if(numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;

        double size = rows * cols;
        return sum(numArr) / size;

    }
}
