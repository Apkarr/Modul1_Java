package Modul1.Classes;


public class mycalculator {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        mycalculator.a = 30;
        mycalculator.b = 5;
        System.out.println(mycalculator);
        double num = mycalculator.summa();
        System.out.println(num);
        double num1 = mycalculator.subtraction();
        System.out.println(num1);
        mycalculator.multiply();
        mycalculator.division();
    }

}
