package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {

    public static void printArray(int[] array) {
        String message = array + ": [";
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            message = message + item;
            if (i < array.length - 1) {
                message = message + ", ";
            } else {
                message = message + "]";
            }
        }
        System.out.println(message);
    }

    public static void printReverseArray(int[] array) {
        String message = array + ": [";
        for (int i = array.length - 1; i >= 0; i--) {
            int item = array[i];
            message = message + item;
            if (i > 0) {
                message = message + ", ";
            } else {
                message = message + "]";
            }
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Array [5] fixed length
        //  0  1  2  3  4 = indexes
        // [10, 5, 3, 2, 1] = Array
        
       //Array [3] fixed length
        //    0       1       2   = indexes
        // ["bob", "sally", "max"]= Array
        //Dec;aromg. Allocating and Initiliazing:
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        // Print out arrays
        System.out.println("intArray2" + Arrays.toString(intArray2));
        System.out.println("intArray3" + Arrays.toString(intArray3));
        System.out.println();

        // initialize array2
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        System.out.println("intArray2" + Arrays.toString(intArray2));
        System.out.println();

        printArray(intArray2);
        printReverseArray(intArray2);
        System.out.println();

        //retrieve objects
        System.out.println("the 4th element in the intArray2 is " + intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();

        // array functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        printReverseArray(intArray3);
        System.out.println();

        // Special for Loop: foreach
        System.out.println("Shopping List");
        for (String s : shoppingList) {
            System.out.println(s);
        }
        System.out.println();
        
        //Random number from an Array?
        Random rand = new Random();
        int num = Math.abs(rand.nextInt() % (intArray3.length));
        int ranum = intArray3[num];
        System.out.println(String.format("The Random number from intArray3 using the random index: %d, is: %d", num,ranum ));
    }
}
