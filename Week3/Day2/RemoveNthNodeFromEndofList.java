public class RemoveNthNodeFromEndofList {
     public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return null;
        }
        int size = 0 ;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }

        int indexTosearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i < indexTosearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}

