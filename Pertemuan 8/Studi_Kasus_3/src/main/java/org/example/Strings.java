package org.example;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow mant integers do you want to sort?");
        size = scan.nextInt();
        stringList = new String[size];

        System.out.print("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();
        }
        Sorting.insertionSort(stringList); // Menggunakan insertionSort untuk string
        System.out.println("Your number in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + " ");
        }
        System.out.println();
    }
}
