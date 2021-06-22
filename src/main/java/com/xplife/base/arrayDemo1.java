package com.xplife.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arrayDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xp");
        list.add("windows");
        list.add("linux");
        list.forEach( System.out::println);
//        Collection


    }
}
