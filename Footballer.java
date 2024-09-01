package Modul1.Classes;

public class Footballer extends Sportsman {
    public Footballer(String name, String team, int age) {

    }
    public void FootballerKinds (String kinds) {
        System.out.println(kinds);
    }
    public void ScoringGoals (String name, int goals) {
        System.out.println("Футболист " + name + " забил " + goals + " гола(ов)");
    }
}