package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 40));
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int bole = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = bole;

                }
            }

        }
        System.out.println(Arrays.toString(array));
    }
}







