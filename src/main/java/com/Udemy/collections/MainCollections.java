package com.Udemy.collections;

import java.util.*;

public class MainCollections {

    public static void main(String[] args) {
//        List<Card> deck = Card.getStandardDeck();
//        Card.printDeck(deck);

        // Array: fixed size, can't change size
        int[] intArray = new int[10];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i * 10;
//            System.out.println("intArray[" + i + "] = " + intArray[i]);
//        }

        // ArrayList: can change size
//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            intArrayList.add(i * 10);
//            System.out.println("intArrayList[" + i + "] = " + intArrayList.get(i));
//        }

//       List: interface, can't instantiate. ArrayList implements List.
        List <Integer> intArrayList = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            intArrayList.add(i * 10);
//            System.out.println("intArrayList[" + i + "] = " + intArrayList.get(i));
//        }

        // HashSet: no duplicates, no order. Faster than TreeSet.
        HashSet<Integer> intHashSet = new HashSet<Integer>();
        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(3);
//        System.out.println("intHashSet " + intHashSet);

        // TreeSet: no duplicates, sorted order. Slower than HashSet.
        TreeSet<Integer> intTreeSet = new TreeSet<Integer>();
        intTreeSet.add(3);
        intTreeSet.add(2);
        intTreeSet.add(1);
//        System.out.println("intTreeSet: " + intTreeSet);


        // LinkedHashSet: no duplicates, insertion order.
        LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<Integer>();
        intLinkedHashSet.add(3);
        intLinkedHashSet.add(2);
        intLinkedHashSet.add(1);
//        System.out.println("intLinkedHashSet: " + intLinkedHashSet);

        // HashMap: key-value pairs, no order.
        HashMap<String, Integer> intHashMap = new HashMap<String, Integer>();
        intHashMap.put("one", 1);
        intHashMap.put("two", 2);
        intHashMap.put("three", 3);
//        System.out.println("intHashMap: " + intHashMap);


    }
}
