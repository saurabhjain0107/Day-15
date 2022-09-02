package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K,V> {
    int bucketSize;
    List<MyLinkedList<K, V>> bucketArray;

    public HashTable() {
        bucketSize = 6;
        bucketArray = new ArrayList<>(bucketSize);
        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(null);
        }
    }

    int getIndex(K key) {
        int index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }

    V get(K key) {
        int index = getIndex(key);
        MyLinkedList<K, V> list = bucketArray.get(index);
        if (list == null)
            return null;
        MyNode<K, V> searchNode = list.search(key);
        return searchNode == null ? null : searchNode.value;
    }

    public void add(K key, V value) {
        int index = getIndex(key);
        MyLinkedList<K, V> list = bucketArray.get(index);
        if (list == null) {
            list = new MyLinkedList<>();
            bucketArray.set(index,list);
        }
        MyNode<K, V> searchNode = list.search(key);
        if (searchNode == null) {
            list.add(key, value);
        } else {
            searchNode.value = value;
        }

    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketSize=" + bucketSize +
                ", bucketArray=" + bucketArray +
                '}';
    }
}
