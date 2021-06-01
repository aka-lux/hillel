package com.hillel;

import java.util.*;

public class MyBinaryTree<T extends Comparable<T>> implements MyTree<T> {

    private Node rootNode;

    class Node {
        private T value;
        private Node leftChild;
        private Node rightChild;

        public T getValue() {
            return this.value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getLeftChild() {
            return this.leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return this.rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        @Override
        public String toString() {
            return "{" +
                    "value=" + value +
                    "LeftChild" + leftChild +
                    "RightChild" + rightChild +
                    '}';
        }
    }


    @Override
    public void add(T data) {

        Node newNode = new Node();
        newNode.setValue(data);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node node = rootNode;
            Node parentNode;
            while (true) {
                parentNode = node;
                if (data == node.getValue()) {
                    return;
                } else if (data.compareTo(node.getValue()) < 0) {
                    node = node.getLeftChild();
                    if (node == null) {
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                } else {
                    node = node.getRightChild();
                    if (node == null) {
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public Node find(T value) {
        Node node = rootNode;
        while (value != node.getValue()) {
            if (value.compareTo(node.getValue()) < 0) {
                node = node.leftChild;
            } else if (value.compareTo(node.getValue()) > 0) {
                node = node.rightChild;
            }
            if (node == null) {
                return null;
            }
        }
        return node;
    }

    public Node findParent(T value) {
        Node node = rootNode;
        while (node.getRightChild() != null || node.getLeftChild() != null) {
            if (value.compareTo(node.getValue()) < 0) {
                if (node.leftChild.getValue() == value) {
                    return node;
                }
                node = node.leftChild;
            } else if (value.compareTo(node.getValue()) > 0) {
                if (node.rightChild.getValue() == value) {
                    return node;
                }
                node = node.rightChild;
            }
        }
        return null;
    }


    public void delete(T data) {
        Node node = rootNode;
        Node parentNode = rootNode;
        boolean isLeftChild = true;

        while (node.getValue() != data) {
            parentNode = node;
            if (data.compareTo(node.getValue()) < 0) {
                isLeftChild = true;
                node = node.getLeftChild();
            } else {
                isLeftChild = false;
                node = node.getRightChild();
            }

        }


        if (node.getLeftChild() == null && node.getRightChild() == null) {
            if (node == rootNode)
                rootNode = null;
            else if (isLeftChild)
                parentNode.setLeftChild(null);
            else
                parentNode.setRightChild(null);
        } else if (node.getRightChild() == null) {
            if (node == rootNode)
                rootNode = node.getLeftChild();
            else if (isLeftChild)
                parentNode.setLeftChild(node.getLeftChild());
            else
                parentNode.setRightChild(node.getLeftChild());
        } else if (node.getLeftChild() == null) {
            if (node == rootNode)
                rootNode = node.getRightChild();
            else if (isLeftChild)
                parentNode.setLeftChild(node.getRightChild());
            else
                parentNode.setRightChild(node.getRightChild());
        } else {
            parentNode = node;
            Node res = node;
            node = node.rightChild;
            if (node.leftChild != null) {
                while (node.leftChild != null) {
                    res = node;
                    node = node.leftChild;

                }
                if (node.rightChild != null) {
                    parentNode.value = node.value;
                    while (node.rightChild != null) {
                        res = node;
                        node.value = node.rightChild.value;
                        node = node.rightChild;
                    }

                    res.rightChild = null;
                } else {
                    parentNode.value = node.value;
                    res.leftChild = null;
                }
            } else if (node.leftChild == null) {
                parentNode.value = node.value;
                node.leftChild = null;

                parentNode.value = node.value;
                parentNode.rightChild.value = null;

            }
        }

    }


    @Override
    public String toString() {
        return "MyTree{" +
                "rootNode=" + rootNode +
                '}';
    }

    @Override
    public T get(T data) {
        Node currentNode = rootNode;
        while (currentNode.getValue() != data) {
            if (data.compareTo(currentNode.getValue()) < 0) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return data;
    }



}
