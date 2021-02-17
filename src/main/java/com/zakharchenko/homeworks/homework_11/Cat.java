package com.zakharchenko.homeworks.homework_11;

import lombok.Value;

import java.util.ArrayDeque;
import java.util.HashSet;

public class Cat {
    private ArrayDeque<Mouse> stomach = new ArrayDeque<Mouse>(5);

    public boolean eatMouse(Mouse mouse) {
        if (stomach.size() < 5) {
            stomach.add(mouse);
            return true;
        }
        return false;
    }

    public Mouse withdrawMouse() {
            return stomach.removeFirst();
    }

    public HashSet<Mouse> takeLaxative() {
        HashSet<Mouse> substance = new HashSet<>();
        substance.addAll(stomach);
        stomach.clear();
        return substance;
    }

}
