package com.easybytes.sec19generics.tim.p2codewithgenerics;

import java.util.ArrayList;
import java.util.List;

/*
Team is not Generic class
now T can be FootballPlayer of BaseballPlayer or any other type
 */
public class Team<T> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addteamMember(T t) {
        if (!teamMembers.contains(t)){
            teamMembers.add(t);
        }
    }

    public void listTeamMembers(){
        System.out.println("Team " + teamName + " roster: ");
        for (T player : teamMembers){
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
