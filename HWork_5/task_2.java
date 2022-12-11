// Пусть дан список сотрудников. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности
package HWork_5;

import java.util.ArrayList;
import java.util.HashMap;

public class task_2 {
    public static void printMap(HashMap<String, Integer> map){ // подчет повторений имен сотрудников
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Повторений: " + entry.getValue());
        }
    }
    public static void main(String[] args) throws Exception {

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
            // searchBook.put(arrStrings[1], arrStrings[0]);
            // searchBook.put(i, arrStrings[0]);
            datalist.add(arrStrings[0]);
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>(); // в конструктор кладем временный список datalist
        for (String temp : datalist) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }

        printMap(map);



    }    
}
