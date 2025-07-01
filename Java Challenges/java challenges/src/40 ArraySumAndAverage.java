class ArraySumAndAverage {
    public static void main(String[] args) {


        //Create a Program that take input of array and print the sum and average elements

        System.out.println("Welcome to sum and Average of a array values!\n");

        int[] numArray = ArrayUtility.inputArray();

        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("\nSum of Your Numbers is : "+ sum);
        System.out.print("\nAverage of Your Numbers is : "+ avg);

    }

    public static long sum(int[] numArray) {
        int i = 0;
        long sum = 0;
        while(i < numArray.length){
            sum = sum + numArray[i];
            i++;
        }
        return sum;

    }

    public static double avg(int[] numArray){

        double avg = (double) sum(numArray) / (numArray.length);

        return avg;
    }
}
