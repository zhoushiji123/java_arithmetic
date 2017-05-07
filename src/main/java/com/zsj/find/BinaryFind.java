package com.zsj.find;

/**
 * Created by zsj on 2017/4/25.
 * 数组的二分查询，返回数组中某个value的位置
 */
public class BinaryFind {

    public static void main(String[] args) {
        int data[] = {3,5,8,10,12,14,18,20,25,33,37};   //数组需要提前正向排序
        int index = binaryFind(data,37);
        System.out.println(index);

    }

    public static int binaryFind(int[] data,int value){
        int start =0 ;   //设定起始坐标
        int end = data.length -1 ;  //设定末尾坐标
        while(start <= end){
            int middle = (start + end)/2;   //获得中间坐标
            int middleValue = data[middle]; //获得中间值
            if(value == middleValue)  //命中，返回中间坐标
                return  middle;
            else if(value > middleValue) //目标值比中间值大，说明在后半部分 start = middle +1
                start = middle +1 ;

            else if(value < middleValue)  //目标值比中间值小，说明在前半部分 end = middle -1 ;
                end = middle -1 ;
        }
        return  -1 ;    //跳出循环说明没查找到，返回-1
    }
}
