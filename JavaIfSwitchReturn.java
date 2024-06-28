package Modul1;

public class JavaIfSwitchReturn {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        if (x % 2 == 0) {
            if (y % 2 == 0) {
                System.out.println("Удачное совпадение");
            } else {
                System.out.println(" ");
            }
        } else {
            if (x % 2 != 0) {
                if (y % 2 != 0) {
                    System.out.println("Удачное совпадение");
                } else {
                    System.out.println(" ");
                }
            }
        }
        int day = 31;
        switch (day) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.println("первая декада");
                break;
            case  11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                System.out.println("вторая декада");
                break;
            case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31:
                System.out.println("третья декада");
                break;
        }
    }
}