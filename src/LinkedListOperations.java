public class LinkedListOperations {

    // Node class representing each node in the list
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // LinkedList class with methods to perform operations
    static class LinkedList {
        ListNode head;

        // Add node at the end of the list
        public void add(int value) {
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Insert node after a specific value
        public void insertAfter(int targetValue, int newValue) {
            ListNode current = head;
            while (current != null) {
                if (current.value == targetValue) {
                    ListNode newNode = new ListNode(newValue);
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
            System.out.println("Value " + targetValue + " not found in the list.");
        }

        // Delete node with a specific value
        public void delete(int value) {
            if (head == null) return;

            if (head.value == value) {
                head = head.next; // Remove the head node
                return;
            }

            ListNode current = head;
            while (current.next != null) {
                if (current.next.value == value) {
                    current.next = current.next.next; // Bypass the node to be deleted
                    return;
                }
                current = current.next;
            }
            System.out.println("Value " + value + " not found in the list.");
        }

        // Print the linked list
        public void printList() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("List after adding elements:");
        list.printList();

        // Insert element after a specific value
        list.insertAfter(2, 5);
        System.out.println("List after inserting 5 after 2:");
        list.printList();

        // Delete a specific element
        list.delete(3);
        System.out.println("List after deleting 3:");
        list.printList();

        // Try to delete a non-existing element
        list.delete(10);
        System.out.println("List after trying to delete 10:");
        list.printList();
    }
}
