package com.zakharchenko.homeworks.homework_16;

import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) {
        try {
            Class<?> cl = Class.forName("com.zakharchenko.homeworks.homework_16.MyAnnoTest");
            Method[] method = cl.getDeclaredMethods();
            for (Method md : method) {
                if (md.isAnnotationPresent(MyTest.class)) {

                    try {
                        md.invoke(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }

        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
