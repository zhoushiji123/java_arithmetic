package com.zsj;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zsj on 2017/4/25.
 * 数组相邻的元素相加，输出最小值
 */
public class ArrayAdd {
    public static void main(String[] args) {
        int[] a = {1,9,2,4,5,7,3,2,1,4};
        System.out.println(getMin(a));
    }

    public static  int getMin(int a[]){
        int min =0;
        for(int i=0;i<a.length-1;i++){
            int sum = a[i]+a[i+1];
            if(i == 0 || sum<min)
                min = sum ;
        }
        return min;
    }

    class Test1<T>{
        Class<T> kind;
        public Test1(Class<T> kind){
            this.kind = kind;
        }

        public  boolean f(Object object){
            try {
                T t ;
                t = kind.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return  kind.isInstance(object);
        }

    }


}
