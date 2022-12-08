package HWork_4;

import java.util.LinkedList;
import java.util.Queue;

public class task_2 {
    public static void main(String args[]) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Cat");
        queue.add("Собака");
        queue.add("2 + 2 = 4");
        queue.add("Ketrin");
        System.out.println(queue); // [Cat, Собака, 2 + 2 = 4, Ketrin]
        queue.offer("End string"); // Enqueue метод
        System.out.println("Enqueue метод: " + queue);
        
        String name = queue.remove(); //Dequeue метод
        System.out.println("Removed from queue : " + name);
        System.out.println("Dequeue метод: " + queue);

        System.out.print("First метод: " + ((LinkedList<String>) queue).peekFirst() + System.lineSeparator()); // First метод
        // System.out.print("Проверка First метод: " + queue);
    }
}
