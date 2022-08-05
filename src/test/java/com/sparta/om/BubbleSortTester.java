package com.sparta.om;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTester {
    @Test
    @DisplayName("Given unsorted array, return sorted array")
    void givenUnsortedArrayReturnSortedArray() {
        int[] testArray = {5,6,21,6,1,1,3,5,7,32,5,33};
        int[] expected = {1,1,3,5,5,5,6,6,7,21,32,33};
        BubbleSort sortTest = new BubbleSort();
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(sortTest.bubbleSort(testArray)));
    }
}
