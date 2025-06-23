import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacter {

    public static void main(String[] args) {

        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your String: ");
        String userStr = sc.nextLine();

        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your String has %d Unique Characters",unique.size());
    }
}
