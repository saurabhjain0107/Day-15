package com.bridgelabz;

public class MyNode<K, V> {
    K key;
    V value;

    MyNode<K,V> next;

    public MyNode() {
    }

    public MyNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("MyMapNode: " + " Key= ").append(key)
                .append(" Value= ").append(value);
        if (next != null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }

}
