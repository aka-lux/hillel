package com.zakharchenko.homeworks.homework_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileLogger extends Logger {

    public FileLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    void log(String message) {
        try (FileOutputStream fos = new FileOutputStream("log.txt")) {
            fos.write(logFormat(message).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Exception "+ e);
        }
    }

    @Override
    void log(String message, LogLevel level) {
        if (level.getNumber() >= this.logLevel.getNumber()) {
            try (FileOutputStream fos = new FileOutputStream("log.txt",true)) {
                fos.write(logFormat(message, level).getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                System.out.println("Exception "+ e);
            }
        }
    }
}
