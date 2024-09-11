package com.sda.advanced.collections.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Maps {
    public static void main(String[] args) {


        Queue<Integer> queue = new LinkedList<>();

        // System.out.println(queue.element()); prvy element v kolekcii, vrati error ak je prazdna
        // System.out.println(queue.peek());    prvy element v kolekcii, vrati null ak je prazdna

        // System.out.println(queue.poll());    vrati posledny element a odstrani ho, vrati error ak je prazdna
        // System.out.println(queue.remove());  vrati posledny element a odstrani ho, nic sa nestane ak je prazdna


        boolean added = queue.offer(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(added);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.remove());

        System.out.println(queue);

        Deque<String> deque = new LinkedList<>();

        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println(deque);

        deque.addFirst("New First");
        deque.addLast("New Last");
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

    }
}
