package in.aryancoding.Polymorphism;

public class overloading {

    public int add(int a, int b){
        return a + b;
    }

    //java will automatically understand even if the methods are same but the arguments are different

    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        overloading overload = new overloading();

        System.out.println(overload.add(3,4,5,2));
        System.out.println(overload.add(3,4));
        System.out.println(overload.add("Aryan ","Meena"));

    }
}
