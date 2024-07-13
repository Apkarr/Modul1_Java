package Modul1.Classes;

public class Calculator {
    int c;
    double a;
    double b;
   public double summa() {
       return a + b;
   }
   public double subtraction() {
       return a - b;
   }
   public void multiply() {
       System.out.println("произведение= ");
   }
   public double division() {
       System.out.println("частное= ");
       return c / b;
   }
    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}



