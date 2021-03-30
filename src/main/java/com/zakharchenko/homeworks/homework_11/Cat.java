package com.zakharchenko.homeworks.homework_11;

import lombok.Value;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Cat {
    private TreeSet<Mouse> stomach = new TreeSet<Mouse>((o1, o2) -> (o1.getCalories().compareTo(o2.getCalories())));
    public boolean eatMouse(Mouse mouse) {
        if (stomach.size() < 5) {
            stomach.add(mouse);
            return true;
        }
        return false;
    }

    public Mouse withdrawMouse() {
        return stomach.pollFirst();
    }

    public TreeSet<Mouse> takeLaxative() {
        TreeSet<Mouse> substance = new TreeSet<Mouse>((o1, o2) -> (o1.getCalories().compareTo(o2.getCalories())));
        substance.addAll(stomach);
        stomach.clear();
        return substance;
    }

}
