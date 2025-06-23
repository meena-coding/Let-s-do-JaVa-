package in.MeenaCoding.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);    //throws exception if element can't be added
        queue.offer(2);  //returns false if the element cannot be added.

        Utility.print(queue);     //can call this anytime if to print collections of any-type.

        System.out.println(queue.peek());    //return null if queue is empty.
        System.out.println(queue.element());  //throw exception is queue is empty

        System.out.println(queue.remove());  //remove throws exception if there is nothing to remove

        Utility.print(queue);

        System.out.println(queue.poll());  //poll returns null if there is nothing to remove

        Utility.print(queue);
    }
}
