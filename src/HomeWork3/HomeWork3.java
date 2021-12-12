package HomeWork3;
import java.util.Random;

public class HomeWork3 {

    public static Random random = new Random();

    public static void main(String[] args) {

        int[] myArrayInt = new int[10];
        int[] myArrayInt2 = new int [100];
        int[] myArrayInt3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] myArrayInt4 = new int [10][10];

        fillArray(myArrayInt);
//        for (int i = 0; i < myArrayInt.length; i++) {
//            System.out.print(myArrayInt[i] + " | ");
//        }
        readArray(myArrayInt);

        System.out.print("\n" + "***************************************" + "\n");

        changeArray(myArrayInt);

        System.out.print("\n" + "***************************************" + "\n");

        fillArray100(myArrayInt2);
        readArray(myArrayInt2);

        System.out.print("\n" + "***************************************" + "\n");

        doubleNumberArray(myArrayInt3);

        System.out.print("\n" + "***************************************" + "\n");

        oneMiddleArray(myArrayInt4 );
        readOneMiddleArray(myArrayInt4);

        System.out.print("\n" + "***************************************" + "\n");

        oneArray(10,15);

    }


    public static void fillArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = random.nextInt(2);
        }
    }

    public static void readArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
    }


    public static void changeArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0){
               System.out.print((inputArray[i] = 1) + " | ");
            } else {
                System.out.print((inputArray[i] = 0) + " | ");
            }
        }
    }

   public static void fillArray100(int[] inputArray2){
        for (int i = 0; i < inputArray2.length; i++){
            inputArray2[i] = i+1;
        }
   }

    public static void doubleNumberArray(int[] inputArray3) {
        for (int i = 0; i < inputArray3.length; i++) {
            if (inputArray3[i] < 6){
                System.out.print((inputArray3[i] * 2) + " | ");
            } else {
                System.out.print(inputArray3[i] + " | ");
            }
        }
    }

    public static void oneMiddleArray(int[][] arr) {
//        int[][] arr = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(20);
                if (i == j){
                        arr[i][j] = 1;

                } else {
                    arr[i][arr[i].length - (i+1)] = 1;
                }
                }
            }
        }

    public static void readOneMiddleArray(int[][] arr) {
//        int[][] arr = new int [x][y];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t" );

            }
            System.out.println();
        }
    }

    public static void oneArray(int len, int initialValue){
        int [] arr1 = new int [len];
        for (int i=0; i < len; i++) {
            arr1[i] = initialValue;

            System.out.print(arr1[i] + "\t");
        }
    }

}