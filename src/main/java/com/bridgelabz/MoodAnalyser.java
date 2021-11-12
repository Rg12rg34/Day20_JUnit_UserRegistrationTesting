package com.bridgelabz;

/**
 * Purpose  - Mood Analyser for user
 *
 * @author - Yogendra Lalit Sharma
 * @version - 16.0
 * @since - 2021-11-10
 */

public class MoodAnalyser {

    public static String analyseMood(String mood) {
        if (mood.toLowerCase().contains("happy")) {
            return "Entry Successful";
        } else if (mood.toLowerCase().contains("sad")) {
            return "Entry Failed";
        } else return null;
    }
}