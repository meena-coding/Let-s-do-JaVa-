package in.MeenaCoding.VarArgs;

public class VarArgs {
    public static void main(String... args) {
        System.out.printf("sum of the Number is: %d",sum(4,3,2,4,5,633,33,4,4,3,2));
        System.out.printf("sum of the Number is: %d",sum(4,3,2,4,5,633,33,4,4,3,2));



        }

        public static int sum (int first, int second, int... a){
            int sum = first + second;

            for (int i : a) {
                sum += i;
            }
            return sum;
        }

//    public static int sum(int[] a){
//        int sum = 0;
//
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//
//    }
    }
