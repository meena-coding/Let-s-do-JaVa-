public class bharat {

    public static int Factorial(int n){
        int result;
        if(n == 0 || n == 1) return 1;
        else{
            result = n * Factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial(10));
    }
}
