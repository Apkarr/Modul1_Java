package Modul1.Classes;

public class Calculator {
   double a;
   double b;
   public double summa() {
       System.out.println("сумма= " + (a + b));
       return a + b;
   }
   public double subtraction() {
       System.out.println("разность= " + (a - b));
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



