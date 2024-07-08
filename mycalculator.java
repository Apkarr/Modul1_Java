package Modul1.Classes;


public class mycalculator {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        double sum;
        double r;
        double m;
        double d;
        mycalculator.a = 3;
        mycalculator.b = 5;
        sum = mycalculator.a + mycalculator.b;
        r = mycalculator.a - mycalculator.b;
        m = mycalculator.a * mycalculator.b;
        d = mycalculator.a / mycalculator.b;
        System.out.println(sum);
        System.out.println(r);
        mycalculator.multiply();
        mycalculator.division();
    }
}
