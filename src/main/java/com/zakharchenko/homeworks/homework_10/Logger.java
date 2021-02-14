package com.zakharchenko.homeworks.homework_10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Logger {
    static LogLevel logLevel;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    abstract void log(String message);

    abstract void log(String message, LogLevel level);

    public String logFormat(String message) {
        return LocalDateTime.now().format(formatter) + " " + logLevel.getText() + ": " + message + "\n";
    }

    public String logFormat(String message, LogLevel level) {
        return LocalDateTime.now().format(formatter) + " " + level.getText() + ": " + message + "\n";
    }

}
