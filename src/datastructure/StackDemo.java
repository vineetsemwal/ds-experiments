package datastructure;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Demo showing Deque can be used as Stack(Lifo Queue) ie. add element at end and remove from end
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<Integer> stack=new LinkedList<>();
       //adds element at last / offerLast,addLast methods do same
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println("stack "+stack);
        while (!stack.isEmpty()){
            //fetch last element and remove
            System.out.println(stack.pollLast());
        }
    }
}
