// Stack class extends the Vector class so we can access all methods of Vector class 

import java.util.Stack;

public class StackinJava {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("The items in stack is: " + s);
        int removedElement = s.pop();// it returns the poped element
        System.out.println("The item at the top was: " + removedElement);
        System.out.println("The items in stack is: " + s);
        int topElement = s.peek();
        System.out.println("The top element in the stack is now: " + topElement);
        System.out.println(s.isEmpty());
        System.out.println("The size of the stack is: " + s.size());
        System.out.println("The item 3 is present at the index: " + s.search(3));
    }
}
