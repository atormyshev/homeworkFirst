package atormyshev.lesson2;

//6.Дано любое натуральное 4-х значное число.
//  Верно ли, что все цифры числа различны?


import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(8999) + 1000;
        System.out.println("Number x equals: " + a);
        int fourth = a % 10;
        int third = (a / 10) % 10;
        int second = (a / 100) % 10;
        int first = a / 1000;
        if (first == second || first == third || first == fourth || second == third || second == fourth || third == fourth) {
            System.out.println("Верно ли, что все цифры числа различны? " + false);
        } else {
            System.out.println("Верно ли, что все цифры числа различны? " + true);
        }

    }
}

