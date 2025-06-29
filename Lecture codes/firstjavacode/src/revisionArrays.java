import java.util.*;
public class revisionArrays {
    public static void main(String[] args) {

        //welcome to Arrays

        /* int[] myMarks = new int[5];
        myMarks[0] = 55;
        myMarks[1] = 98;
        myMarks[2] = 81;
        myMarks[3] = 76;
        myMarks[4] = 99;

        System.out.println(myMarks[0]);
        System.out.println(myMarks[1]);
        System.out.println(myMarks[2]);
        System.out.println(myMarks[3]);
        System.out.println(myMarks[4]); */

        /*  int[] myMarks = {55, 44, 12, 99, 14};

        int index = 0;

        while(index < myMarks.length){
            System.out.println("Marks at index value of " + index +" is "+myMarks[index]);
            index++;
        } */


        // To create a program to search in the number in the Array

        /* int[] arr = {33,44,25,65,75,23,76,77,98,60,83,12,10,15};
        Scanner sc = new Scanner (System.in);
        System.out.println("welcome to Array searching.\n");
        System.out.print("Please Enter Your Number = ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound)
            System.out.println("Your Number is Found in the Array");
        else
            System.out.println("Your Number is Not Found in the Array"); */


        /* String[] names = new String[5];    //we can use Array for Strings too.
        names[0] = "Aryan";

        String[] newNames = {"bharat","Murti","Muniraj"}; */


        // 2d Arrays

        int [][] rollNo = new int[4][5];
        rollNo [2][3] = 55;
        rollNo [1][4] = 45;

        int [][] serialNO = {{33,4,3,55,54},{12,22,44,12,55}};
        System.out.println(serialNO[0].length);


    }

    public static boolean isFound(int[]arr, int num){

        int index = 0;
        while (index < arr.length){
            if(arr[index] == num)
                return true;
            index++;
        }

        return false;
    }

}
