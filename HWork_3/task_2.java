package HWork_3;

// import java.util.ArrayList;
import java.util.List;
// import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;
import java.util.stream.Collectors;

public class task_2 {
    
    static Scanner iScanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(task_2.class.getName());
    
    public static void main(String[] args) throws Exception {
        int n;
        do{
            n = getInt();
        }while (n < 2);
        List<Integer> intList = new Random().ints(n, 1, 11).boxed().collect(Collectors.toList());
        System.out.println("Заданный список: " + intList);
        deleteEvenElement(intList);
        System.out.println("Итоговый список: " + intList);
    }
    // метод удаления четных элементов заданного списка
    public static void deleteEvenElement(List<Integer> intList) {
        for(int i=0; i<intList.size(); i++) {
            if(intList.get(i) % 2 == 0) intList.remove(intList.get(i));
        }
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