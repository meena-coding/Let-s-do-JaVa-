import java.util.*;
class PatternPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to pattern Printer.\n");
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        rightHalfPyramid(row);
        reverseRightHalfPyramid(row);
        leftHalfPyramid(row);

    }


    public static void rightHalfPyramid(int maxRow) {

        System.out.println("\n Here is the Right half Pyramid\n");

        int row = 0;
        while (row < maxRow) {
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }


    public static void reverseRightHalfPyramid(int maxRow){

        System.out.println("\n Here is the Reverse Right half Pyramid\n");

        int row = maxRow;
        while (row > 0){
            int i = 0;
            while (i < row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row--;
        }
    }


    public static void leftHalfPyramid(int maxRow){

        System.out.println("\n Here is the left half Pyramid\n");

        int row = maxRow;
        while (row > 0){

            //This loop prints spaces
            int j = 0;
            while (j < row- 1 ){
                System.out.print("  ");
                j++;
            }


            //This loop prints stars
            int i = 0;
            while (i <= (maxRow - row)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }
}
