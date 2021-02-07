package com.zakharchenko.homeworks.homework_10;

public enum LogLevel {
    TRACE(0,"TRACE"),
    DEBUG(1,"DEBUG"),
    INFO(2,"INFO"),
    WARN(3,"WARN"),
    ERROR(4,"ERROR"),
    FATAL(5,"FATAL");

    private final int number;
    private final String text;

    LogLevel(int number,String textValue) {
        this.number = number;
        this.text = textValue;
    }

    public int getNumber() {
        return number;
    }

    public String getText(){return text;}

}
