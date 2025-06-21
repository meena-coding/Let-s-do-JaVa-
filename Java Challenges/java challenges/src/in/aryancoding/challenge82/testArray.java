package in.aryancoding.challenge82;

public class testArray {

    public static void main(String[] args) {

        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9 });
        ArrayOperations.statastic statastic = opr.new statastic();
        System.out.println(statastic.mean());
    }
}
