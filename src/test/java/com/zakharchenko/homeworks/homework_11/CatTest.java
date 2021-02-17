package com.zakharchenko.homeworks.homework_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void testMouse() {
        Mouse mouse1 = new Mouse("Mouse1", 10);
        assertEquals(mouse1.toString(), "Mouse(name=Mouse1, calories=10)");
    }

    @Test
    public void testCat() {
        Mouse mouse1 = new Mouse("Mouse1", 100);
        Mouse mouse2 = new Mouse("Mouse2", 200);
        Mouse mouse3 = new Mouse("Mouse3", 300);
        Mouse mouse4 = new Mouse("Mouse4", 400);
        Mouse mouse5 = new Mouse("Mouse5", 500);
        Mouse jerry = new Mouse("Jerry", 460);

        Cat tomCat = new Cat();

        //assert mouse list
        tomCat.eatMouse(mouse1);
        tomCat.eatMouse(mouse2);
        tomCat.eatMouse(mouse3);
        tomCat.eatMouse(mouse4);
        tomCat.eatMouse(mouse5);
        tomCat.eatMouse(mouse3);
        tomCat.takeLaxative();

        tomCat.eatMouse(jerry);
        assertEquals(tomCat.withdrawMouse().toString(), "Mouse(name=Jerry, calories=460)");

        tomCat.takeLaxative();

        tomCat.eatMouse(mouse1);
        tomCat.eatMouse(mouse2);
        tomCat.eatMouse(mouse3);
        tomCat.eatMouse(jerry);
        tomCat.eatMouse(mouse4);
        Assertions.assertTrue(tomCat.takeLaxative().contains(jerry));

    }


}
