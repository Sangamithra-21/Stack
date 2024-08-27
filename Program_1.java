package Assignment_20_Stack;

import java.util.Stack;

public class Program_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();

        System.out.println(stack);

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
