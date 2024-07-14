package Modul1.Classes;

public class Calculator {
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
   public void division() {
       System.out.println("частное= ");
   }
    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}



