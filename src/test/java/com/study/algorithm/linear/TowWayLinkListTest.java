package com.study.algorithm.linear;

import org.junit.Test;

public class TowWayLinkListTest {

    @Test
    public void test(){
        TowWayLinkList<String> sl = new TowWayLinkList<>();
        sl.insert("aaa");
        sl.insert("bb");
        sl.insert("cc");
        sl.insert("dd");
        sl.insert("ee");
        sl.insert(1,"fff");
        sl.insert(5,"fff");

        System.out.println(sl.get(1));

        System.out.println(sl.remove(0));

//        sl.clear();

        System.out.println(sl.length());

        for(String s : sl){
            System.out.println(s);
        }

    }
}
