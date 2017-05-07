package com.zsj.math;

/**
 * Created by zsj on 2017/5/7.
 * 判断是否是素数
 * 思路：从2开始到n的开方，判断x能否整除
 */
public class PrimeNumber {

    public static boolean isPrime(int x){
        if(x == 1)
            return false;
        else{
            for(int i=2;i<Math.sqrt(x);i++) //从2开始 直到n的开方
                if( x%i == 0)   //x能整除1个数不是素数，
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPrime = isPrime(21);
        System.out.println(isPrime);
    }
}
