import java.util.*;
public class lec5 {
    public static void main(String[] args){

//----> Print the pattern questions. ref lec 5 notes of apna college for questions.

        //-->Q.1 print solid rectangle of stars. or you can take input of n & m and print.
Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter no. of stars in ROW:-");
        int m = sc.nextInt();
        System.out.println("Enter no. of stars in Column:-");
        int n = sc.nextInt();

        //Outer loop
        for(int i=1; i<=m; i++){
            //Inner loop
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/

        //---> Q.2 Hollow rectangle

        /*int m = 5;
        int n = 4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                //cell --> (i,j)
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //---> Q.3 Half Pyramid

        /*int n = 4; // or sc.nextInt(); (to take input)
        //Outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if(i==n || j<=n || j==1 || i<=n){
                    System.out.print("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }*/

        //---> Q.4 Inverted Half Pyramid.

        /*int n = 4;
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //-----> Q.5 Inverted Half Pyramid (rotated by 180 degree)

        /*int n = 4;
        //Outer Loop
        for(int i=1;i<=n;i++){
            //inner loop--> to print spaces.
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop -->to print stars.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //----> Half pyramid with numbers.
        /*int n = 5; // or sc.nextInt(); (to take input)
        //Outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if(i==n || j<=n || j==1 || i<=n){
                    System.out.print(j);
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }*/

        //-----> Q.7 Inverted half pyramid with numbers.
        /*int n = 5;
        for(int i=n; i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        //---->Q.8 Floyd's Triangle
        /*int n = 5; // or sc.nextInt(); (to take input)
        int number=1;
        //Outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if(i==n || j<=n || j==1 || i<=n){
                    System.out.print(number+" ");
                    number++;
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }*/

        //-----> Q.9 Print 0-1 triangle

        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

        //----> Home works questions.
        //---> Q.1 solid rhombus (refer figure from lec 5 notes

        /*int n=5;
        int m=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=5;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //----> Q.2 Print a Number Pyramid.
        //Given questions are givne in lec6 advanced pattern questions.

    }
}
