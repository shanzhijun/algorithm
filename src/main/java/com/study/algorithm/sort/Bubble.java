package com.study.algorithm.sort;

public class Bubble {
     public static void sort(Comparable[] a){

     }

     private static boolean greater(Comparable v , Comparable w){
        return v.compareTo(w) > 0 ;
     }

     private static void exch(Comparable[] a, int i,int j){
         Comparable tmp = a[i];
         a[i] = a[j];
         a[j] = tmp;
     }



    // 冒泡排序
    public static Comparable[] test3(Comparable[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        for(int i=0;i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++ ){
                if(greater(arr[j],arr[j+1])){
                    exch(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    // 冒泡排序
    public static Comparable[] test4(Comparable[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        for(int i=0;i < arr.length; i++){
            for(int j = 0; j < arr.length- 1; j++ ){
                if(greater(arr[j],arr[j+1])){
                    exch(arr,j,j+1);
                }
            }
        }
        return arr;
    }

}
