package Assignment_20_Stack;

import java.util.Stack;

public class Program_3 {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String str=")()()(";

        for(char ch : str.toCharArray())
        {
            if(ch=='(')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    System.out.println("Unbalanced");
                    return;
                }
                else if(stack.pop()==')')
                {
                    stack.pop();
                }
            }
        }
        String result = stack.isEmpty() ? "Balanced" : "Unbalanced";
        System.out.println(result);
    }
}
