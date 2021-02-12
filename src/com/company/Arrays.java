package com.company;

import java.util.Scanner;

public class Arrays {

    static Scanner input = new Scanner(System.in);

    static void Assignment1() {

        int[] myArray = {5, 3, 7, 6, 2, 8};

        System.out.println("For loop:");
        for (int j : myArray) {
            System.out.println(j);
        }

        System.out.println("For each loop:");
        for (int num : myArray) {
            System.out.println(num);
        }

        System.out.println("While loop:");
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }

        System.out.println("Do while loop:");
        i = 0;
        do {
            System.out.println(myArray[i]);
            i++;

        } while (i < myArray.length);

        System.out.println(" For each is the best to print out each! :) ");
    }

    static void Assignment2() {

        int[] myArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        System.out.println("Negative values: ");
        for (int j : myArray) {
            if (j < 0) {
                System.out.println(j);
            }
        }

        System.out.println("Odd values: ");
        for (int j : myArray) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        System.out.println("How many elements are odd: ");
        int odd = 0;
        for (int j : myArray) {
            if (j % 2 != 0) {
                odd++;
            }
        }
        System.out.println(odd);

        System.out.println("These elements have the same value: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == (myArray[j])) {
                    System.out.println(myArray[i]);
                }
            }
        }

        System.out.println("Each second element: ");
        for (int i = 1; i < myArray.length; i += 2) {
            System.out.println(myArray[i]);
        }

        System.out.println("Average value of the array: ");
        double total = 0;
        for (int k : myArray)
            total += k;
        double average = total / myArray.length;
        System.out.println(average);

        System.out.println("How many elements are smaller than average value: ");

        int smaller = 0;
        for (int l : myArray) {
            if (l < average) {
                smaller++;
            }
        }
        System.out.println(smaller);
    }

    static void Assignment3() {

        byte[] array = new byte[10];

        System.out.println("Please enter ten numbers (0 - 10): ");

        for (int i = 0; i < array.length; i++) {

            while (!input.hasNextByte()) {
                System.out.println("This is not a number!");
                input.next();
            }

            byte grade = input.nextByte();
            if (grade < 0 || grade > 10) {
                i--;
                System.out.println("Invalid value!");
            } else {
                array[i] = grade;
            }
        }

        //how many students failed
        int fail = 0;
        for (int i : array) {
            if (i < 4) {
                fail++;
            }
        }
        System.out.println("Number of students that failed: " + fail);

        //how many got an A
        int a = 0;
        for (int i : array) {
            if (i == 10) {
                a++;
            }
        }
        System.out.println("This is how many students excelled: " + a);

        //histogram
        System.out.println("Histogram: ");
        byte[] count = new byte[11];
        int i;
        for (i = 0; i < array.length; i++) {
            int temp = array[i];
            count[temp]++;
        }
        for (i = 0; i < count.length; i++) {
            System.out.println(count[i] + " students with grade " + i);
        }
    }

    public static void main(String[] args) {

        //Assignment1();
        //Assignment2();
        Assignment3();

    }

}
