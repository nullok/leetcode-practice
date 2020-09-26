package com.caigouzi.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1114. 按序打印
 * 三个不同的线程将会共用一个 Foo 实例。
 *
 * 线程 A 将会调用 one() 方法
 * 线程 B 将会调用 two() 方法
 * 线程 C 将会调用 three() 方法
 * 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/print-in-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Foo {
    ReentrantLock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();
    public Foo() {
        
    }
    public void one() throws InterruptedException {
        lock.lock();
        condition3.await();
        System.out.println("one");
        condition1.signal();
        lock.unlock();
    }
    public void two() throws InterruptedException {
        lock.lock();
        condition1.await();
        System.out.println("two");
        condition2.signal();
        lock.unlock();
    }
    public void three() throws InterruptedException {
        lock.lock();
        condition2.await();
        System.out.println("three");
        condition3.signal();
        lock.unlock();
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        condition1.signal();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        condition1.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        condition2.signal();
    }

    public void third(Runnable printThird) throws InterruptedException {
        condition2.await();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        new Thread(() -> {
            try {
                foo.one();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                foo.two();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                foo.three();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}