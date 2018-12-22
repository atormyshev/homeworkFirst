package atormyshev.lesson2;

//    2.Создайте число. Определите, является ли число трехзначным.
//        Определите, является ли его последняя цифра семеркой.
//        Определите, является ли число четным.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a >= 100 && a < 1000) {
            System.out.println("number " + a + " is three digit number");
        } else {
            System.out.println("number " + a + " isn`t three digit number");
        }
        if (a % 10 == 7) {
            System.out.println("last digit of a number " + a + " equals 7");
        } else {
            System.out.println("last digit of a number " + a + " does not equals 7");
        }
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }
}

