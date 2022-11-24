package HWork_1;

import java.util.Scanner;

public class task_3 {

    static int sum(int a, int b) {
        return a+b;
    }
    static int dif(int a, int b) {
        return a-b;
    }  
    static int mult(int a, int b) {
        return a*b;
    } 
    static int div(int a, int b) {
        return a/b;
    } 

    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        System.out.printf("Перечень операторов: 1) +; 2) -, 3) *; 4) /." + System.lineSeparator());
        System.out.printf("Введите номер оператора: ");
        int c = iScanner.nextInt();
        float result = 0;
        switch (c){
            case 1:
                result = result + sum(a, b);
                break;
            case 2:
                result = result + dif(a, b);
                break;
            case 3:
                result = result + mult(a, b);
                break;
            case 4:
                if (b != 0) result = result + div(a, b);
                else System.out.print("Деление на 0!");
                break;
            default:  
                System.out.printf("Error! Введите корректный номер оператора.");
                break;
        }
        System.out.print("Результат вычислений: " + result);
        iScanner.close();
    }
}
