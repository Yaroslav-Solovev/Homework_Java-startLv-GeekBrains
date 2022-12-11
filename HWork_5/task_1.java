package HWork_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class task_1 {
    
    static Scanner scanner = new Scanner(System.in);

    public static String getName(){
        System.out.println("Введите имя контакта, которого нужно найти: ");
        return scanner.nextLine();
    }

    public static String getSearch(HashMap<String, String> phoneBook){
        String searchName = getName();
        System.out.println("Список телефонов контакта " + searchName + ":");
        for(String key : phoneBook.keySet()){
            if(searchName.equals(phoneBook.get(key))){
                System.out.println(key);
            }
        }
        return searchName;
    }

    public static void main(String[] args){
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("23-14-23", "Ivanov");
        phoneBook.put("53-65-76", "Ivanov");
        phoneBook.put("89-00-01", "Lipunova");
        phoneBook.put("79-99-00", "Ivanov");
        phoneBook.put("12-35-22", "Petrova");
        phoneBook.put("65-40-21", "Lipunova");
        phoneBook.put("12-35-22", "Kolosov");
        phoneBook.put("13-25-02", "Kolosov");
        // System.out.println(phoneBook.toString());

        Iterator<HashMap.Entry<String, String>> iterator = phoneBook.entrySet().iterator();
        System.out.println("Phone book");
        for (int i = 0; ; ++i) {
            if(iterator.hasNext()) {
                HashMap.Entry<String, String> entry = iterator.next();
                System.out.println(i + " " + entry.getValue() + " " + entry.getKey());
            } else break;
        }
        getSearch(phoneBook);
    }  
}
