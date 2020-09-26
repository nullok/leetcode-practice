package com.caigouzi.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/3 11:48
 */
class MyCircularQueue {
    private int[] queue;
    private int fontIndex;
    private int rearIndex;
    private int maxSize;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new int[k];
        maxSize = k;
        fontIndex = 0;
        rearIndex = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[rearIndex] = value;

        rearIndex = (rearIndex + 1) % maxSize;

        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        int i = queue[fontIndex];
        System.out.println(i);
        fontIndex = (fontIndex + 1) % maxSize;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return isEmpty() ? -1 : queue[fontIndex];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return isEmpty() ? -1 : queue[rearIndex];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return rearIndex == fontIndex;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rearIndex + 1) % maxSize == fontIndex;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.Rear();
        circularQueue.isFull();
        circularQueue.deQueue();
        circularQueue.enQueue(4);
        circularQueue.Rear();

    }
}
