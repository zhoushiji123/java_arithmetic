package com.zsj;

/**
 * Created by zsj on 2017/4/25.
 * 输入一个正数n，输出所有和为n的连续整数序列
 */
public class GetAns {

    public static void main(String[] args) {
        int n = 5 ;
        getAns(2);

    }

    public static void getAns(int n){
        int min = 1 ;
        int max = 1 ;
        int sum = 1 ;
        while(min <= n/2+1) {

            if(sum == n) {
                for(int k = min; k<=max; k++) {
                    System.out.println(k+"");
                }
                System.out.println();
                sum = sum - min;
                min ++;
                max ++;
                sum = sum+max;
            }

            if(sum > n) {
                sum = sum - min;
                min ++;
            }
            else {
                max ++;
                sum = sum + max;
            }
        }
    }


}
