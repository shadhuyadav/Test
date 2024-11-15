package IMPORTANT;

public class ImplementStackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public ImplementStackUsingArray(int size) {
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        ImplementStackUsingArray stack = new ImplementStackUsingArray(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Output: Stack Overflow
        System.out.println("Top element is: " + stack.peek()); // Output: 30
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek()); // Output: 20
    }
}
