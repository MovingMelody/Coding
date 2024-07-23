/*
* Created on 23 July 2024
* 
* @author Sai Sumanth
*/

/* 
* Implement a Stack class with below operations
* POP(), PUSH(), PEEK(), INC(uptoIndex, IncValue)
* All Methods should take O(1) time complexity.
* 
* If we implement INC function directly by adding the given incValue it will take O(n) time
*/

class StackImplementation {
    static final int MAX = 1000;
    int[] nums = new int[MAX];

    /*
     * 
     * If user call inc(2,5) it means that elements upto index 2 should be
     * incremented by 5.
     * so incArr will be [0, 0, 5, 0, 0, 0] -> put 5 at index 2
     * 
     * then again if user calls inc(4, 5)
     * so incArr will be [0, 0, 5, 0, 5, 0] -> put 5 at index 4
     * 
     * let nums be [1, 2, 1, 2, 1, 2]
     * 
     * pop() -> 2 will be returned
     * again pop() -> now we should return 6, not 1
     * 
     */
    int[] incArr = new int[MAX];
    int top;

    StackImplementation() {
        top = -1;
    }

    public void peek() {
        if (top >= 0) {
            System.out.println("Element at top: " + (nums[top] + incArr[top]));
            return;
        }
        System.out.println("No elements in stack");
        return;
    }

    public void pop() {
        if (top >= 0) {
            System.out.println((nums[top] + incArr[top]) + " Removed from Stack");
            incArr[top - 1] = incArr[top] + incArr[top - 1];
            top--;
            return;
        }
        System.out.println("No elements to POP");
    }

    public void push(int n) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow. Element can't be inserted");
            return;
        }
        nums[++top] = n;
    }

    public void inc(int uptoIndex, int incVal) {
        incArr[uptoIndex] = incArr[uptoIndex] + incVal;
    }
}

class StackGoogleQuestion {
    public static void main(String[] args) {

        StackImplementation s = new StackImplementation();

        // s.peek();
        // s.push(34);
        // s.peek();
        // s.pop();
        // s.push(12);
        // s.peek();

        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);

        s.inc(2, 4);
        s.inc(2, 8);
        s.inc(3, 8);
        s.inc(1, 2);

        for (int i = 1; i <= 5; i++) {
            s.pop();
        }
    }
}