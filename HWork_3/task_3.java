package HWork_3;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;
import java.util.stream.Collectors;

public class task_3 {
    
    static Scanner iScanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(task_2.class.getName());

    public static void main(String[] args) throws Exception {
        int n = getInt();
        List<Integer> intList = new Random().ints(n, 1, 20).boxed().collect(Collectors.toList());
        System.out.print("Заданный список: " + intList + System.lineSeparator());
        System.out.print("Среднее значение: " + average(intList) + System.lineSeparator());
        MaxMinElement(intList);
    }
    // метод нахождения среднего из списка
    public static double average(List<Integer> intList) {
        double sum = 0;
        for(int i=0; i<intList.size(); i++) {
            sum+=intList.get(i);
        }
        return sum/intList.size();
    }
    // метод нахождения минимального и максимального из списка
    public static void MaxMinElement(List<Integer> intList) {
        int min = intList.get(0);
        int max = intList.get(0);
        for (Integer i: intList) {
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;      
        }
        System.out.print("Минимальное значение: " + min + System.lineSeparator());
        System.out.print("Максимальное значение: " + max + System.lineSeparator());  
    }
     // Проверка на ввод числа с консоли на ошибку
     public static int getInt() throws Exception {
        System.out.println("Введите длинну списка (n >= 2): ");
        int num;
        if (iScanner.hasNextInt()) {
            num = iScanner.nextInt();
        } else {
            System.out.println("Wrong number, try again.");
            logger.info("Error: Wrong number, try again." );
            iScanner.next();
            num = getInt();
        }
        return num;
    }
}
