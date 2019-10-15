package com.company;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> queue;
    private int maxElementsNr;

    public Queue(int maxElementsNr) {
        this.maxElementsNr = maxElementsNr;
        this.queue = new ArrayList<Integer>();
    }

    public Queue() {
        this.maxElementsNr = -1;
        this.queue = new ArrayList<Integer>();
    }

    public void push(int itemToAdd) {
        if (this.maxElementsNr < 0 || this.maxElementsNr > this.queue.size()) {
            this.queue.add(itemToAdd);
        } else {
            System.out.println(("Queue is full"));
        }
        this.showQueue();
    }

    public void pop() {
        if (this.queue.size() <= 0) {
            System.out.println("Queue is empty");
        } else {
            this.queue.remove(0);
        }
        this.showQueue();
    }

    public void showQueue() {
        System.out.print("Queue has following elements: ");
        for (int i = 0; i < this.queue.size(); i++) {
            System.out.print(this.queue.get(i) + ", ");
        }
        if (this.maxElementsNr < 0) {
            System.out.println(" | Queue has no limit");
        } else {
            System.out.println(" | Maximum Nr of elements is : " + this.maxElementsNr);
        }
    }

    public boolean isEmpty() {
        if(this.queue.size() == 0) {
            return true;
        } else {
            return false;
       }
    }
    public void isFull() {
        if (this.maxElementsNr < 0) {
            System.out.println("Queue is never full");
        } else if (this.maxElementsNr > this.queue.size()) {
            System.out.println("The queue is not full");
        } else {
            System.out.println("The queue is full");
        }
    }
}
