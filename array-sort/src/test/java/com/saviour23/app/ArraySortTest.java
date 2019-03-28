package com.saviour23.app;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple ArraySort.
 */

public class ArraySortTest {


    @Test
    public void sortArrayTest() {
        ArraySort sortingObject = new ArraySort();

        int[] arr = {2, 3, 1};
        int[] arr1={1,2,3,4,5,6,7};
        int minSort = sortingObject.sortArray(arr);
        assertEquals(2, minSort);
        assertEquals(0,sortingObject.sortArray(arr1));
    }



}
