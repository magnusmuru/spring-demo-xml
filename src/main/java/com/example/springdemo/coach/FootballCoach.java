package com.example.springdemo.coach;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Dribble for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
