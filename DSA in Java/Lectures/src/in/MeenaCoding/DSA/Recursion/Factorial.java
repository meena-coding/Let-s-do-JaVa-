package in.MeenaCoding.DSA.Recursion;

/* Factorial
* n! = n x (n - 1) x .... x 1
* F(0) = 1
* F(1) = 1
* F(2) = 2
* F(3) = 6 = 3 x 2
* F(n) = n x F(n - 1), n > 1
* */

public class Factorial {

    public int fact(int n){

        if(n == 0 || n == 1) return 1;
        return fact(n - 1) * n;
    }
}
