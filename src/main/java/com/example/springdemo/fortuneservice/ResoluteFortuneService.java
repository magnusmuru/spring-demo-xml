package com.example.springdemo.fortuneservice;

import java.lang.reflect.Array;
import java.util.Random;

public class ResoluteFortuneService implements FortuneService {
    String[] fortunes = new String[]{"Today will be painful, but it will be worth it in the end!","You can do it!",
            "Nothing is impossible, so just do it!"};

    @Override
    public String getFortune() {
        int rnd = new Random().nextInt(fortunes.length);
        return fortunes[rnd];
    }
}
