/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.mergesort;

/**
 *
 * @author Jmach
 */
public class MergeSort {

    public static void sort(int[] inputArray) {
        sort(inputArray, 0, inputArray.length - 1);
    }

    private static void sort(int[] inputArray, int start, int end) {
        if (end <= start) {
            return; //we are done traversing the array
        }

        int mid = (start + end) / 2;
        sort(inputArray, start, mid);//sort left half
        sort(inputArray, mid + 1, end);//sort right half
        merge(inputArray, start, mid, end);//merge sorted result into the inputArray
    }

    private static void merge(int[] inputArray, int start, int mid, int end) {
        int[] tempArray = new int[end - start + 1];

        int leftSlot = start;//index counter for left side of array
        int rightSlot = mid + 1;//index counter for right side of array
        int k = 0;

        while (leftSlot <= mid && rightSlot <= end) {
            if (inputArray[leftSlot] < inputArray[rightSlot]) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
            } else {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
            }
            k++;
        }

        if (leftSlot <= mid) {//consider the right side done being sorted. left must be sorted already
            while (leftSlot <= mid) {
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end) {
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        //copy over the temp array into the appropriate slots of the inputArray
        for (int i = 0; i < tempArray.length; i++) {
            inputArray[start+i] = tempArray[i];
        }
    }
}
