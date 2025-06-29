package in.aryancoding.passBy;

public class TestPassByValue {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int sum = sum(x, y);
        System.out.printf("x=%d, y=%d, sum=%d",x , y, sum);

    }

    //pass by normally means even if we change value of arguments in method then it won't change in the main class only result will differ like x and a are different.

    public static int sum(int a, int b){
        a = 75;
        return a+b;
    }
}
