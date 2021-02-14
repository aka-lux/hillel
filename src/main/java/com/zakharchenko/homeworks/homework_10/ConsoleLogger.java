package com.zakharchenko.homeworks.homework_10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger extends Logger{

    public ConsoleLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    void log(String message) {
        System.out.print(logFormat(message));
    }

    @Override
    void log(String message, LogLevel level) {
        if( level.getNumber() >= this.logLevel.getNumber() ){
            System.out.print(logFormat(message,level));
        }
    }

}
