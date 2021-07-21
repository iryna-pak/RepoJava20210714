package Lesson03;

import java.util.Random;
import java.util.Scanner;

    /**
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 21.07.2021
     */

    public class Gold {

        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        public static void main(String[] args) {
//        String username = "Vasya";
//        System.out.println("Hello world");
//
//        greetingUser(username);
//        greetingUser("Alex");
//
//        System.out.print("Enter your nickname: ");
//        String inputUserString = scanner.next();
//        greetingUser(inputUserString); //greetingUser(scanner.next());
//
//        System.out.print("Enter your number: ");
//        int inputUserInteger = scanner.nextInt();
//        System.out.println("Result: " + myCalcSum(inputUserInteger));
//        System.out.println(random.nextInt()); //[-int;+int]
//        System.out.println(random.nextFloat()); //[0.0000000;1)
//        System.out.println(random.nextInt(20));//[0;+]
//        System.out.println(randomIntegerRange(-60, -20));//[-;0]
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(randomIntegerRange(10, 12) + " ");
//        }

//        System.out.println("Random password = " + randomPassword(50));
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(randomPassword(5) + " ");
//        }
//
//        System.out.println();
//
//        System.out.print("Enter count word in text: ");
//        int countWord = scanner.nextInt();
//
//        System.out.print("Enter count char in word: ");
//        int countChar = scanner.nextInt();
//
//        createRandomText(countWord, countChar);

//        createRandomText(inputUserData("Enter count word"), inputUserData("Enter count char"));

//        greetingUser("ALex");
//        greetingUser("Alex", "Pupkin");
//        greetingUser("Alex", "Pupkin", "8-800-800-80-80");


//        scanner.close();

//        int[] arrayInt = new int[5];
//        arrayInt[0] = 15;
//        arrayInt[1] = 20;
//        arrayInt[2] = -5;
//        arrayInt[3] = 0;
//        arrayInt[4] = 6;
//
//        int tmp = arrayInt[2];
//        System.out.println(tmp);
//        System.out.println(arrayInt[2] + arrayInt[4]);
//        System.out.println(arrayInt[0]);
//
//        String[] myArrayString = {"String1", "String2", "String3"};
//        System.out.println(myArrayString[1]);

//        String[] myTestArray = new String[100];
//        for (int i = 0; i < myTestArray.length; i++) {
//            myTestArray[i] = "String #" + i;
//        }
//
//        System.out.println("Address in OP: " + myTestArray);

//        for (int i = 0; i < myTestArray.length; i++) {
//            System.out.print(myTestArray[i] + " ");
//        }

//        printArrayInConsole(myTestArray);
//
//        String[] container = writeDataInArray(myTestArray, "Box");
//
//        printArrayInConsole(container);
//

//        int[][] myIntegerArray2 = new int[6][];
//
//        printArray(writeData(myIntegerArray2));

//        exampleArrayCoordinates(10, 4);

//        int[][][][][][][][][][][][][] bigArray = new int[1][2][3][4][5][6][7][8][9][10][1][2][3];
//        int[][][] bigArray1 = new int[1][2][3];
//
//        for (int i = 0; i < bigArray.length; i++) {
//            for (int j = 0; j < bigArray[i].length; j++) {
//                for (int k = 0; k < bigArray[i][j].length; k++) {
//                    for (int l = 0; l < bigArray[i][j][k].length; l++) {
//                        for (int m = 0; m < bigArray[i][j][k][l].length; m++) {
//                            ///.....
//                        }
//                    }
//                }
//            }
//        }

//        int[][] myTableArray = new int[3][8];
//        int count = 0;
//
//        for (int i = 0; i < myTableArray.length; i++) {
//            for (int j = 0; j < myTableArray[i].length; j++) {
//                myTableArray[i][j] = count;
//                count++;
//            }
//        }
//
//        for (int i = 0; i < myTableArray.length; i++) {
//            for (int j = 0; j < myTableArray[i].length; j++) {
//                System.out.print(myTableArray[i][j] + "\t");
//            }
//            System.out.println();
//        }

        }
//
//    public static String[] writeDataInArray(String[] inputArray, String value) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = value + "#" + (i + 1);
//        }
//        return inputArray;
//    }
//
//    public static void printArrayInConsole(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " ");
//        }
//        System.out.println();
//    }

//    public static int inputUserData(String msg) {
//        System.out.print(msg + ": ");
//        return scanner.nextInt();
//    }
//
//    public static void createRandomText(int countWord, int countCharInWord) {
//        if (countCharInWord < 0) {
//            countCharInWord = -countCharInWord;
//        }
//        for (int i = 0; i < countWord; i++) {
//            System.out.print("[" + randomPassword(random.nextInt(countCharInWord)) + "] ");
//        }
//    }
//
//    public static String randomPassword(int count) {
//        String tmpString = "";
//
//        for (int i = 0; i < count; i++) {
//            int valueAscii = randomIntegerRange(70, 120);
//            char tmpChar = (char) valueAscii;
//            tmpString += tmpChar;
//        }
//
//        return tmpString;
//    }
//
//    public static int randomIntegerRange(int min, int max) {
//        int diff = max - min;
//        int value = random.nextInt(diff + 1);
//        return min + value;
//    }

//    public static void greetingUser(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    public static void greetingUser(String name, String surname) {
//        System.out.println("Hello " + name + " " + surname);
//    }
//
//    public static void greetingUser(String name, String surname, String phoneNumber) {
//        System.out.println("Hello " + name + " " + surname + " . Your phone number is " + phoneNumber);
//    }
//
//    public static void greetingUser(int name, String surname, String phoneNumber) {
//        System.out.println("Hello " + name + " " + surname + " . Your phone number is " + phoneNumber);
//    }
//
//    public static void greetingUser(String name, String surname, int phoneNumber) {
//        System.out.println("Hello " + name + " " + surname + " . Your phone number is " + phoneNumber);
//    }

//    public static int myCalcSum(int valueA) {
//        return valueA + 10;
//    }

        public static int[][] writeData(int[][] inputArray) {
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = new int[random.nextInt(10)];
            }

            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = random.nextInt(100);
                }
            }

            return inputArray;
        }


        /**
         * Этот метод распечатывает двухмерный массив
         *
         * @param inputArray - аргумент, на вход подаем двухмерный массив из int
         */
        public static void printArray(int[][] inputArray) {
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    System.out.print(inputArray[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static void exampleArrayCoordinates(int valueI, int valueJ) {
            String[][] array = new String[valueI][valueJ];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = i + ";" + j;
                }
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("[" + array[i][j] + "] ");
                }
                System.out.println();
            }


        }


    }


