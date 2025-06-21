package in.AryanCoding.equals;

public class equalAndHashCodeTest {

    public static void main(String[] args) {

        person person1 = new person("Aryan",21,"22174012");

        person person2 = new person("Aryan",21,"22174004 ");

        if(person1.equals(person2)){
            System.out.println("Both are same person");
        }
        else
            System.out.println("Both are different person\n");
        System.out.printf("hashcode for person 1: %d\nhashcode for person 2: %d",person1.hashCode(),person2.hashCode());
    }
}
