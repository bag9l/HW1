package com.company;

import java.util.Scanner;

public class Main {

    public static void getSortArray(int[] arrForSort) {
        System.out.println("1. Sort the array:");
        int temp;
        System.out.print("\tInitial array: ");
        for (int i = 0; i < arrForSort.length; i++) {
            System.out.print(arrForSort[i] + " ");
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
        for (int i = 0; i < arrForSort.length; i++) {
            System.out.print(arrForSort[i] + " ");
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
        for (int i = 0; i < arrForSum.length; i++) {
            if (arrForSum[i] > 0)
                sum += arrForSum[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println();
        in.close();
    }

    public static void getAverageNumber(int[] arrForAverage) {
        System.out.println("3. The middle element:");

        int sumOfElements = 0;
        float average;
        for (int i = 0; i < arrForAverage.length; i++) {
            sumOfElements += arrForAverage[i];
        }
        average = sumOfElements / arrForAverage.length;
        for (int i = 0; i < arrForAverage.length; i++) {
            System.out.print(arrForAverage[i] + " ");
        }
        System.out.println();
        System.out.println("Average value of elements: " + average);
        System.out.println();
    }

    public static void getArrWithoutDuplElements(int[] arrWithDuplElements) {
        System.out.println("4. Replacing a duplicate item with zero:");
        for (int i = 0; i < arrWithDuplElements.length; i++) {
            System.out.print(arrWithDuplElements[i] + " ");
        }
        for (int i = 0; i < arrWithDuplElements.length; i++) {
            for (int j = 0; j < arrWithDuplElements.length; j++) {
                if (arrWithDuplElements[i] == arrWithDuplElements[j] && i != j)
                    arrWithDuplElements[j] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < arrWithDuplElements.length; i++) {
            System.out.print(arrWithDuplElements[i] + " ");
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
