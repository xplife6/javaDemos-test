package com.xplife.designPattern;

/**
 * 饿汉模式 通过final 保证唯一性  类加载时直接创建对象
 */
public class SingletonHungry {

    //如果初始化需要内存空间大，可能会造成内存空间浪费
    private  byte[] data1=new byte[1024*1024];
    private  byte[] data2=new byte[1024*1024];
    private  byte[] data3=new byte[1024*1024];
    private  byte[] data4=new byte[1024*1024];
    private  SingletonHungry(){

    }

    private final  static  SingletonHungry singletonHungry=new SingletonHungry();

    public static   SingletonHungry getInstance(){
        return  singletonHungry;
    }
}
