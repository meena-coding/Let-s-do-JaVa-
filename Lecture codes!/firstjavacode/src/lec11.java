import java.util.*;
public class lec11 {
    public static void main(String[] args){

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];

        //input
        //rows
        System.out.println("Enter row x columns element : ");
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                 numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("You required matrix is given below : \n");

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }*/


        //-----> Q. Searching for an element x in a matrix.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns : ");
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];

        //input
        //rows
        System.out.println("Enter row x columns element : ");
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter no. x you want location of : \n");
        int x = sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location : "+"["+(i+1)+","+(j+1)+"]");
                }
                }

            }
            System.out.println();

    }
}
