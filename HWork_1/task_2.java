// Программа, которая выводит все простые числа от 1 до 1000
package HWork_1;

public class task_2 {
    public static void main(String[] args){
        int limit = 100;
        for (int i = 1; i <= limit; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && j < i) {
                    break;
                } 
                else 
                    if (j == i) {
                        System.out.print(i + ", ");
                    }
            }
        }   
    }

}
