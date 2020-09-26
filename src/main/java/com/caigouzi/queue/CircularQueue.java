package com.caigouzi.queue;

public class CircularQueue {
  // 数组：items，数组大小：n
  private String[] items;
  private int n = 0;
  // head表示队头下标，tail表示队尾下标
  private int head = 0;
  private int tail = 0;
  private boolean isFirst = true;

  public static void main(String[] args) {
    CircularQueue circularQueue = new CircularQueue(4);
    circularQueue.enqueue("1");
    circularQueue.enqueue("2");
    circularQueue.enqueue("1");
    circularQueue.enqueue("1");

  }

  // 申请一个大小为capacity的数组
  public CircularQueue(int capacity) {
    items = new String[capacity];
    n = capacity;
  }

  // 入队
  public boolean enqueue(String item) {
    if (isFirst) {
      items[tail++] = item;
      return true;
    } else{
      // 队列满了

      if ((tail + 1) % n == head) return false;
      items[tail] = item;
      tail = (tail + 1) % n;
      return true;
    }

  }

  // 出队
  public String dequeue() {
    // 如果head == tail 表示队列为空
    if (head == tail) return null;
    String ret = items[head];
    head = (head + 1) % n;
    return ret;
  }
}