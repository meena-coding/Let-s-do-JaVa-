import java.util.*;
public class lec12 {
    public static void main(String[] args){

        //------------------------------ Strings ------------------------------//

         //string declaration
        /*String name = "aryan";
        String fullName = "aryan meena";
        String sentence = "My name is aryan";
        System.out.println(name+"\n"+fullName+"\n"+sentence);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String name = sc.nextLine();
        System.out.println("Your name is :- "+name);*/

        //---> concatenation

        /*String firstName = "Aryan";
        String lastName = "Meena";
        String fullName = firstName +" "+ lastName;
//        System.out.println(fullName);
        System.out.println(fullName.length());  //To know length of word or sentence

        //---> charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }*/

        //---> compareTo function.

        /*Scanner sc = new Scanner(System.in);

        System.out.println("enter first name : ");
        String name1 = sc.nextLine();
        System.out.println("enter second name : ");
        String name2 = sc.nextLine();

        //1 s1>s2 : +ve value
        //2 s1==s2 : 0
        //1 s1<s2 : -ve value
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are Equal.");
 
        }else{
            System.out.println("Strings are not Equal.");  // Always use compareTo function if want to compare strings. == fails sometimes.
        }*/

        //---> Strings are Immutable

        //----> another concept is substring

//        String sentence = "Aryan Meena";
//        String name = sentence.substring(6/*sentence.length()*/);     //String name = sentence.substring(beg index, end index)
//        System.out.println(name);


        // ----> Home-work questions.

        //----> Q.1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

        /*Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;


        for(int i=0;i<size;i++){
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);*/


        //----> Q.2 Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        //Example :
        //email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        //email = “helloWorld123@gmail.com”; username = “helloWorld123”

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email here :-");
        String email = sc.nextLine();
        String username = "";

        for(int i=0;i<email.length();i++){

            if(email.charAt(i)=='@'){
                break;
            } else{
                username += email.charAt(i);
            }
        }
        System.out.println("Your username is :-\n\n"+username);



         


    }
}
