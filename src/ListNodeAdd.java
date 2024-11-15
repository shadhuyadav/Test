public class ListNodeAdd {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output will be: 7 0 8
    }




    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
   static  class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0); // Dummy head for the result list
            ListNode current = dummyHead; // Pointer for the current node in the result
            int carry = 0; // Initialize carry

            while (l1 != null || l2 != null || carry != 0) {
                int sum = carry; // Start with carry

                if (l1 != null) {
                    sum += l1.val; // Add value from list 1
                    l1 = l1.next; // Move to the next node
                }

                if (l2 != null) {
                    sum += l2.val; // Add value from list 2
                    l2 = l2.next; // Move to the next node
                }

                carry = sum / 10; // Calculate carry for next iteration
                current.next = new ListNode(sum % 10); // Create a new node with the digit
                current = current.next; // Move to the newly created node
            }

            return dummyHead.next; // Return the result list, skipping the dummy head
        }
    }


}
