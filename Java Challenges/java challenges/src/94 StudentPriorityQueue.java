import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {


    public static void main(String[] args) {

        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student t1, student t2) {
                return t1.getGrade() - t2.getGrade();
            }
        });

        queue.offer(new student("Aryan",'A'));
        queue.offer(new student("Mayank",'C'));
        queue.offer(new student("Akshey",'D'));
        queue.offer(new student("Vidhi",'A'));
        queue.offer(new student("Swati",'B'));

        System.out.println(queue);

        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }


    private static class student{

        private final String name;
        private final char grade;

        public student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {

            return name + " : " + grade;
        }
    }
}
