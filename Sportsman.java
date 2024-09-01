package Modul1.Classes;

public class Sportsman {
    private String name, team;
    private int age;

    public void getName(String name) {
        this.name = name;
        System.out.println("Участвует в соревнованиях " + name);
    }
    public void getTeam(String team) {
        this.team = team;
        System.out.println("Выступает за Спортивный клуб: " + team);
    }

    public void getAge(int age) {
        this.age = age;
        System.out.println("Возраст спортсмена: "+ age);
    }
}