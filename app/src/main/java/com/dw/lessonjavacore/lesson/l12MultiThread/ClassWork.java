package com.dw.lessonjavacore.lesson.l12MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ClassWork {
    private static final Object mon1 = new Object();
    private static final Object mon2 = new Object();
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static char currentLetter = 'A';

    public static void main(String[] args) {
        //simpleThreadCreationExample();
        //callableExample();
        // raceConditionExample();
        //deadlockSimpleExample();
        //waitNotifyExample();
        //stopTheThread();


    }

    private static void stopTheThread() {
        Thread t = new Thread(()->{
            // while (true){
            while (!Thread.currentThread().isInterrupted()){
                try {
                    System.out.println("Tick");
                    Thread.sleep(120);
                    System.out.println("Tack");
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }

            }
        });
        //t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(3000);
            //t.stop();
            t.interrupt();

            System.out.println("Main finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitNotifyExample() {
        new Thread(ClassWork::printB).start();
        new Thread(ClassWork::printC).start();
        new Thread(ClassWork::printA).start();
    }

    private static void printA() {
        synchronized (mon1) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != 'A') {
                        mon1.wait();
                    }
                    System.out.print(currentLetter + " ");
                    Thread.sleep(400);
                    currentLetter = 'B';
                    mon1.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void printB() {
        synchronized (mon1) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != 'B') {
                        mon1.wait();
                    }
                    System.out.print(currentLetter + " ");
                    Thread.sleep(400);
                    currentLetter = 'C';
                    mon1.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void printC() {
        synchronized (mon1) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != 'C') {
                        mon1.wait();
                    }
                    System.out.println(currentLetter);
                    Thread.sleep(400);
                    currentLetter = 'A';
                    mon1.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void deadlockSimpleExample() {
        new Thread(ClassWork::doA).start();
        new Thread(ClassWork::doB).start();
    }

    //private static synchronized void  doA(){
    private static void doA() {
        try {
            synchronized (mon1) {
                System.out.println("DO A");
                Thread.sleep(2000);
            }
            doB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void doB() {
        // private static synchronized void  doB(){
        try {
            synchronized (mon2) {
                System.out.println("DO B");
                Thread.sleep(2000);
            }
            doA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void raceConditionExample() {
        Thread t1 = new Thread(ClassWork::loopIncrement);
        Thread t2 = new Thread(ClassWork::loopIncrement);
        Thread t3 = new Thread(ClassWork::loopIncrement);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("A = %s, B = %s, C = %d\n", a, b, c);
    }

    private static void loopIncrement() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }

    }

    private static synchronized void increment() {
        // private static  void increment() {
        a++;
        b++;
        c++;
    }

    private synchronized void doSomethingSynchronized() {

    }

    private static void callableExample() {
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "Hello";
            }
        });
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get(3, TimeUnit.SECONDS));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("After");
    }

    private static void simpleThreadCreationExample() {
        System.out.printf("Hello from main! Thread is [%s]\n", Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.printf("Hello from Anonymous! Thread is [%s]\n", Thread.currentThread().getName());
            }
        });
        t2.start();

        new Thread(() -> System.out.printf("Hello from lambda! Thread is [%s]\n", Thread.currentThread().getName())
        ).start();

        new Thread(() -> sayHello("Vasya")).start();
    }

    private static void sayHello(String name) {
        System.out.printf("Hello  [%s]\n", name);
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.printf("Hello from Runnable! Thread is [%s]\n", Thread.currentThread().getName());
        }
    }

    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.printf("Hello from Thread! Thread is [%s]\n", Thread.currentThread().getName());
        }
    }
}
