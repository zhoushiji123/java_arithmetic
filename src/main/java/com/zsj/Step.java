package com.zsj;

/**
 * Created by zsj on 2017/5/7.
 * 台阶问题：总共有n个台阶，每次只能上1格台阶或者2格台阶，请问总共有多少种完成方式？
 * 解决思路：总共1个台阶，则只有1种方法；2个台阶则2个方法；3个台阶有3个方法；
 *
 * 斐波那契数列：f(0) = 0 , f(1) = 1 , f(n) = f(n-1)+f(n-2)
 */
public class Step {

    public static int compute(int n){
        if(n < 1)
            return 0;
        if(n == 1)
            return  1;
        if(n == 2 )
            return 2;
        else
            return compute(n-1)+compute(n-2);
    }

    public static void main(String[] args) {
        int n = 3;
        int count = compute(n);
        System.out.println(n+"个台阶总有有"+count+"种走法");
    }

}
