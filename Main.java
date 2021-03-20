package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /////////////////////////////////////////////////////////

        // Сортування масиву:
        System.out.println("1. Sort the array:");
        int ArrForSort[]={2,3,1,7,11};
        int temp;
        System.out.printf("\tInitial array: ");
        for (int i = 0; i < ArrForSort.length; i++)
            System.out.printf(ArrForSort[i]+" ");
        System.out.println();
        for (int i = 0; i < ArrForSort.length; i++) {
            for (int j = 0; j < ArrForSort.length; j++) {
                if(ArrForSort[i]>ArrForSort[j] && i!=j) {
                    temp = ArrForSort[j];
                    ArrForSort[j] = ArrForSort[i];
                    ArrForSort[i] = temp;
                }
            }
        }
        System.out.printf("\tSorted array: ");
        for (int i = 0; i < ArrForSort.length; i++)
            System.out.printf(ArrForSort[i]+" ");
        System.out.println("\n");

    /////////////////////////////////////////////////////////

        // Сума додатніх елементів масиву:
        System.out.println("2. The sum of positive elements of the array:");
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the dimension of the array: ");
        int size = in.nextInt();
        int ArrForSum[]=new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Array["+i+"] = ");
            ArrForSum[i]=in.nextInt();
        }
        int sum=0;
        for (int i = 0; i < ArrForSum.length; i++) {
            if(ArrForSum[i]>0)
                sum+=ArrForSum[i];
        }
        System.out.println("Sum: "+sum);
        System.out.println();

    /////////////////////////////////////////////////////////

        // Середнє значення елементів:
        System.out.println("3. The middle element:");
       int ArrForAverage[]={2,5,3,-2,66,0,-23,5,43};
       int sumOfElements=0;
       float average;
        for (int i = 0; i < ArrForAverage.length; i++) {
            sumOfElements+=ArrForAverage[i];
        }
        average=sumOfElements/ ArrForAverage.length;
        for (int i = 0; i < ArrForAverage.length; i++)
            System.out.printf(ArrForAverage[i]+" ");
        System.out.println();
        System.out.println("Average value of elements: "+ average);
        System.out.println();

    /////////////////////////////////////////////////////////

        // Заміна дубльованого елемента на нуль:
        System.out.println("4. Replacing a duplicate item with zero:");
        int ArrWithoutDuplElements[]={2,-1,45,2,12,12,11,-1};
        for (int i = 0; i < ArrWithoutDuplElements.length; i++)
            System.out.printf(ArrWithoutDuplElements[i]+" ");

        for (int i = 0; i < ArrWithoutDuplElements.length; i++) {
            for (int j = 0; j < ArrWithoutDuplElements.length; j++) {
                if(ArrWithoutDuplElements[i]==ArrWithoutDuplElements[j] && i!=j)
                    ArrWithoutDuplElements[j]=0;
            }
        }
        System.out.println();
        for (int i = 0; i < ArrWithoutDuplElements.length; i++)
            System.out.printf(ArrWithoutDuplElements[i]+" ");
        System.out.println("\n");
    }
}
