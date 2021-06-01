package com.hillel;

import java.util.*;
import static java.lang.System.currentTimeMillis;

public class CollectionsBenchmark {

    ArrayList<Integer> arrayList = new ArrayList();
    LinkedList<Integer> linkedList = new LinkedList();
    TreeSet<Integer> treeSet = new TreeSet<>();
    HashSet<Integer> hashSet = new HashSet<>();

    long beginTime = 0;
    long endTime = 0;
    long result =0;

    public long fillCollection(List<Integer> list, int num){
        beginTime = currentTimeMillis();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }
    public long fillCollection(Set<Integer> set, int num){
        beginTime = currentTimeMillis();
        for (int i = 0; i < num; i++) {
            set.add(i);
        }
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }

    public long getFromCollection(List<Integer> list, int num){
        beginTime = currentTimeMillis();
        list.get(num);
       // System.out.println(list.get(num));
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }
    public long getFromCollection(Set<Integer> set, int num){
        beginTime = currentTimeMillis();
        set.contains(num);
       // System.out.println(set.contains(num));
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }

    public long addToCollection(List<Integer> list, int num, int begin){
        beginTime = currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            list.add(i,i);
        }
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }
    public long addToCollection(Set<Integer> set, int num, int begin){
        beginTime = currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            set.add(i);
        }
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }

    public long removeFromCollection(List<Integer> list, int num, int begin){
        beginTime = currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            list.remove(i);
        }
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }
    public long removeFromCollection(Set<Integer> set, int num, int begin){
        beginTime = currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            set.remove(i);
        }
        endTime = currentTimeMillis();
        result = endTime - beginTime;
        return result;
    }
}
