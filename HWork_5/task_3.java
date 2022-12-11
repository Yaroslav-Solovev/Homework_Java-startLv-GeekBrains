package HWork_5;

import java.util.Scanner;

public class task_3 {
    
    static Scanner scanner = new Scanner(System.in);

    // Введение размера и элементов массива с терминала
    public static Integer getNumber(){
        return scanner.nextInt();
    }
    
    public void sort(int arr[]){
        int sizeArr = arr.length;
        // Построение кучи (перегруппируем массив)
        for (int i = sizeArr / 2 - 1; i >= 0; i--)
            heapify(arr, sizeArr, i);
        // Один за другим извлекаем элементы из кучи   
        for (int i = sizeArr - 1; i >= 0; i--){
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }
    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
    // индексом в arr[]. sizeArr - размер кучи
    void heapify(int arr[], int sizeArr, int i){
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2
        // Если левый дочерний элемент больше корня
        if (l < sizeArr && arr[l] > arr[largest])
            largest = l;
        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < sizeArr && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, sizeArr, largest);
        }
    }
    /* Вспомогательная функция для вывода на экран массива размера sizeArr */
    static void printArray(int arr[]){
        int sizeArr = arr.length;
        for (int i = 0; i < sizeArr; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Управляющая программа
    public static void main(String args[]){
        System.out.println("Введите размер массива: ");
        int sizeArr = getNumber();

        int [] arr = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++){
            System.out.printf("Введите " + (i + 1) + " элемент массива: ");
            arr[i] = getNumber();
        }
        System.out.println("Array is");
        printArray(arr);
        
        task_3 ob = new task_3();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}    

