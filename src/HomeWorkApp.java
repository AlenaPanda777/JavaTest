public class HomeWorkApp {

    public static void main(String[] args) {

        String nameFruit1 = "Orange";
        String nameFruit2 = "Banana";
        String nameFruit3 = "Apple";
        printThreeWords(nameFruit1, nameFruit2, nameFruit3);

        int number1 = 10;
        int number2 = -11;
        checkSumSign(number1, number2);

        int number3 = 1010;
        printColor(number3);

        int number4 = 5;
        int number5 = -4;
        compareNumbers(number4, number5);
    }

    public static void printThreeWords(String fruit1, String fruit2, String fruit3) {
        System.out.println(fruit1 + "\n" + fruit2 + "\n" + fruit3);
//        System.out.println (fruit1);
//        System.out.println (fruit2);
//        System.out.println (fruit3);
    }

    public static void checkSumSign(int a, int b){
        if ((a + b) >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int value){
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value<= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers (int a, int b){
        if (a >= b){
            System.out.println("a⩾b");
        }else {
            System.out.println("a<b");
        }
    }
}
