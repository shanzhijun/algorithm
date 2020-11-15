package com.study.algorithm.sort;

public class Merge {

    private static Comparable[] assit;

    public static Comparable[] sort(Comparable[] arr){
       // 1、初始化辅助数组
        assit = new Comparable[arr.length];
        // 2、定义一个lo变量 和 hi变量，分别记录数组中最小的所以和最大索引
        int lo = 0;
        int hi = arr.length - 1;
        // 3、完成数组arr中从索引lo到索引hi的元素的排序
        sort(arr,lo,hi);

        return arr;
    }

    public static void sort(Comparable[] arr,int lo,int hi){
        if(lo >= hi){
            return;
        }

        // 对lo和hi之间的数据进行分组
        int mid = (lo + hi) /2;

        sort(arr,lo,mid);
        sort(arr,mid+1,hi);

        //归并
        merge(arr,lo,mid,hi);

    }

    public static void merge(Comparable[] arr,int lo,int mid,int hi){
        int firstIndex = lo;
        int secondIndex = mid + 1;
        int assisIndex = lo;

        while (firstIndex <= mid && secondIndex <= hi){
            if(less(arr[firstIndex],arr[secondIndex])){
                assit[assisIndex++] = arr[firstIndex++];
            }else{
                assit[assisIndex++] = arr[secondIndex++];
            }
        }

        while(firstIndex <= mid){
            assit[assisIndex++] = arr[firstIndex++];
        }

        while(secondIndex <= hi){
            assit[assisIndex++] = arr[secondIndex++];
        }

        for(int index=lo;index<=hi;index++){
            arr[index] = assit[index];
        }
    }

    private static boolean greater(Comparable v , Comparable w){
        return v.compareTo(w) > 0 ;
    }

    private static boolean less(Comparable v , Comparable w){
        return v.compareTo(w) < 0 ;
    }
    private static void exch(Comparable[] a, int i,int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
