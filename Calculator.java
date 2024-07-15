package Modul1.Classes;

public class Calculator {
    double a;
    double b;
    public double summa(double a, double b) {
       return a + b;
   }
   public double subtraction(double a, double b) {
       return a - b;
   }
   public void multiply(double a, double b) {
        double mult = a * b;
       System.out.println("произведение= " + mult);
   }
   public void division(double a, double b) {
        double div = a / b;
       System.out.println("частное= " + div);
   }
   double division_a(int c, double d) {
       return c / d;
   }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}



