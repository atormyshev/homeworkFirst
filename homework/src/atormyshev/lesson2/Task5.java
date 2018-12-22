package atormyshev.lesson2;

//5.Определить число, полученное выписыванием
//в обратном порядке цифр любого 4-х значного натурального числа n.

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(8999) + 1000;
        System.out.println("Number x equals: " + x);
        int fourth = x % 10;
        int third = (x / 10) % 10;
        int second = (x / 100) % 10;
        int first = x / 1000;
        x = fourth * 1000 + third * 100 + second * 10 + first;
        System.out.print("Number x in the reverse order is: " + x);

    }
}

