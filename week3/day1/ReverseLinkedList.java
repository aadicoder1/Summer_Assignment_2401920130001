package week3.day1;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        ListNode curr= head;

        while (curr!=null) {
            ListNode nextnode = curr.next; 
            curr.next= prev;             
            prev= curr;                 
            curr= nextnode;              
        }
        return prev;
    }
}
