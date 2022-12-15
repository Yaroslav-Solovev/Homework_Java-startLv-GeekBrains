
//    - FWork = Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//    Создать множество ноутбуков. Написать метод, который будет запрашивать 
// у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например:	“Введите цифру, соответствующую необходимому критерию:	
//       1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package FinalWork;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Notebook note1 = new Notebook(1, "HP", 32, 500, "Windows XP", "Red");
        Notebook note2 = new Notebook(2, "HP", 32, 500, "Windows XP", "Blue");
        Notebook note3 = new Notebook(3, "Samsung", 64, 1000, "Windows 7", "Cilver");
        Notebook note4 = new Notebook(4, "Samsung", 32, 1500, "Windows 7", "Red");
        Notebook note5 = new Notebook(5, "Asus", 32, 2000, "Windows 10", "Black");
        Notebook note6 = new Notebook(6, "Asus", 64, 4000, "Windows 10", "Blue");
        Notebook note7 = new Notebook(7, "HP", 32, 500, "Windows XP", "Red");
        Notebook note8 = new Notebook(8, "HP", 32, 1000, "Windows XP", "Blue");
        Notebook note9 = new Notebook(9, "Samsung", 64, 1000, "Windows 10", "Cilver");
        Notebook note10 = new Notebook(10, "Samsung", 32, 500, "Windows XP", "Red");
        Notebook note11 = new Notebook(11, "Asus", 32, 4000, "Windows 7", "Black");
        Notebook note12 = new Notebook(12, "Asus", 64, 1000, "Windows 10", "Blue");
    
        ArrayList<Notebook> allNote = new ArrayList<Notebook>();
        allNote.add(note1);
        allNote.add(note2);
        allNote.add(note3);
        allNote.add(note4);
        allNote.add(note5);
        allNote.add(note6);
        allNote.add(note7);
        allNote.add(note8);
        allNote.add(note9);
        allNote.add(note10);
        allNote.add(note11);
        allNote.add(note12);
        // for (int i = 0; i < allNote.size(); i++) { // Проверка вывода всего списка ноутбуков
        //     System.out.println(allNote.get(i).getInfo());
        // }
        
        System.out.println("Критерии поиска: 1 - ОЗУ, 2 - Объем жесткого диска, 3 - Операционная система, 4 - Цвет корпуса, 5 - Модель");
        TreeMap<String, Integer> searchTerm = new TreeMap<String, Integer>();
        // searchTerm.put(1, "ram");
        // searchTerm.put(2, "capacityHardDisk");
        // searchTerm.put(3, "operationSystem");
        // searchTerm.put(4, "color");
        System.out.println("Ведите значение поиска: ");
        int search = getInt();
        
        if (search == 1){
            for (int i = 0; i < allNote.size(); i++) {
                searchTerm.put(allNote.get(i).getInfo(), allNote.get(i).getRam());
            }             
            Integer minRam = Collections.min(searchTerm.values()); // Поиск минимального значения
            // System.out.print("Минимальное значение ОЗУ: " + min);
            System.out.println("Результат фильтрации по минимальному значению: ");
            for (int i = 0; i < allNote.size(); i++) {
                if(allNote.get(i).getRam() == minRam){
                    System.out.println(allNote.get(i).getInfo());
                }                
            }
        }
        if (search == 2){
            for (int i = 0; i < allNote.size(); i++) {
                searchTerm.put(allNote.get(i).getInfo(), allNote.get(i).getCapacityHardDisk());
            }             
            Integer minCapacityHardDisk = Collections.min(searchTerm.values()); // Поиск минимального значения
            // System.out.print("Минимальное значение объем жесткого диска: " + min);
            System.out.println("Результат фильтрации по минимальному значению: ");
            for (int i = 0; i < allNote.size(); i++) {
                if(allNote.get(i).getCapacityHardDisk() == minCapacityHardDisk){
                    System.out.println(allNote.get(i).getInfo());
                }                
            }
        }
        if (search == 3){
            System.out.println("Выбирите oперационную систему: 1. Windows XP; 2. Windows 7; 3. Windows 10.");
            int numOperationSystem = getInt();
            if (numOperationSystem == 1 | numOperationSystem == 2 | numOperationSystem == 3){
                for (int i = 0; i < allNote.size(); i++) {
                    if (numOperationSystem == 1 && allNote.get(i).getOperationSystem() == "Windows XP"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numOperationSystem == 2 && allNote.get(i).getOperationSystem() == "Windows 7"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numOperationSystem == 3 && allNote.get(i).getOperationSystem() == "Windows 10"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                }
            }
            else{
                System.out.println("Список пуст.");
            }      
        }
        if (search == 4){
            System.out.println("Выбирите цвет корпуса: 1. Red; 2. Blue; 3. Cilver; 4. Black.");
            int numColor = getInt();
            if (numColor == 1 | numColor == 2 | numColor == 3 | numColor == 4){
                for (int i = 0; i < allNote.size(); i++) {
                    if (numColor == 1 && allNote.get(i).getColor() == "Red"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numColor == 2 && allNote.get(i).getColor() == "Blue"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numColor == 3 && allNote.get(i).getColor() == "Cilver"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numColor == 4 && allNote.get(i).getColor() == "Black"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                }
            }
            else{
                System.out.println("Список пуст.");
            }      
        }
        if (search == 5){
            System.out.println("Выбирите модель: 1. HP; 2. Samsung; 3. Asus.");
            int numModel = getInt();
            if (numModel == 1 | numModel == 2 | numModel == 3){
                for (int i = 0; i < allNote.size(); i++) {
                    if (numModel == 1 && allNote.get(i).getModel() == "HP"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numModel == 2 && allNote.get(i).getModel() == "Samsung"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                    if (numModel == 3 && allNote.get(i).getModel() == "Asus"){
                        System.out.println(allNote.get(i).getInfo());
                    }
                }
            }
            else{
                System.out.println("Список пуст.");
            }      
        }
    }
    // Проверка на ввод числа с консоли на ошибку
    public static int getInt() throws Exception {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error: Вы ввели не число!");
            scanner.next();
            num = getInt();
        }
        return num;
    }
}
