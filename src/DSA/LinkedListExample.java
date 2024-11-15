package DSA;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
public class LinkedListExample {
    //Linked List with Floyd's cycle detection algorithm
    public static boolean hasCycle(ListNode head){
        if(head==null || head.next==null) return false;

        ListNode slow=head;
        ListNode fast=head.next;
        while(slow!=fast){
            if(fast==null || fast.next == null) return false;
            slow = slow.next;
            fast=fast.next.next;
        }
        return true;
            }
     public static void main(String args[]){
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=head.next;// creating a cycle
         System.out.println("Has cycle:"+hasCycle(head));

     }
}
