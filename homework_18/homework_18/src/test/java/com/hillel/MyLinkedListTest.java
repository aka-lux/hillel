package com.hillel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyList<Integer> list = new MyLinkedList<Integer>();

    @Test
    public void ListTest(){
        list.add(4);
        list.add(9);
        list.add(48);

        Assertions.assertEquals(list.get(0),4);
        Assertions.assertEquals(list.get(2),48);
        Assertions.assertEquals(list.size(),3);

        Assertions.assertEquals(list.toString(),"{4, 9, 48}");

        list.remove(1);
        Assertions.assertEquals(list.size(),2);

        Assertions.assertEquals(list.get(0),4);
        Assertions.assertEquals(list.get(1),48);

    }



}