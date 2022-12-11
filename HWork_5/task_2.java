package HWork_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map.Entry;


public class task_2 {
    public static void printMap(TreeMap<String, Integer> map){ // подчет повторений имен сотрудников
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Повторений: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> book = new ArrayList<>();
        book.add("Иван Иванов");
        book.add("Светлана Петрова");
        book.add("Кристина Белова");
        book.add("Анна Мусина");
        book.add("Анна Крутова");
        book.add("Иван Юрин");
        book.add("Петр Лыков");
        book.add("Павел Чернов");
        book.add("Петр Чернышов");
        book.add("Мария Федорова");
        book.add("Марина Светлова");
        book.add("Мария Савина");
        book.add("Мария Рыкова");
        book.add("Марина Лугова");
        book.add("Анна Владимирова");
        book.add("Иван Мечников");
        book.add("Петр Петин");
        book.add("Иван Ежов");
        // System.out.println(book);
       
        ArrayList<String> datalist = new ArrayList<String>(); // во временнй список кладем список имен из book
        for(int i = 0; i < book.size(); i++){
            String[] arrStrings = book.get(i).split(" ");
            datalist.add(arrStrings[0]);
        }

        TreeMap<String, Integer> map = new TreeMap<String, Integer>(); // в конструктор кладем временный список datalist
        for (String temp : datalist) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        // вывод повторяющихся имен с количеством повторений
        System.out.println("Вывод повторяющихся имен сотрудников с количеством повторений: ");
        printMap(map); 
        // сортировка по убыванию популярности
        System.out.println("Вывод отсортированного списка имен сотрудников по убыванию популярности: ");
        map.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);   
    }    
}
