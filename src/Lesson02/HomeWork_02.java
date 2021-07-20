package Lesson02;

public class HomeWork_02 {
    public static void main(String[] args) {
        System.out.println("\n*****  Task 1 *****");
        test_sumWithin(5, 4);
        test_sumWithin(5, 5);
        test_sumWithin(5, 6);
        test_sumWithin(11, 4);
        test_sumWithin(11, 8);
        test_sumWithin(11, 9);
        test_sumWithin(19, 2);
        test_sumWithin(-100, 200);
        test_sumWithin(10, -1);

        System.out.println("\n*****  Task 2 *****");
        for (int a = -1; a <= 1; a++) {
            if (checkSign(a)) { // иф анализирует результат работы метода
                System.out.println(a + "- Positive");
            } else {
                System.out.println(a + "- Negative");
            }
        }

        System.out.println("\n*****  Task 3  *****");
        for (int a = -1; a <= 1; a++) {
            System.out.println(a + " - " + isNegative(a));
        }

        System.out.println("\n*****  Task 4  *****");
        worldRepeat("Iryna", 5);

        System.out.println("\n*****  Task 5  *****");
        for (int i = 1899; i <= 2021; i++) {
            System.out.println(i + " - " + isOdd(i));
        }
    }

    /* 1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean sumWithin(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
        /*if(sum >= 10 && sum <= 20) {
         return true;
        } else {
        return false;
        }
        */
    }

    private static void test_sumWithin(int a, int b) {
        System.out.println(a + b + " = " + sumWithin(a, b));
    }

    /* 2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    private static boolean checkSign(int a) {
        return a >= 0;
        /*if(a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }*/
    }

    /* 3.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
     */
    private static boolean isNegative(int a) {
        return a < 0;
        /*if(a < 0) {
         return true;
        } else {
        return false;
        }
        */
    }

    /* 4.Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    private static void worldRepeat(String name, int repeat) {
        for (int i = 1; i <= repeat; i++)
            System.out.println(i + " " + name);
    }

    /*
    5. Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static boolean isOdd(int year) {
        if(year % 400 == 0) {
            return true;
        }
        int rest = year % 100;
        if(rest == 0) {
            return false;
        }
        return rest % 4 == 0;

        /*
        int rest = year % 100;
        if(year % 400 == 0) { (Каждый 400й год) Если год делится на 400 без остатка, то он високосный - вернуть "правда"
            return true;      иначе иду дальше
        } else if(rest == 0) { (Каждый 100й год) Если год делится на 100 без остатка, то он не високосный - вернуть "ложь".
            return false;      Если год делится на 100 с остатком - иду дальше
        } else {
            if(rest % 4 == 0) { (Каждый 4й год) Если остаток от деления года на 100 поделился на 4 без остатка, то год високосный - вернуть "правду"
                return true;
            } else {             иначе - вернуть "ложь"
                return false;
            }
            */

    }
}