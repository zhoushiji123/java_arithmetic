package com.zsj.string;

/**
 * Created by zsj on 2017/5/8.
 * 统计大写英文，小写英文，数字，空格，其他字符的个数
 */
public class StatisticsChar {


    public static void statistics(String str){
        int smallEnglish = 0 ;
        int bigEnglish = 0 ;
        int number =0 ;
        int space = 0 ;
        int other = 0 ;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z' )
                smallEnglish ++ ;
            else if(c >='A' && c <= 'Z')
                bigEnglish ++ ;
            else if(c >='1' && c<= '9')
                number ++ ;
            else if(Character.isWhitespace(c))
                space++;
            else
                other++;
        }

        System.out.println("小写字母"+smallEnglish+"个,"+"大写字母"+bigEnglish+"个,"+"数字"+number+"个,"+"空格"+
        space+"个,"+"其他字符"+other+"个");

    }


    public static void main(String[] args) {
        String str = "Hello123 World ";
        statistics(str);
    }

}
