package com.study.algorithm.linear;

import org.junit.Test;

public class LinkListTest {

    @Test
    public void test(){
        LinkList<String> sl = new LinkList<>();
        sl.insert("aaa");
        sl.insert("bb");
        sl.insert("cc");
        sl.insert("dd");
        sl.insert("ee");
        sl.insert(1,"fff");

        System.out.println(sl.get(1));

        System.out.println(sl.remove(0));

//        sl.clear();

        System.out.println(sl.length());

        sl.reverse();
        for(String s : sl){
            System.out.println(s);
        }

    }
}
