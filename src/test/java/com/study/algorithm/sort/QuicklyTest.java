package com.study.algorithm.sort;

import com.study.algorithm.sort.Quickly;
import org.junit.Test;

import java.util.Arrays;

public class QuicklyTest {

    @Test
    public void test1(){
        Integer[] arr = {11,20,13,6,21,17,3,14};

        Quickly.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
