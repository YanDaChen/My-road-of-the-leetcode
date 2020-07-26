package space.cyd.easy;

import java.util.LinkedList;

/**
 * @author: chenyda
 * @date: 2020/04/18 23:07
 * @description:
 * Implement the following operations of a queue using stacks.
 *
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Example:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // returns 1
 * queue.pop();   // returns 1
 * queue.empty(); // returns false
 */
public class Num232 {
    class MyQueue {

        private LinkedList<Integer> linkedList = new LinkedList<>();
        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            linkedList.addLast(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return linkedList.pop();
        }

        /** Get the front element. */
        public int peek() {
            return linkedList.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return linkedList.isEmpty();
        }
    }
}
