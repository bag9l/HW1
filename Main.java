package com.company;

import java.util.Scanner;

public class Main {

    public static void getSortArray(int[] arrForSort) {
        System.out.println("1. Sort the array:");
        int temp;
        System.out.print("\tInitial array: ");
        for (int k : arrForSort) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int i = 0; i < arrForSort.length; i++) {
            for (int j = 0; j < arrForSort.length; j++) {
                if (arrForSort[i] > arrForSort[j] && i != j) {
                    temp = arrForSort[j];
                    arrForSort[j] = arrForSort[i];
                    arrForSort[i] = temp;
                }
            }
        }
        System.out.print("\tSorted array: ");
        for (int j : arrForSort) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static void getSumPositivesNumbers() {
        System.out.println("2. The sum of positive elements of the array:");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dimension of the array: ");
        int size = in.nextInt();
        int[] arrForSum = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Array[" + i + "] = ");
            arrForSum[i] = in.nextInt();
        }
        int sum = 0;
        for (int j : arrForSum) {
            if (j > 0)
                sum += j;
        }
        System.out.println("Sum: " + sum);
        System.out.println();
        in.close();
    }

    public static void getAverageNumber(int[] arrForAverage) {
        System.out.println("3. The middle element:");

        int sumOfElements = 0;
        for (int j : arrForAverage) {
            sumOfElements += j;
        }
        float average = sumOfElements / arrForAverage.length;
        for (int j : arrForAverage) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Average value of elements: " + average);
        System.out.println();
    }

    public static void getArrWithoutDuplElements(int[] arrWithDuplElements) {
        System.out.println("4. Replacing a duplicate item with zero:");
        for (int arrWithDuplElement : arrWithDuplElements) {
            System.out.print(arrWithDuplElement + " ");
        }
        for (int i = 0; i < arrWithDuplElements.length; i++) {
            for (int j = 0; j < arrWithDuplElements.length; j++) {
                if (arrWithDuplElements[i] == arrWithDuplElements[j] && i != j)
                    arrWithDuplElements[j] = 0;
            }
        }
        System.out.println();
        for (int arrWithDuplElement : arrWithDuplElements) {
            System.out.print(arrWithDuplElement + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arrForSort = {2, 3, 1, 7, 11};
        int[] arrForAverage = {2, 5, 3, -2, 66, 0, -23, 5, 43};
        int[] arrWithDuplElements = {2, -1, 45, 2, 12, 12, 11, -1};

        getSortArray(arrForSort);
        getSumPositivesNumbers();
        getAverageNumber(arrForAverage);
        getArrWithoutDuplElements(arrWithDuplElements);
    }
}
