package space.cyd.easy;

/**
 * @author: chenyda
 * @date: 2020/03/03 20:20
 * @description:
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class Num155 {
}
class MinStack {

    private ValueWrapper head = new ValueWrapper();
    /**
     * initialize your data structure here.
     */
    public MinStack() {
    }

    public void push(int x) {
        //设置栈次序
        ValueWrapper current = new ValueWrapper();
        current.setValue(x);
        current.setStackAfter(head.getStackAfter());
        head.setStackAfter(current);
        //设置最小值次序
        valueSort(current);
    }

    public void pop() {
        ValueWrapper popV = head.getStackAfter();
        if(popV != null){
            head.setStackAfter(popV.getStackAfter());
            popV.remove();
        }
    }

    public int top() {
        return head.getStackAfter().getValue();
    }

    public int getMin() {
        return head.getAfter().getValue();
    }

    private void valueSort(ValueWrapper v) {
        ValueWrapper point = head;
        while (point.getAfter() != null) {
            point = point.getAfter();
            if (point.getValue() >= v.getValue()) {
                point.getPrev().setAfter(v);
                v.setAfter(point);
                return;
            }
        }
        point.setAfter(v);
    }
}

class ValueWrapper {
    private int value;
    private ValueWrapper prev;
    private ValueWrapper after;

    public ValueWrapper getStackAfter() {
        return stackAfter;
    }

    public void setStackAfter(ValueWrapper stackAfter) {
        this.stackAfter = stackAfter;
    }

    private ValueWrapper stackAfter;

    public ValueWrapper getAfter() {
        return after;
    }

    public void setAfter(ValueWrapper after) {
        this.after = after;
        if(after != null){
            after.setPrev(this);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ValueWrapper getPrev() {
        return prev;
    }

    public void setPrev(ValueWrapper prev) {
        this.prev = prev;
    }


    public ValueWrapper() {
    }

    public void remove() {
        if (this.prev != null) {
            this.prev.setAfter(this.after);
        }
    }
}
