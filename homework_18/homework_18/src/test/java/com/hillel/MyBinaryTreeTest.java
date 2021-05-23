package com.hillel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBinaryTreeTest {

    MyTree<Integer> tree = new MyBinaryTree<Integer>();

    @Test
    public void TreeTest(){
        tree.add(12);
        tree.add(2);
        tree.add(100);
        tree.add(44);
        System.out.println(tree);
        System.out.println(tree.get(44));
        System.out.println(tree.get(45));
        tree.delete(44);
    }


}