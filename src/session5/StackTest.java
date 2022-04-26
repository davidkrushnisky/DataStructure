package session5;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(4);
        Employee mark = new Employee("Mark", "Messier", 1);
        Employee suzan = new Employee("Suzan", "St-Claire", 2);

        stack.push(mark);
        stack.push(suzan);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
