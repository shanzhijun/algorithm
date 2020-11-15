package com.study.algorithm.sort;

import com.study.algorithm.sort.Shell;
import org.junit.Test;

import java.util.Arrays;

public class ShellTest {
    @Test
    public void testSort(){
        Integer[] arr = {1,20,3,6,2,7,3,4};

        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
