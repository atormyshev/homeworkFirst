package atormyshev.lesson2;

//3.Имеется прямоугольное отверстие размерами а и b.
//  Определить, можно ли его полностью закрыть круглой картонкой радиусом r.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        System.out.println("Стороны прямоугольного отверстия: " + a + " и " + b);
        int r = rand.nextInt(100);
        System.out.println("Радиус круглой картонки: " + r);
        double diag = Math.sqrt((double) (a * a + b * b));
        System.out.println("Диагональ прямоугольного отерстия: " + diag);
        if ((r * 2) >= diag) {
            System.out.println("Картонка полностью закроет данное отверстие? " + true);
        } else {
            System.out.println("Картонка полностью закроет данное отверстие? " + false);
        }

    }
}

