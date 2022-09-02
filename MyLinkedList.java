package com.bridgelabz;

public class MyLinkedList<K, V> {
    MyNode<K,V> head;
    MyNode<K,V> tail;

    public void push(K key,V value) {
        MyNode<K,V> newNode = new MyNode<>(key,value); // next-> null
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    void print() {
        MyNode<K,V> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " -- " +temp.value );
            temp = temp.next;
        }
        System.out.println();
    }


    public void add(K key,V value) {
        MyNode<K,V> newNode = new MyNode<>(key,value); // next-> null
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public K pop() {
        K popData = head.key;
        head = head.next;
        return popData;
    }


    public K popLast() {
        K popData = tail.key;
        MyNode<K,V> temp = head;
        if (head == tail) {
            head = null;
        } else {
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        return popData;
    }

    public MyNode<K,V> search(K searchData) {
        MyNode<K,V> temp = head;
        while (temp != null) {
            if (temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }


    @Override
    public String toString() {
        return " \n{" + head + "}";
    }
}
