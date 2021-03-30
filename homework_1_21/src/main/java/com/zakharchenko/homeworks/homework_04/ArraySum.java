package com.zakharchenko.homeworks.homework_04;

public class ArraySum {
    public static void main(String[] args) {
        printArraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        printArraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{4, 4, 4, 4, 5, 5, 5, 5, 1, 1});
        printArraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{4, 4, 4, 4});
        printArraySum(null, null);
        printArraySum(new int[0], new int[0]);
    }

    /**
     * This function calculates the sum of two columns.
     * Print table with results if columns have the same size (col_1
     * | col_2 | sum). Otherwise print which column has bigger size
     *
     * @param arr1 first int array
     * @param arr2 second int array
     */

    private static void printArraySum(int[] arr1, int[] arr2) {
        int length = arr1.length == arr2.length ? arr1.length :
                arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] col_1 = new int[length];
        int[] col_2 = new int[length];
        int[] sum = new int[length];

        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {

        }

        for (int i = 0; i < length; i++) {
            col_1[i] = arr1.length > i ? arr1[i] : 0;
            col_2[i] = arr2.length > i ? arr2[i] : 0;
            sum[i] = col_1[i] + col_2[i];
            System.out.println(col_1[i] + " | " + col_2[i] + " | " + sum[i]);
        }
        System.out.println(" ");

    }
}
