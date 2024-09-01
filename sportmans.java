package Modul1.Classes;

import java.util.Arrays;

public class sportmans {

    public static  void  main(String[] args) {
        Footballer sportsman = new Footballer("Сергей", "Локомотив", 22);
        sportsman.getName("Сергей");
        sportsman.getTeam("Локомотив");
        sportsman.getAge(22);
        sportsman.ScoringGoals("Сергей", 3);

        HockeyPlayer sportsman1 = new HockeyPlayer("Петр", "ЦСК", 21);
        sportsman1.getName("Петр");
        sportsman1.getTeam("ЦСК");
        sportsman1.getAge(21);
        sportsman1.ScoringPucks("Петр",5);

        Skier sportsman2 = new Skier("Александр", "Самара", 20);
        sportsman2.Biathlon("Александр");
        Skier sportsman3 = new Skier("Иван", "Москва", 24);
        sportsman3.getName("Иван");
        sportsman3.getTeam("СКА");
        sportsman3.getAge(24);
        System.out.println("Участник лыжных соревнований, в: ");
        sportsman3.SkierСategories("Лыжные гонки");
    }

}
