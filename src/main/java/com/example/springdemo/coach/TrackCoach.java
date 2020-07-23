package com.example.springdemo.coach;

import com.example.springdemo.fortuneservice.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doStartupStuff(){
        System.out.println("TrackCoach: inside method doStartupStuff");
    }

    // add a destroy method
    public void doCleanupStuff(){
        System.out.println("TrackCoach: inside method doCleanupStuff");
    }




}
