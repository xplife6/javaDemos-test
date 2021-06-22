package com.xplife.designPattern;

//静态内部类单例
public class SingletonInner {
    private SingletonInner(){}


    public static SingletonInner getInstance(){
        return InnerClass.singletonInner;
    }

    public static class  InnerClass{
        private final static SingletonInner singletonInner=new SingletonInner();
    }

    public static void main(String[] args) {
    }


}
