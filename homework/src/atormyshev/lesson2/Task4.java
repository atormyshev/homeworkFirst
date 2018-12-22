package atormyshev.lesson2;

/*4.Имеется целове число (задать с помощью
        Random rand = new Random();int x = rand.nextInt() ).
        Это число – количесво денег в рублях.
        Вывести это число, добавив к нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10000);
        if (x % 10 > 4 || x % 100 == 14 || x % 10 == 0 || x % 100 == 11) {
            System.out.println(x + " рублей");
        } else if (x % 10 < 5 && x % 10 > 1) {
            System.out.println(x + " рубля");
        } else if (x % 10 == 1) {
            System.out.println(x + " рубль");
        }
    }
}

