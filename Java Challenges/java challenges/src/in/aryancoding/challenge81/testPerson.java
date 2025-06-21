package in.aryancoding.challenge81;

public class testPerson extends Person{

    public testPerson(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Aryan",21);
        Person p2 = new Person("Aryan",22);

        if(p1.equals(p2)){
            System.out.println("Both are Equal\n" + p1.hashCode());
        }else
            System.out.println("Both are Different\n" + p2.hashCode());
    }
}
