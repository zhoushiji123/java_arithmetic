package com.zsj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zsj on 2017/5/18.
 * 集合中元素循环删除问题：
 *   普通循环删除不会报错，但是删除过程中集合长度发生改变，for循环次数改变，导致元素遍历删除结果不正确。
 *   加强for循环(本质使用了Iterator)会报错：.ConcurrentModificationException。
 *   使用Iterator的remove删除，安全，能保证结果正确。
 *
 *   在list的iterator()方法中，有2个值madCount和expectMadCount判断是否相等，不相等时则报错；使用iteroter.remove()
 *   方法会自动调整madCount和expectMadCount为相等的。
 *
 */
public class ListRemove {

    public static List<String> list = new ArrayList<String>();

    static {
        list.add("zsj");
        list.add("qq");
        list.add("tt");
        list.add("zsj");
        list.add("ww");
        list.add("zsj");
        list.add("zsj");
        list.add("123");
        list.add("gg");
        list.add("zsj");
        list.add("ww");
        list.add("zsj");
        list.add("zsj");
        list.add("zsj");
    }

    public static void main(String[] args) {
//        for(int i=0;i<list.size();i++){
//            if("zsj".equals(list.get(i)))
//                list.remove(i);
//        }

//        for(String s : list){
//            if(s.equals("zsj"))
//                list.remove(s);
//        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("zsj"))
                iterator.remove();
        }


        for(String s : list)
            System.out.println(s);
    }
}
