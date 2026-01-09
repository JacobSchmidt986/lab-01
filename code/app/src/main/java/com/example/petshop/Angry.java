package com.example.petshop;

import java.util.Date;

public class Angry extends Mood{
    public Angry(String mood) {
        super(mood);
    }

    public Angry(String mood, Date moodDate) {
        super(mood, moodDate);
    }

    @Override
    public String feel() {
        return "angry";
    }
}
