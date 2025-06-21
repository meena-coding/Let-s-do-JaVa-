package in.aryancoding.Challenge85;

public class calculatorOverloading {

    public int add(int a , int b){
        return a +b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {

        calculatorOverloading overload = new calculatorOverloading();

        System.out.println(overload.add(1,2));
        System.out.println(overload.add(5,3,7));
        System.out.println(overload.add(4.32,65.445));
    }

}
