package com.study.algorithm.sort;

import com.study.algorithm.sort.Bubble;
import org.junit.Test;

import java.util.Arrays;

public class BubbleTest {



    @Test
    public void test3(){
        Integer[] arr = {1,20,3,6,2,7,3,4};

        Bubble.test3(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Integer[] arr = {1,20,3,6,2,7,3,4};

        Bubble.test4(arr);
        System.out.println(Arrays.toString(arr));

    }
}
