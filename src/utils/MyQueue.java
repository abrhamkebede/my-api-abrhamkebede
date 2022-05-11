package utils;

import java.util.NoSuchElementException;

/*****************************************************************
 * This class MyQueue implements a FIFO data structure using a
 * Singly Linked List (SLL).
 *****************************************************************/

public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean add(E data) {
        int preSize = this.size;
        Node<E> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
           // this.tail.setNext(node);
            //this.tail = node;
            append(data);
        }
        this.size++;
        return this.size != preSize;
    }

   private void append(E data) {
        Node<E> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("NoSuchElementException");
        }
        this.size--;
        E data = this.head.getData();
        this.head = this.head.getNext();
        return data;

    }

    public void detach() {
        if (this.head == null) {
            throw new NoSuchElementException("NoSuchElementException");
        }
        this.head = this.head.getNext();
    }

    public String toString() {
        if(isEmpty()) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> tmp = this.head;
        for (tmp = this.head; tmp!= null; tmp = tmp.getNext()) {

            if(tmp.next !=null) {
                sb.append(tmp.getData()).append(", ");
            }
            else{
                sb.append(tmp.getData()).append("]");
            }

        }

        return sb.toString();
    }

    public E peek() {
        if (this.head == null) {
            return null;
        }
        return this.head.getData();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    static class Node<E> {
        private E data;
        private Node<E> next;

        Node(E data) {
            this.data = data;
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

