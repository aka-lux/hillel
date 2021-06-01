package com.hillel;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CollectionsBenchmarkTest {

    CollectionsBenchmark cb = new CollectionsBenchmark();

    @Test
    @Order(1)
    public void fillCollectionTest() {
        System.out.println("fill arrayList " + cb.fillCollection(cb.arrayList, 1000000)+" ms");
        System.out.println("fill linkedList " + cb.fillCollection(cb.linkedList, 1000000)+" ms");
        System.out.println("fill treeSet " + cb.fillCollection(cb.treeSet, 1000000)+" ms");
        System.out.println("fill hashSet " + cb.fillCollection(cb.hashSet, 1000000)+" ms");
        System.out.println();
        System.out.println("getFromBegin arrayList " + cb.getFromCollection(cb.arrayList, 100)+" ms");
        System.out.println("getFromBegin linkedList " + cb.getFromCollection(cb.linkedList, 100)+" ms");
        System.out.println("getFromBegin treeSet " + cb.getFromCollection(cb.treeSet, 100)+" ms");
        System.out.println("getFromBegin hashSet " + cb.getFromCollection(cb.hashSet, 100)+" ms");
        System.out.println();
        System.out.println("getFromMiddle arrayList " + cb.getFromCollection(cb.arrayList, 5000)+" ms");
        System.out.println("getFromMiddle linkedList " + cb.getFromCollection(cb.linkedList, 5000)+" ms");
        System.out.println("getFromMiddle treeSet " + cb.getFromCollection(cb.treeSet, 5000)+" ms");
        System.out.println("getFromMiddle hashSet " + cb.getFromCollection(cb.hashSet, 5000)+" ms");
        System.out.println();
        System.out.println("getFromEnd arrayList " + cb.getFromCollection(cb.arrayList, 999700)+" ms");
        System.out.println("getFromEnd linkedList " + cb.getFromCollection(cb.linkedList, 999700)+" ms");
        System.out.println("getFromEnd treeSet " + cb.getFromCollection(cb.treeSet, 999700)+" ms");
        System.out.println("getFromEnd hashSet " + cb.getFromCollection(cb.hashSet, 999700)+" ms");
        System.out.println();
        System.out.println("addToBegin arrayList " + cb.addToCollection(cb.arrayList, 1000, 100)+" ms");
        System.out.println("addToBegin linkedList " + cb.addToCollection(cb.linkedList, 1000, 100)+" ms");
        System.out.println("addToBegin treeSet " + cb.addToCollection(cb.treeSet, 1000, 100)+" ms");
        System.out.println("addToBegin hashSet " + cb.addToCollection(cb.hashSet, 1000, 100)+" ms");
        System.out.println();
        System.out.println("addToMiddle arrayList " + cb.addToCollection(cb.arrayList, 1000, 5000)+" ms");
        System.out.println("addToMiddle linkedList " + cb.addToCollection(cb.linkedList, 1000, 5000)+" ms");
        System.out.println("addToMiddle treeSet " + cb.addToCollection(cb.treeSet, 1000, 5000)+" ms");
        System.out.println("addToMiddle hashSet " + cb.addToCollection(cb.hashSet, 1000, 5000)+" ms");
        System.out.println();
        System.out.println("addToEnd arrayList " + cb.addToCollection(cb.arrayList, 1000, 999700)+" ms");
        System.out.println("addToEnd linkedList " + cb.addToCollection(cb.linkedList, 1000, 999700)+" ms");
        System.out.println("addToEnd treeSet " + cb.addToCollection(cb.treeSet, 1000, 999700)+" ms");
        System.out.println("addToEnd hashSet " + cb.addToCollection(cb.hashSet, 1000, 9999700)+" ms");
        System.out.println();
        System.out.println("removeFromBegin arrayList " + cb.removeFromCollection(cb.arrayList, 1000, 100)+" ms");
        System.out.println("removeFromBegin linkedList " + cb.removeFromCollection(cb.linkedList, 1000, 100)+" ms");
        System.out.println("removeFromBegin treeSet " + cb.removeFromCollection(cb.treeSet, 1000, 100)+" ms");
        System.out.println("removeFromBegin hashSet " + cb.removeFromCollection(cb.hashSet, 1000, 100)+" ms");
        System.out.println();
        System.out.println("removeFromMiddle arrayList " + cb.removeFromCollection(cb.arrayList, 1000, 5000)+" ms");
        System.out.println("removeFromMiddle linkedList " + cb.removeFromCollection(cb.linkedList, 1000, 5000)+" ms");
        System.out.println("removeFromMiddle treeSet " + cb.removeFromCollection(cb.treeSet, 1000, 5000)+" ms");
        System.out.println("removeFromMiddle hashSet " + cb.removeFromCollection(cb.hashSet, 1000, 5000)+" ms");
        System.out.println();
        System.out.println("removeFromEnd arrayList " + cb.removeFromCollection(cb.arrayList, 1000, 999700)+" ms");
        System.out.println("removeFromEnd linkedList " + cb.removeFromCollection(cb.linkedList, 1000, 999700)+" ms");
        System.out.println("removeFromEnd treeSet " + cb.removeFromCollection(cb.treeSet, 1000, 999700)+" ms");
        System.out.println("removeFromEnd hashSet " + cb.removeFromCollection(cb.hashSet, 1000, 999700)+" ms");
    }


}