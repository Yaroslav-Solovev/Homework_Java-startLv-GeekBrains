package HWork_4;

import java.util.EmptyStackException;
import java.util.Stack;

public class task_3 {
    
    static void push1(Stack<Object> stack, Object a) {
        stack.push(a);
        System.out.println("Поместить (" + a + ")");
        System.out.println("Стек: " + stack);
    }

     static void pop1(Stack<Object> stack) {
        System.out.print("В очередь -> ");
        Object a = (Object) stack.pop();
        System.out.println(a);
        System.out.println("Стек: " + stack);
    }
    
    public static void main(String[] args) throws Exception {
        Stack<Object> stack = new Stack<Object>();
        System.out.println("Стек: " + stack);
        push1(stack,56);
        push1(stack,"Respect");
        push1(stack,"007");
        pop1(stack);
        pop1(stack); 
        pop1(stack); 
        try {
            pop1(stack);
        }catch (EmptyStackException e) {
            System.out.println("Пустой стек");
        }
    }
}
