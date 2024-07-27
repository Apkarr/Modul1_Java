package Modul1.Classes;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
    private static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
