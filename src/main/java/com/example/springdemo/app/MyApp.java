package com.example.springdemo.app;

import com.example.springdemo.coach.Coach;
import com.example.springdemo.coach.TrackCoach;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
