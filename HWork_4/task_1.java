package HWork_4;

import java.util.LinkedList;
import java.util.List;

public class task_1 {
    public static void main(String args[]) {
        List<String> spisok = new LinkedList<>();
        spisok.add("Cat");
        spisok.add("Собака");
        spisok.add("2 + 2 = 4");
        spisok.add("Ketrin");
        System.out.print("Заданный список: " + spisok + System.lineSeparator());
        perevernut(spisok);
    }
    public static void perevernut(List<String> spisok){
        List<String> spisok_2 = new LinkedList<>();
        for(int i = spisok.size() - 1; i >= 0; i--){
            spisok_2.add(spisok.get(i));
        }
        System.out.print("Итоговый список: " + spisok_2);
    }
}