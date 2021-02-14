package com.zakharchenko.homeworks.homework_10;

import java.io.*;

public class FileLogger extends Logger {

    public FileLogger(LogLevel logLevel) {
        Logger.logLevel = logLevel;
    }

    @Override
    void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt",true))) {
            writer.append(logFormat(message));
        } catch (IOException e) {
            System.out.println("Exception " + e);
        }
    }

    @Override
    void log(String message, LogLevel level) {
        if (level.getNumber() >= logLevel.getNumber()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt",true))) {
                writer.append(logFormat(message, level));
            } catch (IOException e) {
                System.out.println("Exception " + e);
            }
        }
    }
}
