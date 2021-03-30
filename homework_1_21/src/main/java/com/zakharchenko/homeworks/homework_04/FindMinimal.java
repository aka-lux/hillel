package com.zakharchenko.homeworks.homework_04;

public class FindMinimal {
    public static void main(String[] args) {
        System.out.println(getMinimal(new int[]{200, 12, 345, 34, 22, 0, -1, 23}));
        System.out.println(getMinimal(new int[]{100,2,3,4,5,6}));
        System.out.println(getMinimal(new int[]{-2,0,-18,2344,44}));
    }

    /**
     * thus function finds minimal number in int array
     * @param arr input int array
     * @return  minimal element
     */
    private static int getMinimal(int[] arr){
        int minimal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            minimal = arr[i] < minimal ? arr[i] : minimal;
        }
        return minimal;
    }
}
