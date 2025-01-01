package org.opengoofy.index12306.test.general.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;


public class test_stream {

  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(
        (o1, o2) -> Integer.compare(o1, o2)
    );
    queue.add(11);
    queue.add(2);
    System.out.println(queue.peek());


  }

}
