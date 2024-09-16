package sorting;

import java.util.Arrays;

public class MergeSortIterative2 {
    public static void main(String[] args) {
        int array[] = {10, 9, 12, 20, 8, 5, 4};
        MergeSortIterative2 demo = new MergeSortIterative2();
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
        for (int level = 1; level < inputArray.length; level = level * 2) {
            for (int leftIndex = 0; leftIndex < inputArray.length; leftIndex = leftIndex + (2 * level)) {
                int rightIndex = leftIndex + (2 * level);
                if (rightIndex >= inputArray.length) {
                    rightIndex = inputArray.length - 1;
                }
                int midIndex = leftIndex + level;
                if (midIndex >= inputArray.length) {
                    midIndex = inputArray.length - 1;
                }
                merge(inputArray, leftIndex, rightIndex, midIndex);

            }
        }

    }

    /**
     * Conquer / Merging two subsets
     *
     * @param inputArray
     */
    void merge(final int inputArray[], final int leftStartIndex, final int rightEndIndex, final int midIndex) {
        int temp[] = new int[(rightEndIndex - leftStartIndex) + 1];
        int leftIndexCounter = leftStartIndex;
        int rightIndexCounter = midIndex;
        int i = 0;
        for (; leftIndexCounter+i< midIndex && rightIndexCounter <= rightEndIndex; i++) {
            if (inputArray[leftIndexCounter] < inputArray[rightIndexCounter]) {
                temp[i] = inputArray[leftIndexCounter];
                leftIndexCounter++;
                continue;
            }
            temp[i] = inputArray[rightIndexCounter];
            rightIndexCounter++;
        }
        while (leftIndexCounter < midIndex) {
            temp[i] = inputArray[leftIndexCounter];
            i++;
            leftIndexCounter++;
        }
        while (rightIndexCounter <= rightEndIndex) {
            temp[i] = inputArray[rightIndexCounter];
            i++;
            rightIndexCounter++;
        }


        System.arraycopy(temp, 0, inputArray, leftStartIndex, temp.length);

    }

}


