package com.company;

public class Arrays {

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
        int a = 0;
        do {
            System.out.println(myArray[a]);
            a++;

        } while (a < myArray.length);

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


        System.out.println("Same value: ");


        System.out.println("Each second element: ");
        for (int i = 0; i < myArray.length; i += 2) {
            System.out.println(myArray[i]);
        }

        System.out.println("Average value of the array: ");
        double total = 0;
        for (int j : myArray)
            total = total + j;
        double average = total / myArray.length;
        System.out.println(average);

        System.out.println("How many elements are smaller than average value: ");
    }
        /*

● Compute how many elements are odd (uneven).
● Verify if there are multiple elements with the same value
● Establish how many elements are smaller than average value.
         */

    public static void main(String[] args) {

        //Assignment1();
        Assignment2();

    }
}
