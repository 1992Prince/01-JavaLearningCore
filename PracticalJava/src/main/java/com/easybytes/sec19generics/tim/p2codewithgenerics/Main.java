package com.easybytes.sec19generics.tim.p2codewithgenerics;

record BaseballPlayer(String name, String position) { }
record FootballPlayer(String name, String position) { }

public class Main {

    /*
    Below u will see same Team Generic class is being used by two diff teams i.e. BaseballPlayer and FootballPlayer teams
    also 2 diff teams are using same scoreResult() method

    both above things are happening bcoz of Generics in Java.
     */

    public static void main(String[] args) {

        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addteamMember(harper);
        phillies.addteamMember(marsh);
        phillies.listTeamMembers();

        System.out.println();
        System.out.println();

        Team<FootballPlayer> team1 = new Team<>("India");
        Team<FootballPlayer> team2 = new Team<>("Indonesia");
        scoreResult(team1, 10, team2,5);


    }

    public static <T> void scoreResult(Team<T> team1, int t1_score,
                                       Team<T> team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message,team2);
    }
}
