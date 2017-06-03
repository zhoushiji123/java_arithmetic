package com.zsj.string;

import java.util.regex.Pattern;

/**
 * Created by zsj on 2017/6/3.
 * 判断是否是中文字符。
 */
public class IsChinese {

    public static void main(String[] args) {
        char c = '的';
        String str = "123sxxd,, sdas1235";
        System.out.println(isChineseByUnicode(c));
        System.out.println(isChineseByReg(String.valueOf(c)));
        System.out.println(isChinese(str));
    }


    /**
     *通过unicode编码判断是否是中文字符。
     */
    public static boolean isChineseByUnicode(char c){
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }


    /**
     * 正则判断，不能识别中文标点符号，比如'，'  '。'
     * @param str
     * @return
     */
    public static boolean isChineseByReg(String str){
        if (str == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("[\\u4E00-\\u9FBF]+");
        return pattern.matcher(str.trim()).find();
    }


    /**
     * 判断字符串中是否有中文字符
     * @param str
     * @return
     */
    public static boolean isChinese(String str){
        char[] charArray = str.toCharArray();
        for(char c:charArray)
            if(isChineseByUnicode(c))
                return true;
        return false;
    }
}
