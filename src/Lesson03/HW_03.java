package Lesson03;

public class HW_03 {
    public static void main(String[] args) {

        System.out.println("\n********\tTask1\t********\n");
        zeroOneArray();

        System.out.println("\n********\tTask2\t********");
        myArray100();

        System.out.println("\n********\tTask3\t********");
        multiArray();

        System.out.println("\n********\tTask4\t********");
        myArrayTable(5);

        System.out.println("\n********\tTask5\t********");
        myInitialValueArray(10, 8);

        System.out.println("\n********\tTask6\t********");
        minMaxArray();

    }

//1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0
    public static void zeroOneArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Длина массива:  " + arr.length);
        System.out.print("Начальний массив:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            arr[i] = (arr[i] == 0) ? 1 : 0;
            //if (arr[i] == 1) {
            //    arr[i] = 0;
            //} else {
            //    arr[i] = 1;
            //}
        }
        System.out.print("\nКонечный результат:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

//2.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void myArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
            }
        System.out.println();
        }

// 3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void multiArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Длина массива:  " + arr.length);
        System.out.print("Начальний массив:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
            //arr[i] = (arr[i] < 6) ? arr[i] *= 2;
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.print("\nКонечный результат:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

//4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void myArrayTable(int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i == j) ? 1 : 0;
            }
            arr[i][arr.length - i - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


//5.Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] myInitialValueArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {

        }
        return arr;
    }

//6.* Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void minMaxArray() {
        int[] arr = {1, 5, -3, -2, -11, -4, -5, 2, -4, -8, -9, 12};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])  {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
    }


//7.Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры:     checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//              checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1




}

