package com.examples;

import java.util.ArrayList;

public class ArraysAndArrayList {

    public static void main(String[] args){
        String[] friendsArray = new String[5]; // Array is fixed in size
        String[] friendsArray2 = {"John", "Paul", "George", "Ringo", "Brian"};

        ArrayList<String> friendsArrayList = new ArrayList<String>(); // ArrayList grows and shrinks dynamically

        // add values to empty Array
        friendsArray[0] = "John";
        friendsArray[1] = "Paul";
        friendsArray[2] = "George";
        friendsArray[3] = "Ringo";
        friendsArray[4] = "Brian";

        // add values to empty ArrayList
        friendsArrayList.add("Jon");
        friendsArrayList.add("Head");
        friendsArrayList.add("Munky");
        friendsArrayList.add("Ray");
        friendsArrayList.add("Fieldy");

        // get value from Array
        for(int i = 0; i < friendsArray.length; i++){
            System.out.println(friendsArray[i]);
        }

        // get value from ArrayList
        for(int i = 0; i < friendsArrayList.size(); i++){
            System.out.println(friendsArrayList.get(i));
        }
    }
}
