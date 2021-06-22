package com.xplife;

import java.util.ArrayList;
import java.util.List;

public class streamDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("qwe");
        strings.add("1231");
        strings.add("zxcjok0");
        strings.forEach(a-> System.out.println(a.length()+"+++++"+a.hashCode()));


//        strings.stream().filter();
    }
}


