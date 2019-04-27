package com.xtf.springbootproj.demo;

import lombok.Synchronized;


public class ThreadTest implements Runnable {
    static int i=0;
    Object object1=new Object();
    Object object2=new Object();

    @Override
    public void run() {
       synchronized (object1){
            System.out.println(Thread.currentThread().getName()+"线程方法0开始执行");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"在方法0执行结束");
       }
        synchronized (object2){
            System.out.println(Thread.currentThread().getName()+"线程方法1开始执行");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"在方法1执行结束");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        ThreadTest test1=new ThreadTest();

        Thread thread1=new Thread(test1);
        Thread thread2=new Thread(test1);
        thread1.start();
        thread2.start();
    }
}
