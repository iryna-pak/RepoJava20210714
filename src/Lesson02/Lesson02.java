package Lesson02;

public class Lesson02 {
    public static int valueInClass = 10;

    public static void main(String[] args) {
//        int valueInMethodMain = 20;
//
//        System.out.println(valueInClass);
//        System.out.println(valueInMethodMain);

//        studySwitchOperator();
//        {
//            System.out.println(valueInClass);
//            System.out.println(valueInMethodMain);
//            int a = 130;
//            System.out.println(a);
//        }

//        int abc = 20;
//        int cde = 30;
//        int result;
//
//        if (abc > cde) {
//            result = abc;
//        } else {
//            result = cde;
//        }
//
//        result = (abc > cde) ? abc : cde; //тернарный оператор
//
//        System.out.println("Result = " + result);

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello " + i);
//        }

//        System.out.println("Result method myMath = " + myMath(2, 10));
//        System.out.println("Goto shop count > " + goToShop(1000));

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }
//        table(10,10);

//        int test1 = 10;
//
//        while(test1 < 10) {
//            test1++;
//            if (test1 == 5 || test1 == 7) continue;
//            System.out.print(test1 + " ");
//        }
//
//        System.out.println("******");
//
//        int test2 = 0;
//
//        do {
//            test2++;
//            if (test2 == 4) continue;
//            System.out.print(test2 + " ");
//        } while (test2 < 10);

        goToShop2(1000);

    }

    public static int myMath(int base, int signature) {
        int result = base;
        for (int i = 0; i < signature - 1; i++) {
            result *= base; //
        }
        return result;
    }

    public static int goToShop1(int cash) {
        int price = 30;
        int count = 0;

        for (int i = 1; ; i++) {
            System.out.println("Go shop > " + i);
            cash -= price;
            System.out.println("My cash = " + cash);
            count++;
            if (cash < price) {
                System.out.println("Cash not found");
                return count;
            }
        }

    }

    public static void goToShop2(int cash) {
        int price = 30;
        int count = 0;

        while (cash > price) {
            System.out.println("My Start cash after go to shop is " + cash);
            cash -= price;
            System.out.println("Item price is " + price + ". Before buying my cash is " + cash);
            count++;
            System.out.println(" I go to shop number " + count);
        }

        System.out.println("cashback = " + cash);
        System.out.println("go to shop count " + count);

    }

    public static void table(int height, int width) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }

//    public static int doSomething1() {
//        //....
//        return 45;
//    }
//
//    public static int doSomething2() {
//        //....
//        return 125;
//    }

//    public static void studySwitchOperator() {
//        System.out.println(valueInClass);
////        System.out.println(valueInMethodMain);
//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Olga") {
//            System.out.println(valueInClass);
//            System.out.println("Give letter to Olga");
//        } else if (nameLetter == "Maria") {
//            System.out.println("Give letter to Maria");
//        } else if (nameLetter == "Elena") {
//            System.out.println("Give letter to Elena");
//        } else if (nameLetter == "Alex") {
//            System.out.println("Give letter to Alex");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("**********");
//
//        switch (nameLetter) {
//            case "Olga": //nameLetter == "Olga"
//                System.out.println("Give letter to Olga");
//                break;
//            case "Maria": //nameLetter == "Maria"
//                System.out.println("Give letter to Maria");
//                break;
//            case "Elena": //"Give letter to Elena"
//                System.out.println("Give letter to Elena");
//                break;
//            case "Alex":
//                System.out.println("Give letter to Alex");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }
//    }
}
