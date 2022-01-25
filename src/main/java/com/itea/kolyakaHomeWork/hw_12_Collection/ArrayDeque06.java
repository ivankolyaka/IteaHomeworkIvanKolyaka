package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque06 {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(1,3.5);
        HeavyBox heavyBox2 = new HeavyBox(2,5.5);
        HeavyBox heavyBox3 = new HeavyBox(3,10.5);

        Deque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(heavyBox1);
        deque.offer(heavyBox2);
        deque.offer(heavyBox3);

        System.out.println("initial deque");
        System.out.println(deque);

        while(deque.poll()!=null){};  //{System.out.println(deque.poll());} если бы хотели видеть что удаляем,но цикл др

        System.out.println("after poll");
        System.out.println(deque);
    }
}
