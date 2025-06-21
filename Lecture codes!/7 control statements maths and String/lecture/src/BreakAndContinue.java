public class BreakAndContinue {

    public static void main(String[] args) {

        //let's understand break; keyword

        /* System.out.println("before the Loop");
        for(int i = 0 ; i < 1000 ; i++){
            if(i == 101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the Loop"); */

        //Now the continue; keyword

        for (int i = 0; i < 10; i++){
            if(i == 5 ){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of the Loop.");
    }
}
