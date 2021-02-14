package com.zakharchenko.homeworks.homework_11;

import lombok.Value;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Cat {
    private ArrayDeque<Mouse> stomach = new ArrayDeque<Mouse>(5);
    private LinkedList<Mouse> substance = new LinkedList<Mouse>();

    public void eatMouse(Mouse mouse) {
        if (stomach.size() < 5) {
            stomach.add(mouse);
        }
    }

    public LinkedList<Mouse> withdrawMouse() {
        substance.clear();
        if (stomach.size() > 0) {
            substance.add(stomach.removeFirst());
        }
        return new LinkedList<>(substance);
    }

    public LinkedList<Mouse> takeLaxative() {
        substance.clear();
        for (Mouse mouse : stomach) {
            substance.add(stomach.pollFirst());
        }
        return new LinkedList<>(substance);
    }


}
