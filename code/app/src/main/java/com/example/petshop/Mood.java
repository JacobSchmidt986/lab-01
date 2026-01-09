package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date moodDate;
    private String mood;
    public Mood(String mood){
        this.mood = mood;
        this.moodDate = new Date();
    }
    public Mood(String mood, Date moodDate){
        this.mood = mood;
        this.moodDate = moodDate;
    }

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
    public abstract String feel();
}
