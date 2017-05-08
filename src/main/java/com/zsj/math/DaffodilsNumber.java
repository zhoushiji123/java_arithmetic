package com.zsj.math;

/**
 * Created by zsj on 2017/5/8.
 * 判断是否是"水仙花数"：153 = 1的立方+5的立方+3的立方 。 水仙花数是一个3位数
 */
public class DaffodilsNumber {

    public static boolean isDaffodils(int n){
        int hundred = n/100 ;  //得到百位数字

        int ten = (n-hundred*100)/10;  //得到十位数字

        int one = n%10;  //个位数字

        double s = Math.pow(hundred,3)+Math.pow(ten,3)+Math.pow(one,3);

        int sum = (int)s;

        if(sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isDaffodils(n));
    }
}
