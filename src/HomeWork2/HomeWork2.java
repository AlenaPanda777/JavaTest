package HomeWork2;

public class HomeWork2 {

    public static void main(String[] args) {
        if (checkSum(-10, 25)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("___________________");

        if (intNumber(-8)) {
            System.out.println("Мы в плюсе!!!");
        } else {
            System.out.println("Опять не повезло");
        }

        System.out.println("___________________");

//        int d = -1500000000;
//        intNumber1(d);
        if (intNumber1(-8)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println("___________________");

        int e = 10;
        String string1 = "Хочу научиться Java!!!";

        printStrings(e, string1);

        System.out.println("___________________");

        if (leapYear(1100)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Обычный год");
        }
    }

        public static boolean checkSum ( int a, int b){

            return ((a + b) >= 10 && (a + b) <= 20);
        }

        public static boolean intNumber ( int c){

        return c >= 0;
        }

//        public static void intNumber1 ( int d){
//            if (d < 0){
//                System.out.println("TRUE");
//            }else if (d > 0){
//                System.out.println("FALSE");
//            }
//        }
        public static boolean intNumber1 (int d){
        return d<0;
    }


        public static void printStrings(int height, String string2){
            for (int i = 1; i <= height; i++) {
                System.out.println(string2);
            }

        }

        public static boolean leapYear (int e){
                return ((e/400) == (int)(e/400)||((e/4) ==(int)(e/4))) && ((e/100) != (int)(e/100));
        }


    }



