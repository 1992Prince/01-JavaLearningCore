package com.easybytes.sec19generics.tim.p1codewithoutgenerics;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    /*
    Now think we have BaseBallTeam Application and it sold well for BaseballPlayers
    Now FootballPlayers is also intreseted in using it
    But this BaseballTeam application is designed for BaseballPlayers only
    One solution is copy and paste BaseballTeam and rename it to FootballTeam and create FootballPlayer
     */

    private String teamName;

    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addteamMember(BaseballPlayer player) {
        if (!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println("Team " + teamName + " roster: ");
        for (BaseballPlayer player : teamMembers){
            System.out.println(player);
        }
    }

    // The best team should have the highest rank. This means the team with the most wins,
    //is ranked number 1
    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){

        String message = "lost to";
        if (ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore){
            totalTies++;
            message = "tied with";
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString(){
        return teamName + " (Ranked " + ranking() + ")";
    }
}
