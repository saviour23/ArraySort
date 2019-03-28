package com.saviour23.app;

/**
 * ArraySort class for finding minimum swap required for sorting an unordered array consisting of consecutive integers.
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        ArraySort obj = new ArraySort();
        int sortCount = obj.sortArray(arr);
        System.out.println(sortCount);
    }

    /**
     * Method is to create graph, based on actual index where element belongs.
     * Multiple graphs for each iteration will be added to find the minimum swaps required.
     *
     * @param arr integer array.
     * @return minimum no of swaps required.
     */
    public int sortArray(int[] arr) {
        boolean visited[] = new boolean[arr.length];
        int swapCount = 0;

        for (int index = 0; index < arr.length; index++) {
            int visitedIndex = index;
            int count = 0;

            while (!visited[visitedIndex]) {
                visited[visitedIndex] = true;
                visitedIndex = arr[visitedIndex] - 1;
                count++;
            }

            if (count != 0)
                swapCount = swapCount + (count - 1);
        }
        return swapCount;

    }
}
