package com.zsj.math;

/**
 * Created by zsj on 2017/5/8.
 * 将一个整数分解质因数，并依次输出
 */
public class Decompose {

    public static  void decompose(int n){
        while(n>1){
            int i = 2 ;
            while (n % i != 0){
                i++;
            }
            n = n / i ;
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n = 90;
        decompose(n);

        int x = 80;
        String str = (x>=90)?"A":((x>=80)?"B":( (x>=70)?"C":"D") );
        System.out.println(str);
    }
}
