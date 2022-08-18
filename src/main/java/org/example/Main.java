package org.example;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println(Arrays.toString(twoNumberSumNested(array, targetSum)));
        System.out.println(Arrays.toString(twoNumberSumHashTable(array, targetSum)));
        System.out.println(Arrays.toString(twoNumberSumSorted(array, targetSum)));
    }

    // O(n^2) time | O(1) space
    public static int[] twoNumberSumNested(int[] array, int targetSum) {
        for(int i = 0; i < array.length - 1; i++) {     // O(n) time
            for(int j = i + 1; j < array.length; j++) {     // O(n) time NESTED!
                if(array[i] + array[j] == targetSum) {
                    return new int[] {array[i], array[j]};
                }
            }
        }
        return new int[] {};
    }

    // O(n) time | O(n) space
    public static int[] twoNumberSumHashTable(int[] array, int targetSum) {
        HashMap<Integer, Boolean> seen = new HashMap<>();       // O(n) space
        for(int element : array) {      // O(n) time
            int potentialMatch = targetSum - element;
            if(seen.containsKey(potentialMatch)) {
                return new int[] {potentialMatch, element};
            }
            seen.put(element, true);
        }
        return new int[] {};
    }

    // O(nLog(n)) time | O(1) space
    public static int[] twoNumberSumSorted(int[] array, int targetSum) {
        Arrays.sort(array);     // O(nLog(n)) time
        int left = 0;
        int right = array.length - 1;
        while(left < right) {       // O(n) time
            int currentSum = array[left] + array[right];
            if(currentSum < targetSum) {
                left++;
            } else if(currentSum > targetSum) {
                right--;
            } else {
                return new int[] {array[left], array[right]};
            }
        }
        return new int[] {};
    }
}