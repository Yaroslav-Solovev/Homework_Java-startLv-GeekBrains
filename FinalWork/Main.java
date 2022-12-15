package FinalWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    
    ArrayList<Notebook> allNote;
    
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

    // Метод формирования множества ноутбуков
    public static ArrayList<Notebook> getArrayNote(){
        Notebook note1 = new Notebook(1, "HP", 8, 500, "Windows XP", "Red");
        Notebook note2 = new Notebook(2, "HP", 8, 500, "Windows XP", "Blue");
        Notebook note3 = new Notebook(3, "Samsung", 8, 1000, "Windows 7", "Cilver");
        Notebook note4 = new Notebook(4, "Samsung", 8, 2000, "Windows 7", "Red");
        Notebook note5 = new Notebook(5, "Asus", 16, 2000, "Windows 10", "Black");
        Notebook note6 = new Notebook(6, "Asus", 64, 4000, "Windows 10", "Blue");
        Notebook note7 = new Notebook(7, "HP", 8, 500, "Windows XP", "Red");
        Notebook note8 = new Notebook(8, "HP", 16, 1000, "Windows XP", "Blue");
        Notebook note9 = new Notebook(9, "Samsung", 64, 1000, "Windows 10", "Cilver");
        Notebook note10 = new Notebook(10, "Samsung", 16, 500, "Windows XP", "Red");
        Notebook note11 = new Notebook(11, "Asus", 16, 4000, "Windows 7", "Black");
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
        return allNote;
    }
    // +++ 1 +++
    // +++ Методы выбора критерия поиска +++
    
    // Поиск по критерию - ОЗУ
    public static void choice1(ArrayList<Notebook> allNote) throws Exception{ 
        System.out.println("Выбирите размер ОЗУ: 1. 8; 2. 16; 3. 64.");
        int numRam = getInt();
        if (numRam == 1 | numRam == 2 | numRam == 3){
            for (int i = 0; i < allNote.size(); i++) {
                if (numRam == 1 && allNote.get(i).getRam() == 8){
                    System.out.println(allNote.get(i).getInfo());
                }
                if (numRam == 2 && allNote.get(i).getRam() == 16){
                    System.out.println(allNote.get(i).getInfo());
                }
                if (numRam == 3 && allNote.get(i).getRam() == 64){
                    System.out.println(allNote.get(i).getInfo());
                }
            }
        }
        else{
            System.out.println("Список пуст.");
        }      
    }
    // Поиск по критерию - объем жесткого диска
    public static void choice2(ArrayList<Notebook> allNote) throws Exception{ 
        System.out.println("Выбирите объем жесткого диска: 1. 500 Gb; 2. 1000 Gb; 3. 2000 Gb.");
        int numCapacityHardDisk = getInt();
        if (numCapacityHardDisk == 1 | numCapacityHardDisk == 2 | numCapacityHardDisk == 3){
            for (int i = 0; i < allNote.size(); i++) {
                if (numCapacityHardDisk == 1 && allNote.get(i).getCapacityHardDisk() == 500){
                    System.out.println(allNote.get(i).getInfo());
                }
                if (numCapacityHardDisk == 2 && allNote.get(i).getCapacityHardDisk() == 1000){
                    System.out.println(allNote.get(i).getInfo());
                }
                if (numCapacityHardDisk == 3 && allNote.get(i).getCapacityHardDisk() == 2000){
                    System.out.println(allNote.get(i).getInfo());
                }
            }
        }
        else{
            System.out.println("Список пуст.");
        }      
    }
    // Поиск по критерию - наименование ОС
    public static void choice3(ArrayList<Notebook> allNote) throws Exception{
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
    // Поиск по критерию - цвет корпуса
    public static void choice4(ArrayList<Notebook> allNote) throws Exception{
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
    // Поиск по критерию - наименование модели ноутбука
    public static void choice5(ArrayList<Notebook> allNote) throws Exception{
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
    
    // Метод критерий выбора, объеденяющий методы поиска по критериям
    public static void allChoice(ArrayList<Notebook> allNote, TreeMap<Integer, ArrayList<Notebook>> searchChoice) throws Exception{
        int search = getInt();
        switch (search){
            case 1:
                choice1(allNote);
                searchChoice.put(search, allNote);
                break;
            case 2:
                choice2(allNote);
                searchChoice.put(search, allNote);
                break;
            case 3:
                choice3(allNote);
                searchChoice.put(search, allNote);
                break;
            case 4:
                choice4(allNote);
                searchChoice.put(search, allNote);
                break;
            case 5:
                choice5(allNote);
                searchChoice.put(search, allNote);
                break;
            default:
                System.out.printf("Error! Введите корректный номер поиска.");
                allChoice(allNote, searchChoice);
        }
        return;  
    }
    // +++ 2 +++
    // Поиск минимального значения по критерию - ОЗУ
    public static void choiceMinRam(ArrayList<Notebook> allNote) throws Exception{ 
        TreeMap<String, Integer> searchTerm = new TreeMap<String, Integer>();
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
    // Поиск минимального значения по критерию - объем жесткого диска
    public static void choiceMinCapacityHardDisk(ArrayList<Notebook> allNote) throws Exception{ 
        TreeMap<String, Integer> searchTerm = new TreeMap<String, Integer>();
        for (int i = 0; i < allNote.size(); i++) {
            searchTerm.put(allNote.get(i).getInfo(), allNote.get(i).getCapacityHardDisk());
        }             
        Integer minCapacityHardDisk = Collections.min(searchTerm.values()); // Поиск минимального значения
        // System.out.print("Минимальное значение ОЗУ: " + min);
        System.out.println("Результат фильтрации по минимальному значению: ");
        for (int i = 0; i < allNote.size(); i++) {
            if(allNote.get(i).getCapacityHardDisk() == minCapacityHardDisk){
                System.out.println(allNote.get(i).getInfo());
            }                
        }
    }      
    // Управляющая программа
    public static void main(String[] args) throws Exception {
        ArrayList<Notebook> allNote = getArrayNote();
        // for (int i = 0; i < allNote.size(); i++) { // Проверка вывода всего списка ноутбуков
        //     System.out.println(allNote.get(i).getInfo());
        // }
        System.out.println("Критерии поиска: 1 - ОЗУ, 2 - Объем жесткого диска, 3 - Операционная система, 4 - Цвет корпуса, 5 - Модель");
 
        TreeMap<Integer, ArrayList<Notebook>> searchChoice = new TreeMap<Integer, ArrayList<Notebook>>();
  
        System.out.println("Ведите номер критерия поиска: ");
        allChoice(allNote, searchChoice);
        System.out.println("//////////////////");
        choiceMinRam(allNote);
        System.out.println("//////////////////");
        choiceMinCapacityHardDisk(allNote);
        // for (Entry<Integer, ArrayList<Notebook>> entry : searchChoice.entrySet()) {
        //     System.out.printf("%s", entry.getValue());
        // }
    }  
}
