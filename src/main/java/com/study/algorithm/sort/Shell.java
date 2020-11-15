package com.study.algorithm.sort;

public class Shell {
    public static Comparable[] sort(Comparable[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }

        int h = getInitDistiance(arr.length);

        while(h > 0 ){
            for(int i = h; i< arr.length;i++){
                for(int j = i; j>=h; j-=h){
                    if(greater(arr[j-h],arr[j])){
                        exch(arr,j-h,j);
                    }else {
                        break;
                    }
                }

            }
            h = h / 2;
        }

        return arr;
    }

    private static int getInitDistiance(int length){
        int distance = 1;
        while(distance < length/2){
            distance = distance * 2 +1;
        }
        return distance;
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
