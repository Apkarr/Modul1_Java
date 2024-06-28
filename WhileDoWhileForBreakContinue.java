package Modul1;

import java.util.Scanner;

public class WhileDoWhileForBreakContinue {
    public static void main(String[] args) {
        int values = 0;
        int limit = 50;
        while (values < limit) {
            values++;
            if (values % 3 == 0) {
                System.out.println(values);
            }
        }
        int sum = 0;
        int i = 0;
        for (i = 0; i <= 100; i++)
            sum = sum + i; {
            System.out.println(sum);
        }
    }
}
