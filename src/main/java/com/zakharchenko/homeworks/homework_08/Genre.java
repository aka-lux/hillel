package com.zakharchenko.homeworks.homework_08;

public enum Genre {
    FANTASY("Fantasy"),
    ADVENTURE("Adventure"),
    SCIENCE_FICTION("Science Fiction"),
    MOTIVATIONAL("Motivational"),
    HEALTH("Health"),
    HISTORY("History"),
    TRAVEL("Travel");

    private final String value;

    Genre(String value) {
        this.value = value;
    }

   public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

}
