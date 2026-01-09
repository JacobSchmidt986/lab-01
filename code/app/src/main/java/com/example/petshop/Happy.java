package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{
    public Happy(String mood) {
        super(mood);
    }

    public Happy(String mood, Date moodDate) {
        super(mood, moodDate);
    }

    @Override
    public String feel() {
        return "happy";
    }
}
