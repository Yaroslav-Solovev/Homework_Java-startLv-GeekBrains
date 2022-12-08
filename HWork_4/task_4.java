package HWork_4;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.*;

public class task_4 {

    static Scanner scanner = new Scanner(System.in);

    private static final Logger logger = Logger.getLogger(task_4.class.getName());

    public static void main(String[] args) throws Exception {
        Handler fileHandler = new FileHandler("log_task4.xml", true); // Создание лог-файла
        logger.setUseParentHandlers(false); // Отключение консоли Handler
        logger.addHandler(fileHandler);
        int choice = 0;
        Stack<Integer> savebook = new Stack<>();
        for(; choice != 1;){
            int num1 = getInt();
            int num2 = getInt();
            System.out.printf("Enter operation: " + System.lineSeparator());
            char operation = getOperation();
            float result = calculator(num1, num2, operation);
            System.out.println("Result of operation: " + result);
            int x = (int) result;
            System.out.println("Стек: " + savebook);
            choise_operation(savebook, x);
            System.out.println("Выйти из программы?: 1) Да 2) Нет ");
            choice = getInt();
        }
    }

    // Метод выбора команды
    static void choise_operation(Stack<Integer> savebook, Integer x) throws Exception {
        System.out.println("Сохранить или удалить информацию об операции?: 1) Сохранить 2) Удалить ");
        int choice = getInt();
        if(choice == 1){
            save_operation(savebook, x);
        }if(choice == 2){
            del_operation(savebook, x);
        }
    }
    // Метод сохранения информации об операции
    static void save_operation(Stack<Integer> savebook, Integer x) {
        savebook.push(x);
        System.out.println("Поместить (" + x + ")");
        System.out.println("Стек: " + savebook);
    }
    // Метод удаления информации об операции
    static void del_operation(Stack<Integer> savebook, Integer x) {
        System.out.print("В очередь -> ");
        x = (Integer) savebook.pop();
        System.out.println(x);
        System.out.println("Стек: " + savebook);
    }   
    // Проверка на ввод числа с консоли на ошибку
    public static int getInt() throws Exception {
        System.out.println("Enter the number: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Wrong number, try again.");
            logger.info("Error: Wrong number, try again." );
            scanner.next(); // Рекурсия
            num = getInt();
        }
        return num;
    }
    // Выбор оператора, проверка на неверный ввод оператора
    public static char getOperation() {
        System.out.println("Choose operation + - * /");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Wrong operation, try again + - * /");
            scanner.next(); // Рекурсия
            operation = getOperation();
        }
        return operation;
    }
    //Произведение вычислений на основе введенных чисел и выбранной операции
    public static float calculator(int num1, int num2, char operation) throws Exception {
        float result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                logger.info("Calculation result: " + num1 + " " + operation + " " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                logger.info("Calculation result: " + num1 + " " + operation + " " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                logger.info("Calculation result: " + num1 + " " + operation + " " + num2 + " = " + result);
                break;
            case '/':
                try {
                    result = num1 / num2;
                    logger.info("Calculation result: " + num1 + " " + operation + " " + num2 + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero.");
                    logger.info("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Wrong operation, try again.");
                logger.info("Error: {" + operation + "} Wrong operation, try again." );
                result = calculator(num1, num2, getOperation()); // Рекурсия
        }
        return result;
    }
}
