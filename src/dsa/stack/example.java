package dsa.stack;

import java.util.*;

public class example {
    public static void main(String[] args) {

        //stack push and pull process is shown here how its done is not compulsory to know
//        stack follows the rule first in last out

//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(3);
//        stack.push(4);
//        stack.push(8);
//        stack.push(12);
//        stack.push(20);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());System.out.println(stack.pop());System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        //there is no class called 'queue'
        //it is just an interface in which its function as abstract are defined
        //they will use Linkedlist for their class

//      queue follow the rule first in first out or last in last out
//
//          Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(3);
//        queue.add(5);
//        queue.add(9);
//        queue.add(12);
//        queue.add(15);
//
//        System.out.println(   queue.size());
//        //peek method just gets the item but doesnot remove it
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());


        //Deque or doubly ended queue
        //a advance queue where we can insert or delete from both side

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        //many more




    }
}
