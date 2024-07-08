package Modul1.Classes;


public class mycalculator {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        double sum;
        double r;
        mycalculator.a = 12.6;
        mycalculator.b = 9.5;
        sum = mycalculator.a + mycalculator.b;
        r = mycalculator.a - mycalculator.b;
        System.out.println(sum);
        System.out.println(r);
        mycalculator.multiply();
        mycalculator.division();
    }
}
