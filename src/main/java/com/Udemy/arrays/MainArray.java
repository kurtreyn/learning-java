package com.Udemy.arrays;

import java.util.Arrays;
import java.util.Random;

public class MainArray {

    public static void main(String[] args) {
        // an array is not resizable
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
//        System.out.println(myDoubleArray[2]);

        // array initializer
        int[] firstFivePositives = new int[] {1,2,3,4,5};

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
//        System.out.println("length of array = " + arrayLength);
        int lastElement = firstTen[arrayLength - 1];
//        System.out.println("last element = " + lastElement);

        int[] newArray;
        newArray = new int[5];
        for (int i=0; i<newArray.length; i++) {
//            newArray[i] = newArray.length - i;
        }
        for (int i=0; i<newArray.length; i++) {
//            System.out.println(newArray[i] + " ");
        }

        // enhanced for loop (for each loop)
        for (int number : newArray) {
//            System.out.println("number = " + number);
        }

        // convert array to string
        String arrayToString = Arrays.toString(newArray);
//        System.out.println(arrayToString);


        int[] firstArray = getRandomArray(10);
//        System.out.println("firstArray = " + Arrays.toString(firstArray));

        Arrays.sort(firstArray);
//        System.out.println("firstArray sorted = " + Arrays.toString(firstArray));

        int[] secondArray = new int[10];
//        System.out.println("secondArray = " + Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
//        System.out.println("secondArray filled = " + Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
//        System.out.println("thirdArray = " + Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
//        System.out.println("fourthArray = " + Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
//        System.out.println("smallArray = " + Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
//        System.out.println("largeArray = " + Arrays.toString(largeArray));

        // SEARCHING IN ARRAYS

            // binary search (only works on sorted arrays)
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println("sArray = " + Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Mark is in the array");
        } else {
            System.out.println("Mark is not in the array");
        }


        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int [] newInt = new int[len];
        for (int i=0; i<len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
