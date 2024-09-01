package Modul1.Classes;

public class Skier extends Sportsman {
    public Skier(String name, String team, int age) {

    }

    public void SkierСategories(String сategories) {
        System.out.println("Категории: " + сategories);
    }

    public void Biathlon(String name) {
        System.out.println("Биатлонист " + name + " выполнил стрельбу без единого промаха!");
    }
}