package tests.console.week02;

import utils.MyQueue;
import java.util.Stack;
import utils.MyStack;

public class MyStackTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("=====================================================");
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t S T A C K    T E S T    P R O G R A M");
        System.out.println();
        System.out.println("=====================================================");
        System.out.println();
        System.out.println();
    }


    public static void libraryVersionTest(){
        System.out.println();
        System.out.println("<------- \t L I B R A R Y \t\t S T A C K \t ------->");
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();

        System.out.println();
        System.out.println();

        //test push
        System.out.println("************\t Test push \t**************");
        System.out.println(stack.push("Red"));
        System.out.println(stack.push("Orange"));
        System.out.println(stack.push("Yellow"));
        System.out.println(stack.push("Green"));
        System.out.println(stack.push("Blue"));
        System.out.println(stack.push("Indigo"));
        System.out.println(stack.push("Violet"));
        System.out.println(stack);
        System.out.println();
        System.out.println();
        System.out.println();


        // test pop
        System.out.println("************\t Test pop \t**************");
        System.out.println();
        System.out.println("----------original-----------");
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------1st pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------2nd pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------3rd pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------4th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------5th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------6th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------7th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println();

        //test peek
        System.out.println("************\t Test peek \t **************");
        stack1.push("Red");
        stack1.push("Orange");
        stack1.push("Yellow");
        System.out.println(stack1);
        System.out.println("peek element: " + stack1.peek());
        System.out.println();
        System.out.println();
    }


    public static void myVersionTest(){
        System.out.println();
        System.out.println("==========  M Y   S T A C K  ==========");

    }


    public static int removeMin(MyStack stack){

        MyQueue<Integer> queue1 = new MyQueue<>();
        if (stack.isEmpty()) {
            return -1;
        }
        int min = (int) stack.peek();
        while (!stack.isEmpty()) {
            min = Math.min(min, (int) stack.peek());
            queue1.add((int) stack.pop());
        }
        while(stack.size() != 0) {
            stack.pop();
        }
        MyStack<Integer> stack2 = new MyStack<>();
        while (!queue1.isEmpty()) {
            if (queue1.peek() == min) {
                queue1.remove();
            } else {
                stack2.push(queue1.remove());
            }
        }
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        return min;


    }


    public static void removeMinTest(){
        System.out.println();
        System.out.println("============  R E M O V E   M I N  =============");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(12);
        stack.push(18);
        stack.push(6);
        stack.push(11);
        stack.push(4);
        stack.push(38);
        stack.push(15);
        stack.push(24);

        System.out.println("************\t Test Min Element \t**************");
        System.out.println();
        System.out.println("----------original-----------");
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------1st min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------2nd min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------3rd min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------4th min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------5th min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------6th min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------7th min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------8th min element-----------");
        System.out.println("min element: " + removeMin(stack));
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println();
        System.out.println();



    }


    public static void queueToStack(MyQueue queue, MyStack stack){
        System.out.println("before Queue to Stack: " + queue);
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        System.out.println("after Queue to Stack: " + stack);



    }


    public static void stackToQueue(MyStack stack, MyQueue queue){
        System.out.println("before Stack to Queue: " + stack);
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println("after Stack to Queue: " + queue);



    }


    public static void main(String[] args) {
        intro();
        libraryVersionTest();
         myVersionTest();
         removeMinTest();
    }


}

