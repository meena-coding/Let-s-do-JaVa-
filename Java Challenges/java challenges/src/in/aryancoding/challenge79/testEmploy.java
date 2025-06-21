package in.aryancoding.challenge79;

public class testEmploy {

    public static void main(String[] args) {

        employee emp = new employee("Aryan",22,300000);
        System.out.println(emp.getEmployeeDetails());
        emp.setAge(20);
        emp.setSalary(150000);
        System.out.println(emp.getEmployeeDetails());
    }
}
