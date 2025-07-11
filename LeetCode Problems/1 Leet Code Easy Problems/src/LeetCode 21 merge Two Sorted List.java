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

}
