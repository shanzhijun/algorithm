package com.study.algorithm.sort;

public class Selection {


    public static Comparable[] sort(Comparable[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        for(int i=0;i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1;j < arr.length; j++){
                if(greater(arr[minIndex],arr[j])){
                    minIndex = j;
                }
            }
            exch(arr,minIndex,i);
        }
        return arr;
    }

    private static boolean greater(Comparable v , Comparable w){
        return v.compareTo(w) > 0 ;
    }

    private static void exch(Comparable[] a, int i,int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
