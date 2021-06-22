package com.xplife.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasDemo {

    //CAS compare and swap :比较并交换
    public static void main(String[] args) {
        Integer a=14848;
        Integer b=14848;
        System.out.println(a==b);
        new Integer(128);
        Integer.valueOf(456);
        AtomicInteger atomicInteger = new AtomicInteger(2020);
        atomicInteger.compareAndSet(2020,2021);
        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger);
    }
}
