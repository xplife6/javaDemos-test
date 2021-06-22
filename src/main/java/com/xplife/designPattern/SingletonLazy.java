package com.xplife.designPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//懒汉模式
public class SingletonLazy {
    private static  boolean flag =false;

    //**2重
    private    SingletonLazy(){
        //同时通过是实例化方法和反射创建单例的实例的时候，需要在构造器内增加同步锁，不然无法避免创建单例后再通过反射创建实例
        //如果此时单例生成再反射生成对象之后执行，并不能避免反射生成实例
        //如果完全不通过单例，而是通过多个反射产生实例也无法避免生成多个实例
//        synchronized(SingletonLazy.class){
//            if (singletonLazy!=null){
//                throw new RuntimeException("不要试图反射创建对象");
//            }
//        }

        //3重： 增加一个变量来判断是否是是通过实例化方法生成的对象

        synchronized(SingletonLazy.class){
            if (flag==false){
                flag=true;
            }else {
                throw new RuntimeException("不要试图反射创建对象");
            }
        }

//        System.out.println(Thread.currentThread().getName()+"ok----");

    }
    private static volatile SingletonLazy singletonLazy;

    //单线程下可保证单例，但是多线程的情况下并不能保证，必须加锁
/*    public static  SingletonLazy getInstance(){
        if (singletonLazy==null){
            singletonLazy=new SingletonLazy();

        }
        return  singletonLazy;
    }*/


        //**1重
        //DCL懒汉式  双重检测锁
        public static  SingletonLazy getInstance(){
            if (singletonLazy==null){
                synchronized(SingletonLazy.class){
                    if (singletonLazy==null){
                        singletonLazy=new SingletonLazy();//不是原子性操作
                        /*
                        * 1.分配内存空间
                        * 2.执行构造方法，初始化对象
                        * 3.把对象指向这个空间
                        *
                        * 希望执行按照 1、2、3执行
                        *
                        * 实际可能发生指令重排，出现1、3、2的情况
                        * 这样多线程的情况下可能A线程出现132，B线程获取时正好处在3这一步，
                        * 此时出现singletomLazy!=null判断
                        *
                        * 此时需要通过volatile禁止指令重排来限制new的执行过程
                        * */

                    }
                }
            }
        return  singletonLazy;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        for (int s=0;s<=5;s++){
//            new Thread(()->{
//                SingletonLazy.getInstance();
//            },"thread:"+s).start();
//        }
        SingletonLazy instance1 = SingletonLazy.getInstance();
        Constructor<SingletonLazy> declaredConstructor = SingletonLazy.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Field flag = SingletonLazy.class.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance1,false);
        SingletonLazy instance2 = declaredConstructor.newInstance();
//        SingletonLazy instance3 = declaredConstructor.newInstance();


//        System.out.println(instance1);
        System.out.println(instance2);
//        System.out.println(instance3);

        }

}
