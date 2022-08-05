package com.sparta.om;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {2,4,56,6,6,3,6,3,56,3,5,32,3};
        System.out.println(Arrays.toString(sorter.bubbleSort(arr)));
    }
}
