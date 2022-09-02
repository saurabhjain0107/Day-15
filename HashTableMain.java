package com.bridgelabz;

public class HashTableMain {
    public static void main(String[] args) {

        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] paraArray = para.split(" ");
        HashTable<String, Integer> hashTable = new HashTable<>();
        for (String word : paraArray) {
            int index = hashTable.getIndex(word);
            System.out.println("Word =>" + word + " ,index => " + index);
            Integer value = hashTable.get(word);
            if (value == null)
                value = 1;
            else
                value += 1;
            hashTable.add(word, value);
        }

        System.out.println(hashTable);

    }
}

