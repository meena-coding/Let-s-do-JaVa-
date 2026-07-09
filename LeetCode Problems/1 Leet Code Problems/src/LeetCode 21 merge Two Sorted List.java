import java.util.Scanner;

class mergeTwoSortedList {

    static class ListNode {
        int value;
        ListNode next;
    }

    public ListNode mergeTwoLists(ListNode list1 , ListNode list2){
        ListNode temp = new ListNode();
        ListNode dummy = temp;

        while (list1 != null && list2!= null){
            if(list1.value <= list2.value) {
               temp.next = list1;
               list1 = list1.next;
           }
           else{
               temp.next = list2;
               list2 = list2.next;
           }
           temp = temp.next;
        }
        temp.next = list1 != null ? list1 : list2;
        return dummy.next;
    }

    public static void main(String[] args) {


        ListNode a = new ListNode();  //This is just to understand the Syntax of LinkedList
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();

        a.value = 1;
        b.value = 2;
        c.value = 3;
        d.value = 4;

        a.next = b;
        b.next = c;
        c.next = d;
        ListNode current = a;

        while (current != null){
            System.out.print(current.value + " -> ");
            if(current.next == null){
                System.out.print("null");
            }
            current = current.next;
        }
    }

}
