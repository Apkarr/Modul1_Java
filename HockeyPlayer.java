package Modul1.Classes;

public class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, String team, int age) {
    }
    public void HockeyKinds(String kinds) {
        System.out.println(kinds);
    }
    public void ScoringPucks(String name, int pucks) {
        System.out.println("Хоккеист " + name + " забил " + pucks + " шайб(у), в ворота противника");
    }
}

