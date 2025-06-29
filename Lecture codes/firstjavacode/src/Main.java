//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World");
        //here println is adding a new line, if not "ln" it will be in one line.
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
       double sum = num1 + num2 + num3;
        System.out.println(sum);
        //Q:- Print stars in line wise in increasing order
        System.out.print("*\n**\n***\n****\n");

        //just trying
        int a = 4;
        int b = 5;
        System.out.println(3*(a+b));

        //quiz from apni kaksha lec 2
        //a x b / a - b where a1=10 b1=5
        int a1 = 10;
        int a2 = 5;
        int sum1 = (a1*a2) / (a1-a2);
        System.out.println(sum1);


    }

}

//add two number
//AddTwoNumber  --> Pascal naming convention
// addTwoNumber --> Camel case naming convention