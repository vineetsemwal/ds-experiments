package sorting;

import java.util.*;


public class MergeSortIterative1 {
    public static void main(String[] args) {
        int array[] = {10, 9, 12, 20, 8, 5, 4};
        MergeSortIterative1 demo = new MergeSortIterative1();
        demo.mergeSort(array);
        Arrays.stream(array).forEach((element) -> System.out.print(element + "     "));

    }


    /**
     * iterative merge sort bottom up approach,
     * At every Level in worst case scenario n comparisons are done and there are Log(n,2) levels
     *  Worst Case scenario Time Complexity: O(n Log(n,2))
     *  Auxiliary Space (without including input size) : O(n)
     *
     * @param inputArray
     */
    void mergeSort(final int inputArray[]) {
        for (int level = 1; level <inputArray.length; level = level * 2) {
            for (int leftIndex = 0; leftIndex < inputArray.length; leftIndex = leftIndex + (2 * level)) {
                int rightIndex = leftIndex + (2 * level);
                if (rightIndex >= inputArray.length) {
                    rightIndex = inputArray.length - 1;
                }
                int midIndex = leftIndex + level;
                if (midIndex >= inputArray.length) {
                    midIndex = inputArray.length - 1;
                }
                merge(inputArray,  leftIndex, rightIndex, midIndex);
            }
        }

    }

    /**
     * Conquer / Merging two subsets
     *
     * @param array
     */
    void merge(final int array[],   final int leftStartIndex, final int rightEndIndex,final int midIndex) {
        int temp[]=new int [array.length];
        int leftIndexCounter = leftStartIndex;
        int rightIndexCounter = midIndex;
        int i = leftIndexCounter;
        for (; i < midIndex && rightIndexCounter <= rightEndIndex; i++) {
            if (array[leftIndexCounter] < array[rightIndexCounter]) {
                temp[i] = array[leftIndexCounter];
                leftIndexCounter++;
            } else {
                temp[i] = array[rightIndexCounter];
                rightIndexCounter++;
            }
        }

        while (leftIndexCounter < midIndex) {
            temp[i] = array[leftIndexCounter];
            leftIndexCounter++;
            i++;
        }

        while (rightIndexCounter <= rightEndIndex) {
            temp[i] = array[rightIndexCounter];
            rightIndexCounter++;
            i++;
        }

        System.arraycopy(temp, leftStartIndex, array, leftStartIndex, (rightEndIndex-leftStartIndex)+1);

    }

}


