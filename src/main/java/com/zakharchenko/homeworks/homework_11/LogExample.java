package com.zakharchenko.homeworks.homework_11;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogExample {

    public static void main(String[] args) {
        log.info("Example log from {}", LogExample.class.getSimpleName());
        log.info("Example log from ");
    }
}
