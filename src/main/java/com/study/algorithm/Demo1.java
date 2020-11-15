package com.study.algorithm;

public class Demo1 {

    public static void main(String[] args){
        int sum = sum(10);
        int sum2 = sum2(10);

        System.out.println(sum);
        System.out.println(sum2);
    }

    /**
     * 解法一
     * @param n
     * @return
     */
    public static int sum(int n){
        int result = 0;
        for(int i=0;i<=n;i++){
            result += i;
        }
        return result;
    }

    public static int sum2(int n){
        if(n<=0){
            return 0;
        }
        int result = (1+n)*n/2;
        return result;
    }
}

