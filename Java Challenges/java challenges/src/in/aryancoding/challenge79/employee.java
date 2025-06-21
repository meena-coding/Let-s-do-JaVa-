package in.aryancoding.challenge79;

class employee {

    private String name;
    private int age;
    private double salary;

    employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails(){
        return "Employ Details: Name: "+name+
                ", Age: " + age +
                ", Salary: " + salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
