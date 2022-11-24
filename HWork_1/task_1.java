// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package HWork_1;

import java.util.Scanner; // Ввод данных с терминала

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        int sum = (int) (0.5 * n *(n + 1));
        System.out.print("N-ое треугольное число: " + sum + System.lineSeparator());
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial = (int) (factorial * i);
        }
        System.out.print("Факториал n-ого числа: " + factorial);
        iScanner.close();
    }
}
