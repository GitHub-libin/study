package com.study.designPattern.singleton;

/**
 * Created by Administrator on 2017/7/25.
 */
public class Singleton2 {

    /**
     * 单例模式
     * 懒汉式，线程安全
     */
    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
