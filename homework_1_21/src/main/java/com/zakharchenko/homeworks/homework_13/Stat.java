package com.zakharchenko.homeworks.homework_13;

import java.util.Arrays;

public class Stat<T extends Number> {
    private T[] data;

    public Stat(T[] data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public Double average() {
        double average = 0.0;
        for (T num : data) {
            average += num.doubleValue();
        }
        return average / data.length;
    }

    public boolean isSameAverage(Stat<?> stat) {
        return average().equals(stat.average());
    }

}
