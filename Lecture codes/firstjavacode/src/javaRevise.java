import java.util.Arrays;
import java.util.*;
public class javaRevise {
    public static void main(String[] args) {

//        System.out.println("hello java! i'm back");

//        int[] marks = new int[4];
//        marks[0]= 80;
//        marks[1]= 69;
//        marks[2]= 76;
//        marks[3]= 98;

        // or we can directly add arrays without new string for example

        int[] marks = {80, 69, 76, 98};  // and then use it accordingly

//        System.out.println(marks[0]);
//
        //sort  --> putting in ascending order
        Arrays.sort(marks);
//        System.out.println(marks[0]);

        // if to create 2d arrays
        int[][] finalmarks = {{34, 43, 22}, {44, 55, 11}};
//        System.out.println(finalmarks[0][2]);


        //now let's see casting
        double price = 100;
        double finalprice = price + 18.15;
//        System.out.println(finalprice);

        //if
        int p = 100;
        int fp = p + (int) 18.13;  //casting means convert double value in integer value in output
        // System.out.println(fp);  //output will remove all decimal value of double and result integer


        // now let's see constants

//        int age= 34;
//         age= 21;
//         age= 55; // here as we can see , we can edit values throughout

        final double PI = 3.14;  //to set the permanent value , use "final" keyword

        //operators

        int numb = 2;
//        numb++;
//        System.out.println(-- numb);
//        System.out.println(numb);

        //calling "maths" functions, let's say

//        System.out.println(Math.max(4,5));
//        System.out.println(Math.min(4,5));
//        System.out.println(Math.random());  //This will print a random value everytime we run
//        System.out.println((int)(Math.random()*100));

        //taking a input method

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your age: ");
//        int age = sc.nextInt();
//        System.out.println("Your age is: "+age);


        //Now the comparison operator
        // a==b
        // a!=b
        // a > b
        // a < b
        // a >= b
        // a <= b

        // Conditional statement ,  FOR EG
//        boolean isSunUp = false; // or true
//        if(isSunUp==true)
//            System.out.println("it's Day.");
//        else
//            System.out.println("It's night.");


        // LOGICAL OPERATOR
        // '&&' --> "and" both statement should be true
        //  '||' --> "or" any of the one statement should be true
        // '!' --> "negation" it converts true into false and vice versa


        // now let's see the conditional statement

        /*Scanner sc = new Scanner(System.in);
        // pencil = 5, pen = 10 , notebook = 40
        System.out.println("Enter amount of cash you have: ");
        int cash = sc.nextInt();
        if(cash<5){
            System.out.println("Cannot buy anything from here!");
            System.out.println("GET SOME MORE CASH NIGGA!");
        }
        else if (cash>5 && cash<10){
            System.out.println("You can only buy Pencil.");
        }
        else if (cash>=10 && cash<40){
            System.out.println("You can buy pencil or pen");
        }
        else
            System.out.println("Can get anything you want.");*/


        //Another conditional statement is 'SWITCH'

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter the no. of month: ");  // let;s take till 5 for eg
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("The"+n+"rd month is:- "+"January");   //IT will continuously print if break isn't added
                break;
            case 2:
                System.out.println("The"+n+"rd month is:- "+"February");
                break;
            case 3:
                System.out.println("The"+n+"rd month is:- "+"March");
                break;
            case 4:
                System.out.println("The"+n+"rd month is:- "+"April");
                break;
            case 5:
                System.out.println("The"+n+"rd month is:- "+"May");
                break;
        }*/


        //escape sequence   for example

        /*System.out.println("i'm aryan and my surname is \"Meena\"");  //here if i wanna print --> "Meena"*/

        // other imp escape sequnces are \n for new line, \t for tab space, \b for backspace etc.


        // star pyramid using escape sequence

       /* System.out.println("*\n"+"* *\n"+"* * *\n"+"* * * *\n"+"* * * * *\n\n");
        System.out.println("* * * * *\n"+"* * * *\n"+"* * *\n"+"* * \n"+"* ");
        System.out.println("        *\n"+"      * *\n"+"    * * *\n"+"  * * * *\n"+"* * * * *");*/

        /*System.out.println("\t--->Welcome to swapping <---");
        System.out.print("Enter the value of 'a' :- ");
        int a = sc.nextInt();
        System.out.print("Enter the value of 'b' :- ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("\nyou swapped no. are:- \n");
        System.out.println("a = "+ a + " and "+"b = "+ b);*/


        // Take two no. and show result of all arithmetic progression

        /*System.out.print("Enter the value of A : ");
        int A= sc.nextInt();
        System.out.print("Enter the value of B : ");
        int B = sc.nextInt();
        double add= A + B;
        double sub= A - B;
        double multi= A * B;
        double div= A / B;
        double remainder= A % B;
        System.out.println("A + B = "+add);
        System.out.println("A - B = "+sub);
        System.out.println("A x B = "+multi);
        System.out.println("A / B = "+div);
        System.out.println("A % B = "+remainder);*/


        // program to calculate product of two floating point numbers
        /* System.out.print("Enter value of A : ");
        float a = sc.nextFloat();
        System.out.print("Enter value of B : ");
        float b = sc.nextFloat();
        System.out.println("A x B = "+ a*b);  */


        // calculate parameter of a Rectangle (A+B+C+D)

       /* System.out.print("Enter Length of Rectangle (l in cm) = ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth of Rectangle (b in cm) = ");
        float b = sc.nextFloat();
        float P = l + b;
        System.out.println("The parameter of Given Rectangle is = "+ 2 * P+" cm"); */

        //similarly to calculate the area of TRIANGLE   formula = 1/2(b x h)

        /* System.out.print("Enter Height of Triangle (h in cm) = ");
        float h = sc.nextFloat();
        System.out.print("Enter Base of Triangle (b in cm) = ");
        float b = sc.nextFloat();
        float A = (1/2f)*(b*h);
        System.out.println("The AREA of the given Triangle is = "+A); */


        // program to calculate simple interest formula = P x T x R /100

        /* System.out.print("Enter the principle amount (P) = ");
        double P = sc.nextDouble();
        System.out.print("Enter the time tenure (T) = ");
        double T = sc.nextDouble();
        System.out.print("Enter the Rate of interest (R) = ");
        double R = sc.nextDouble();

        double Interest = (P*T*R)/100;

        System.out.println("Your simple interest amount is = "+Interest); */

        // Program  to Calculate compound interest    formula C.I = P(1+R/100)t

        /* System.out.print("Enter the principle amount (P) = ");
        double P = sc.nextDouble();
        System.out.print("Enter the time tenure (T) = ");
        double T = sc.nextDouble();
        System.out.print("Enter the Rate of interest (R) = ");
        double R = sc.nextDouble();

        double A= P*Math.pow((1+R/100),T);
        double CI = A - P;

        System.out.println("The Compound Interest Amount is = "+CI); */


        //Create a program to convert Fahrenheit to Celsius formula is  C = (F-32)5/9

       /* System.out.print("Enter the temperature in Fahrenheit (F) = ");
        double F = sc.nextDouble();
        double C = (F - 32) * (5 / 9f);
        System.out.println("The Temperature in Celsius is (C) = "+C); */


        //Ticket discount calculator
        /* System.out.println("\t---> Welcome to Ticket discount calculator <---");
        System.out.print("Please Enter your Age : ");
        int age = sc.nextInt();

        System.out.println("Are you a Female? (true/false)");
        boolean isFemale = sc.nextBoolean();

        if(age < 5) {
            System.out.println("You will get 75% Discount.");
        }
        else if(isFemale ){
            System.out.println("You will get 50% Discount.");
        }
        else if (!isFemale && age >  50){
            System.out.println("You will get 25% Discount.");
        }else{
            System.out.println("You will get no Discount.");
        }    */



        // Create a Program that determines if a number is positive,negative or zero

        /* System.out.print("Enter the Number : ");
        double x =  sc.nextDouble();
        if(x<0)
            System.out.println("Entered number is Negative.");
        else if(x==0)
            System.out.println("Entered number is zero.");
        else
            System.out.println("Entered number is Positive."); */



        //-->Create a program if number is ODD or EVEN

        /* System.out.print("Enter The Number : ");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Entered Numbed is EVEN.");
        }else
            System.out.println("Entered number is ODD."); */



        //--> Create a Program that determines the Greatest of the Three numbers.

        /* System.out.print("Enter the First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println(a + " Is the Greatest Number of all Three.");
        else if (b > a && b >c)
            System.out.println(b + " Is the Greatest Number of all Three.");
        else
            System.out.println(c + " Is the Greatest NUmber of all Three");  */


        //--> Creates Program that calculate grades based on marks.

        /* System.out.print("Enter Your Received Marks (in %) :- ");
        int mark = sc.nextInt();

        if(mark>90)
            System.out.println("Your Grade is  ' A '");
        else if (mark>75)
            System.out.println("Your Grade is  ' B '");
        else if (mark>60)
            System.out.println("Your Grade is ' c '");
        else if (mark>30)
            System.out.println("Your Grade is ' d '");
        else
            System.out.println("Your Grade is ' F '. You Failed the Exam."); */



        //--> Create a Program that Categorize a Peron in Different Age Group.

        /* System.out.print("Enter Your Age :- ");
        int age = sc.nextInt();

        if(age >= 60)
            System.out.println("You Come in Senior Citizen Group.");
        else if (age > 20)
            System.out.println("You Are An ADULT.");
        else if (age > 13)
            System.out.println("You are a Teen.");
        else
            System.out.println("You are Kid."); */


        //--> Create a Program that Determines if The given year is LEAP year.

        /* System.out.print("Enter The Year : ");
        int year = sc.nextInt();

        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0))
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is Not a Leap Year."); */



        //--> Showcase two numbers that shows the Bitwise Operator for ' & ' i.e. AND

        /* System.out.print("Enter the first Number : ");
        int first = sc.nextInt();
        System.out.print("Enter the first Number : ");
        int second = sc.nextInt();

        int result = first & second;
        System.out.println("Result is : "+result); */


        //---> Now for ' | ' i.e. OR

        /* System.out.print("Enter the first Number : ");
        int first = sc.nextInt();
        System.out.print("Enter the first Number : ");
        int second = sc.nextInt();

        int result = first | second;
        System.out.println("Result is : "+result); */

        //---> similarly we can do for XOR (^).



        //---> Create a program that shows bitwise compliment/Not of a number.

        /* System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int result = ~num;
        System.out.println("Result is : "+ result); */


        //---> now for LEFT SHIFT (<<)

        /* System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int result = num << 1;
        System.out.println("Result is : "+ result); */

        //---> similarly we can do that for RIGHT SHIFT (>>)



        //---> Write a Program to check if a given number is odd or even using Bitwise operator.


        /* System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if((num & 1) == 0)
            System.out.println("It's a EVEN number.");
        else
            System.out.println("It's a ODD number."); */



    }
}
