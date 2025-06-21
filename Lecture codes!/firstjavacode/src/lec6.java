import java.util.*;
public class lec6 {
    public static void main(String[] args){

        //Advanced pattern questions.

        //-----> Q.10 Butterfly pattern.

        //Upper half.
        /*int n = 4;
        for(int i=1;i<=n;i++){
            //First part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            //second part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower Half
        for(int i=n;i>=1;i--){
            //First part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            int space = 2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            //second part stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //-----> Q.11 Solid rhombus

        /*int n = 5;
        for(int i=1;i<=n;i++){
            int space = n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //-----> Q.12 Print number pyramid. (wese to n=5 hai but you can take input now.)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to print it's Pyramid:-");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int space = n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers- -> Print row no , row no times
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //---> Q.13 Palindromic pattern (Like same from forward and backward)
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //First half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //second half numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //----> Q.14 Diamond pattern.
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //left side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // right side stars
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //left side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // right side stars
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

    }
}
