package atormyshev.lesson2;

/* 1.	Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с имеющимся кодом:
public class TaskOne {
public static void main(String[] args) {
		int sec = 4_521_424;
		int min = sec/60;
		int secRest = sec%60;

System.out.println(sec + " seconds is: " + min +" full minutes and " + secRest + " seconds.");
System.out.println("OR");
	}
}
*/

public class Task1 {
    public static void main(String[] args) {
        int sec = 4500;
        int min = sec / 60;
        int secRest = sec % 60;
        System.out.println(sec + " seconds is: " + min + " full minutes and " + secRest + " seconds.");
        System.out.println("OR");
        int hour = min / 60;
        int hourRest = min % 60;
        min = hourRest;
        System.out.println(sec + " seconds is: " + hour + " full hours " + min + " minutes and " + secRest + " seconds.");
        System.out.println("OR");
        int day = hour / 24;
        int dayRest = hour % 24;
        hour = dayRest;
        System.out.println(sec + " seconds is: " + day + " full days " + hour + " hours " + min + " minutes and " + secRest + " seconds.");
        System.out.println("OR");
        int week = day / 7;
        int weekRest = day % 7;
        day = weekRest;
        System.out.println(sec + " seconds is: " + week + " full weeks " + day + " days " + hour + " hours " + min + " minutes and " + secRest + " seconds.");

    }
}
