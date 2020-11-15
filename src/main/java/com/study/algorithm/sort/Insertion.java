package com.study.algorithm.sort;

public class Insertion {

    public static Comparable[] sort(Comparable[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }

        for(int i=1;i<arr.length;i++){
            for(int j = i; j > 0 ;j--){
                if(greater(arr[j-1],arr[j])){
                    exch(arr,j-1,j);
                }else{
                    break;
                }

            }
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
