package HWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class task_1 {
    static Scanner iScanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(task_1.class.getName());
    public static void main(String args[]) throws Exception {
        int n;
        do{
            n = getInt();
        }while (n < 2);
        int[] sortArr = createRandomArray(n, 1, 20);
        System.out.println("Заданный массив: " + Arrays.toString(sortArr));
        int[] result = mergeSort(sortArr);
        System.out.println("Отсортированный массив: " + Arrays.toString(result));
    }
    
    // метод рандомирования элементов начального массива
    public static int[] createRandomArray(int length, int min, int max) {
        int[] result = length > 0 ? new int[length] : new int[0];
        if (length > 0) {
            Random rand = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = rand.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }
    
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        // уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        // процедура слияния
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
    // Проверка на ввод числа с консоли на ошибку
    public static int getInt() throws Exception {
        System.out.println("Введите длинну массива (n >= 2): ");
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