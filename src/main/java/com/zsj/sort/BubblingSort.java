package com.zsj.sort;

/**
 * Created by zsj on 2017/4/25.
 * 冒泡排序：依次判断，每一轮把最大的冒到最后去
 */
public class BubblingSort {
    public static void main(String[] args) {
        int a[] = {11,25,33,12,13,8,1,9,55,54,38,20,17,7};
        bubbleSort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }

    public static void bubbleSort(int data[]){
        int temp ;
        for(int i=0;i<data.length-1;i++) //从第一个元素开始，到倒数第二个元素都要操作
            for(int j=0;j<data.length-1-i;j++)//最后的i个元素已经冒出去了，所以从0开始到data.length-1-i，进行依次判断

                if(data[j] > data[j+1]){  //前一个数比后一个数大，交换
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }

    }
}
