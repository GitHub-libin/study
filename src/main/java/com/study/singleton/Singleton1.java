package com.study.singleton;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Singleton1 {
    /**
     * 单例模式
     * 懒汉式，线程不安全
     */
    private static Singleton1 instance;

    private Singleton1() {}


    public static Singleton1 getInstance(){
        if (instance==null){
            instance = new Singleton1();
        }
        return instance;
    }


}