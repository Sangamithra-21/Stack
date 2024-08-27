package Assignment_20_Stack;

import java.util.Stack;

public class Program_2 {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        String str="hello";

        for(char ch : str.toCharArray())
        {
            stack.push(ch);
        }

        String result = "";
        while(!stack.isEmpty())
        {
            result=result+stack.pop();
        }

        System.out.println(result);
    }
}
