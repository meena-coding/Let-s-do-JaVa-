import java.util.*;
public class lec10 {
    public static void main(String [] args){

        // Learning Arrays in this lec. (non-primitive data type).

//        int[] marks = new int[4]; // or int marks[] = new int[4];
//        marks[1] = 45;
//        marks[2] = 50;
//        marks[3] = 44;
////        System.out.println(marks[2]);
////        System.out.println(marks[1]);
////        System.out.println(marks[3]);
//        for(int i=1;i<4;i++){
//            System.out.println(marks[i]);
//        }

        //let's create an array with taking inputs

        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println(" x found at index : "+i);
            }  //-----> This algorithm to search index is knows as Liner search(i.e going straight)
        } */ // in java we don't define value then it will store default value in empty space according to the data type like for int it will store 0, for boolean--> false, for float--> 0.0 and for string --> and empty string but in c++ it will store garbage value.


        //---> Home work Questions.

        //----> Q.1 Take an array of names as input from the user and print them on the screen.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want :- ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+" name you want to print : ");
            names[i] = sc.next();

        }
        System.out.println("\nYour Entered names are : \n");

        //output
        for(int i=0;i<size;i++){
            System.out.println("your "+(i+1)+" name is : "+names[i]);
        }*/  // Solved

        //----> Q.2 Find the maximum & minimum number in an array of integers.

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want : ");
        int size =  sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter "+size+" numbers : ");

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("minimum value : "+min);
        System.out.println("maximum value : "+max); */
        // Solved

        //----> Q.3 Take an array of numbers as input and check if it is an array sorted in ascending order.
        //Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        //       {3, 4, 6, 2} is not sorted in ascending order.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want : ");
        int size =  sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter "+size+" numbers : ");

        //input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for(int i=0;i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                isSorted = false;
            }
            System.out.println();

        }
        //output
        if(isSorted){
            System.out.println("The array is sorted in ascending order.");
        }else{
            System.out.println("The array is not sorted in ascending order.");
        } // Solved

    }
}
