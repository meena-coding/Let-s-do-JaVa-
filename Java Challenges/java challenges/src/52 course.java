class course {

    static int maxCapacity = 100;
    String courseName;
    int enrollment;

    course(String courseName){
        this.courseName = courseName;
        enrollment = 0;
    }

    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String studentName){
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }

    void unEnrollStudents(String studentName){
        System.out.println("Student is Re moved");
        enrollment--;
    }
}
