import java.util.Stack;

public class StackReversal {

    // Method to reverse the stack
    public static void reverse(Stack<Integer> stack) {
        // Base case: if the stack is empty
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Recursively reverse the remaining stack
        reverse(stack);

        // Step 3: Push the popped element at the bottom of the reversed stack
        pushAtBottom(stack, top);
    }

    // Helper method to push an element at the bottom of the stack
    private static void pushAtBottom(Stack<Integer> stack, int value) {
        // Base case: if the stack is empty, push the value
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Recursively call to reach the bottom
        pushAtBottom(stack, value);

        // Step 3: Push the popped element back on top
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        // Reverse the stack
        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
