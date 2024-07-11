package Modul1.Classes;


public class mycalculator {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        mycalculator.a = 60;
        mycalculator.b = 3.5;
        System.out.println(mycalculator);
        mycalculator.summa();
        mycalculator.subtraction();
        mycalculator.multiply();
        mycalculator.division();
    }
}
