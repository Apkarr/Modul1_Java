package Modul1.Classes;


public class mycalculator {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        mycalculator.a = 30;
        mycalculator.b = 5;
        System.out.println(mycalculator);
        double num = mycalculator.summa(30, 5);
        System.out.println(num);
        double num1 = mycalculator.subtraction(30, 5);
        System.out.println(num1);
        mycalculator.multiply(30, 5);
        mycalculator.division(30, 5);

    }

}
