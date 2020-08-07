import java.util.Stack;

public class MyQueue3 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    int front;

    public MyQueue3() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {

        if (stack1.isEmpty())
            front = x;
        stack1.push(x);
    }

    public int pop() {

        // 如果 stack2 不为空，直接返回 stack2 的栈首元素
        if (!stack2.isEmpty())
            return stack2.pop();

        while (stack1.size() > 1)
            stack2.push(stack1.pop());

        return stack1.pop();
    }

    public int peek() {
        if (!stack2.isEmpty())
            return stack2.peek();
        return front;
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
