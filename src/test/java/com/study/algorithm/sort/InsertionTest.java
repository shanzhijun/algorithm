package com.study.algorithm.sort;

import com.study.algorithm.sort.Insertion;
import org.junit.Test;

import java.util.Arrays;

public class InsertionTest {
    @Test
    public void testSort(){
        Integer[] arr = {1,20,3,6,2,7,3,4};

        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
