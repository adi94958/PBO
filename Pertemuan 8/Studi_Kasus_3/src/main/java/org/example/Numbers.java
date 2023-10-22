package org.example;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow mant integers do you want to sort?");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.print("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt(); // Autoboxing secara otomatis mengonversi int menjadi Integer
        }
        Sorting.selectionSort(intList);
        System.out.println("Your number in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
}
