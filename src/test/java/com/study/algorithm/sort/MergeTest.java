package com.study.algorithm.sort;

import com.study.algorithm.sort.Merge;
import org.junit.Test;

import java.util.Arrays;

public class MergeTest {

    @Test
    public void test1(){
        Integer[] arr = {1,20,3,6,21,7,3,4};

        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
