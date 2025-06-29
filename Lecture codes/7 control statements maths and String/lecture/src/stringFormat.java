public class stringFormat {

    public static void main(String[] args) {

        int marks = 45;
        String name = "Bharat";
        System.out.println("hello "+ name + ", your marks are: " + marks);

        System.out.printf("Hello %s, your marks are: %d\n",name,marks);
        System.out.printf("Hello %-10S, your marks are: %d",name,marks);
    }
}
