class StackImplementation
{
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.display();
    }
}

class StackUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackUsingArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    public void push(int value) {
        if(top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to stack.");
        }
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicating stack is empty
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from stack.");
            return value;
        }
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Indicating stack is empty
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public int size() {
        return top + 1;
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for(int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}