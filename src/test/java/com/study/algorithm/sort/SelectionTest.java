package com.study.algorithm.sort;

import com.study.algorithm.sort.Selection;
import org.junit.Test;

import java.util.Arrays;

public class SelectionTest {
    @Test
    public void testSort(){
            Integer[] arr = {1,20,3,6,2,7,3,4};

            Selection.sort(arr);
            System.out.println(Arrays.toString(arr));
    }
}
