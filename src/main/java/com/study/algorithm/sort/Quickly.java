package com.study.algorithm.sort;

public class Quickly {
    public static Comparable[] sort(Comparable[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        sort(arr,lo,hi);

        return arr;
    }

    public static void sort(Comparable[] arr, int lo, int hi) {
        if(lo >= hi){
            return ;
        }
        int partition = partition(arr, lo, hi);

        //需要对数组中lo索引到hi索引处的元素进行分组(左子组和右子组)

        // 让左子组有序
        sort(arr,lo,partition-1);

        // 让右子组有序
        sort(arr,partition+1,hi);



    }

    public static int partition(Comparable[] arr, int lo, int hi) {
        Comparable key = arr[lo];
        int leftIndex = lo;
        int rightIndex = hi + 1;
        while(true){
            while(less(key,arr[--rightIndex])){
                if(rightIndex==lo){
                    break;
                }
            }
            while(greater(key,arr[++leftIndex])){
                if(leftIndex==hi){
                    break;
                }
            }

            if(rightIndex <= leftIndex){
                break;
            }else{
                exch(arr,rightIndex,leftIndex);
            }
        }
        exch(arr,lo,rightIndex);

        return rightIndex;
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
