package com.hillel;

public class MyLinkedList<T> implements MyList<T> {

    private Node first;
    private Node last;
    private int size;

    public void MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append( data );

            if (next != null) {
                s.append(", " + next);
            }

            return s.toString();
        }

    }

    public void add(T item) {
        if (item == null) { throw new NullPointerException("The argument is null."); }
        if (!isEmpty()) {
            Node prev = last;
            last = new Node(item, null);
            prev.next = last;
        }
        else {
            last = new Node(item, null);
            first = last;
        }
        size++;
    }

    @Override
    public T get(int index){
        Node curr = first;

        if (index >= size) { throw new IndexOutOfBoundsException("No such element in array"); }

        for (int i = 0; i < size; i++) {
           if (i == index) {
             return curr.data;
           }
           curr = curr.next;
        }

        return null;
    }


    @Override
    public void remove(int index) {
        Node prev = first;
        Node curr = first;

        if (index >= size) {
            System.out.println("Exseption");
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {

                if (size == 1) {
                    first = null;
                    last = null;
                }

                else if (curr.equals(first)) {
                    first = first.next;
                }

                else if (curr.equals(last)) {
                    last = prev;
                    last.next = null;
                }

                else {
                    prev.next = curr.next;
                }
                size--;
                break;
            }
            prev = curr;
            curr = prev.next;

        }
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "{" + first + "}";
    }

}
