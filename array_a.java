package Modul1.Classes;

import java.util.Arrays;

public class array_a {
    public static void main(String[] args){
        double[] array_a = {4.5, 9.1, 2.3};
        System.out.println("Сортировка массива по убыванию");
        System.out.println(Arrays.toString(sortArray(array_a)));
    }
    private static double[] sortArray(double[] array_a) {
        for (double i = 0; i < array_a.length; i++) {
            for (int j = 0; j < array_a.length - 1; j++) {
                if (array_a[j] < array_a[j + 1]) {
                    double temp = array_a[j];
                    array_a[j] = array_a[j + 1];
                    array_a[j + 1] = temp;
                }
            }
        }
    return array_a;
    }

}
