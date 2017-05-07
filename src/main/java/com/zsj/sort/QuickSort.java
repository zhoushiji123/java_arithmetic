package com.zsj.sort;

/**
 * Created by zsj on 2017/4/25.
 * 快速排序：选择一个基准元素(第一个),通过扫描得到2组序列，一组比基准元素小，一组比基准元素大
 * 然后用同样方法递归排序2组序列
 */
public class QuickSort {

    public static void main(String[] args) {
        int a[] = {7,2,3,10,12,15,1,5,8,4,11,13};
        quickSort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }

    }

    public static int getMiddleIndex(int data[],int start , int end ){
        int key= data[start];   //基准元素
        while( start< end ){

            while(data[end]>key && start<end)  //从后往前扫描
                end -- ;

            data[start] = data[end];  //比基准小的元素移动到低端

            while(data[start]<key && start<end)  //从前往后扫描
                start++;

            data[end] = data[start]; //比基准大的元素移动到高端
        }

        data[end] = key;
        return end;
    }

    public static void quickSort(int data[],int start,int end){
        if(start<end && data.length>0){
            int index = getMiddleIndex(data,start,end);
            quickSort(data,start,index-1);
            quickSort(data,index+1,end);
        }


    }
}
