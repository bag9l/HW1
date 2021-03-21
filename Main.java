package com.company;

import java.util.Scanner;

public class Main {

    public static void arraySort(int[] A) {
        System.out.println("1. Sort the array:");
        int temp;
        System.out.print("\tInitial array: ");
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] > A[j] && i != j) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        System.out.print("\tSorted array: ");
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
        System.out.println("\n");
    }

    public static void arraySum() {
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

    public static void arrAverageElement(int[] A) {
        System.out.println("3. The middle element:");

        int sumOfElements = 0;
        float average;
        for (int i = 0; i < A.length; i++) {
            sumOfElements += A[i];
        }
        average = sumOfElements / A.length;
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
        System.out.println();
        System.out.println("Average value of elements: " + average);
        System.out.println();
    }

    public static void arrDuplicate(int[] A) {
        System.out.println("4. Replacing a duplicate item with zero:");
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j] && i != j)
                    A[j] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] arrForSort = {2, 3, 1, 7, 11};
        int[] arrForAverage = {2, 5, 3, -2, 66, 0, -23, 5, 43};
        int[] arrWithoutDuplElements = {2, -1, 45, 2, 12, 12, 11, -1};

        arraySort(arrForSort);
        arraySum();
        arrAverageElement(arrForAverage);
        arrDuplicate(arrWithoutDuplElements);

    }
}

