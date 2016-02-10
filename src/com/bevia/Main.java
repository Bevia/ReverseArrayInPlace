package com.bevia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Vincent", "Tom", "Williams", "Peter"};
        System.out.println("original array: " + Arrays.toString(names));

        // reversing array with three elements
        reverse(names);
        System.out.println("reversed array: " + Arrays.toString(names));
    }

    /**
     * Java Method to reverse String array in place
     *
     * @param array This is a simple algorithm with time complexity is O(n/2) or O(n).
     *              It iterates over half the elements and perform n/2 swapping as well.
     */
    public static void reverse(String[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
