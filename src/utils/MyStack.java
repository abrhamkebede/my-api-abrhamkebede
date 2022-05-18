package utils;

/*****************************************************************
 * This class MyStack implements a LIFO data structure using a
 * Singly Linked List (SLL).
 *****************************************************************/
public class MyStack<E> {
    private Node<E> top;
    private int size;

    public MyStack() {
        this.top = null;
        this.size = 0;
    }

    public E push(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.setNext(top);
        top = newNode;
        size++;
        return item;
    }

    public E pop() {
        if (top == null) {
            throw new RuntimeException("class java.util.EmptyStackException");
        }
        size--;
        E res= top.getData();
        top = top.getNext();
        return res;
    }

    public E peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.getData();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        String res = "";
        Node<E> temp = this.top;
        for (temp = this.top; temp != null; temp = temp.getNext()) {
            res += temp.getData() + " ";
        }
        return res;
    }

    static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}


