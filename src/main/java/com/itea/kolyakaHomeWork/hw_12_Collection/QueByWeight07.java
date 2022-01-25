package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueByWeight07 {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(1,400.5F);
        HeavyBox heavyBox2 = new HeavyBox(2,50.5F);
        HeavyBox heavyBox3 = new HeavyBox(1,500.5F);
        HeavyBox heavyBox4 = new HeavyBox(3,100.5F);
        HeavyBox heavyBox5 = new HeavyBox(3,300.5F);

        PriorityQueue<HeavyBox> deque = new PriorityQueue<>();
        deque.offer(heavyBox1);
        deque.offer(heavyBox2);
        deque.offer(heavyBox3);
        deque.offer(heavyBox4);
        deque.offer(heavyBox5);

        System.out.println("initial deque");
        System.out.println(deque);

        PriorityQueue<HeavyBox> dequeNew = new PriorityQueue<>();

        while(deque.peek().weightHeavyBox>300){
            dequeNew.offer(deque.poll());
        };

        System.out.println("updated queue");
        System.out.println(deque);

        System.out.println("New queue");
        System.out.println(dequeNew);
    }
}
