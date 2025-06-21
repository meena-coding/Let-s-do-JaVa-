import java.util.*;
public class lec15 {

    public static void main(String[] args){

//        int n = 5; //0101
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int notBitMask = ~(bitMask);

//        if((bitMask & n)==0){
//            System.out.println("Bit was Zero");
//        }else{
//            System.out.println("Bit was one.");
//        }

        // to write code for set bit.
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);
//
//        //clear bit
//        int newNumber1 = notBitMask & n;
//        System.out.println(newNumber1);

        //update bit
        /*Scanner sc  = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1 : set , oper=0 : clear
        int n = 5; //--> 0101
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int notBitmask = ~(bitMask);
            int newNumber = notBitmask & n;
            System.out.println(newNumber);

        }*/

        //-----> Questions.

        //--> Q.1 Write a program to find if a number is a power of 2 or not

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. :-");
        int n = sc.nextInt();
        if(n>0 && (n & (n-1))==0){
            System.out.println(n + " is the power of 2");
        }else{
            System.out.println(n + " is not the power of 2");
        }*/


        //---> Q.2 Write a program to toggle a bit a position = “pos” in a number “n”.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to toggle bits in :- ");
        int n = sc.nextInt();
        System.out.print("Enter bits position to toggle :- ");
        int pos = sc.nextInt();
        int mask = 1<<pos;
        //toggled the bit using XOR operation
        int toggledNumber = n ^ mask;
        System.out.println("Number after a toggling a bit at position "+pos+" is : "+toggledNumber);




    }
}
