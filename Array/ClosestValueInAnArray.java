package com.Array;

public class ClosestValueInAnArray {
	
	public static void main(String[] args) {
        System.out.println("Closest Element to the target "+5+" is ::" + findClosestValueToTheTargetValue(new int[]{2, 5, 6, 7, 8, 8, 9}, 5));
        System.out.println("Closest Element to the target "+4+" is ::" + findClosestValueToTheTargetValue(new int[]{2, 5, 6, 7, 8, 8, 9}, 4));
    }

    public static int findClosestValueToTheTargetValue(int[] arr, int target) {
        int closestDifference = Integer.MAX_VALUE;
        int closestElement = 0;

        for (int i : arr) {
            if (Math.abs(target - i) < closestDifference) {
                closestDifference = Math.abs(target - i);
                closestElement = i;
            }
        }
        return closestElement;
    }

}
