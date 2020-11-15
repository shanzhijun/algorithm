package com.study.algorithm;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(test1(10));
        System.out.println(test2(10));
    }

    public static int test1(int n) {
        if (n <= 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int test2(int n){
        if(n==1){
            return 1;
        }
        return n*test2(n-1);
    }
}
