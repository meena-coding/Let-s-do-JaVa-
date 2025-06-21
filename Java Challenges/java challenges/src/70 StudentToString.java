class StudentToString {

    String name;
    int age;
    int rollNumber;
    String house;

    public StudentToString(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentToString{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", rollNumber=").append(rollNumber);
        sb.append(", house='").append(house).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        StudentToString stu = new StudentToString("Aryan",23,22174012,"white");
        System.out.println(stu);
    }
}
