package com.zakharchenko.homeworks.homework_10;

import org.junit.jupiter.api.Test;

public class LoggerTest {

    @Test
    public void testEnum(){
        System.out.println(LogLevel.DEBUG.getText());
        System.out.println(LogLevel.DEBUG.getNumber());
    }

    @Test
    public void testConsoleLogger(){
        Logger logger1 = new ConsoleLogger(LogLevel.INFO);
        logger1.log("Message to Log");
        logger1.log("trace",LogLevel.TRACE);
        logger1.log("debug",LogLevel.DEBUG);
        logger1.log("info",LogLevel.INFO);
        logger1.log("warn",LogLevel.WARN);
        logger1.log("error",LogLevel.ERROR);
        logger1.log("fatal",LogLevel.FATAL);
    }

    @Test
    public void testFileLogger(){
        Logger logger1 = new FileLogger(LogLevel.INFO);
        logger1.log("Message to Log");
        logger1.log("trace",LogLevel.TRACE);
        logger1.log("debug",LogLevel.DEBUG);
        logger1.log("info",LogLevel.INFO);
        logger1.log("warn",LogLevel.WARN);
        logger1.log("error",LogLevel.ERROR);
        logger1.log("fatal",LogLevel.FATAL);
    }

}
