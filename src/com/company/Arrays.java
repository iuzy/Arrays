package com.company;

import java.util.Scanner;

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

    public static void Assignment3() {

    }

    /*
Write a program to do multiple actions with a grade array:
● Create a byte array with length 10. The grades will be stored in the array.
● Use the Scanner class that allows the user to fill the array with user input data from the
console.
a. Do verification of the type of each input value. Input values should be as numbers.
The function hasNextShort() can be used from the Scanner class.
b. Do verification of the number range of each input value. Input values need to be in
range 0 to +10.
● Do calculations how many students failed (the grade is smaller than 4).
● Do calculations how many students got an “A”(the grade is 10).
● Create a histogram of number frequencies in the grade array. For example, if the grade
array will be: 2, 5, 10, 3, 10, 7, 8, 5, 10, 6, the histogram will look as shown here:
0 students with the grade 0
0 students with the grade 1
1 students with the grade 2
1 students with the grade 3
0 students with the grade 4
2 students with the grade 5
1 students with the grade 6
1 students with the grade 7
1 students with the grade 8
0 students with the grade 9
3 students with the grade 10
     */
    public static void main(String[] args) {

        //Assignment1();
        //Assignment2();
        Assignment3();

    }

}
