package com.hillel;

public interface MyList<T> {
        void add(T data);

        void remove(int index);

        T get(int index); // вернуть NULL есль значение не найдено

        int size(); // Если size типа int то сколько элементов может вместить Список?

        // Сколько памяти он займет?
        String toString();

}
