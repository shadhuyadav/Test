public class CircularListDetection {

    // Node class representing each node in the list
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating a sample list with a cycle for demonstration
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        System.out.println("Is the list circular? " + isCircular(head));
    }

    // Method to detect if a linked list is circular
    public static boolean isCircular(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by one step
            fast = fast.next.next; // Move fast pointer by two steps

            if (slow == fast) { // A cycle is detected
                return true;
            }
        }

        return false; // No cycle found
    }
}
