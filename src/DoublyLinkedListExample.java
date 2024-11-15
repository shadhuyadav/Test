/*
public class public class DoublyLinkedListExample {

    // Node class representing each node in the doubly linked list
    static class ListNode {
        int value;
        ListNode prev;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    // DoublyLinkedList class with traversal methods
    static class DoublyLinkedList {
        ListNode head;
        ListNode tail;

        DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        // Add node at the end of the list
        public void add(int value) {
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Forward traversal from head to tail
        public void forwardTraversal() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Backward traversal from tail to head
        public void backwardTraversal() {
            ListNode current = tail;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Forward Traversal:");
        list.forwardTraversal(); // Output: 1 2 3 4

        System.out.println("Backward Traversal:");
        list.backwardTraversal(); // Output: 4 3 2 1
    }
}
{
}
*/
