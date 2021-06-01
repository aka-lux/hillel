package com.hillel;

public interface MyTree<T> {
        void add(T data);
        void delete(T data);
        T get(T data); // если элемента нет то вернуть NULL
}
