package utils;

import org.w3c.dom.Node;

public class SinglyLinkedList<E>
{
    private Node<E> first;
    private int size;

    static class Node<E>
    {
        E data;
        Node<E> next;

        public Node(E data)
        {
            this.data = data;
            next = null;
        }

        public Node(E data, Node<E> next)
        {
            this.data = data;
            this.next = next;
        }
    }

    public SinglyLinkedList()
    {
        first = null;
        size = 0;
    }

    public boolean add(E item)
    {
        append(item);
        return true;
    }

    public E get(int index)
    {
        if(index <0){
            throw new IndexOutOfBoundsException();
        }
        if(index >= size)
            throw new IndexOutOfBoundsException();


        Node<E> current = first;
        for(int i = 0; i < index; i++)
            current = current.next;

        return current.data;

    }

    private void checkIndex(int index)
    {
        if(index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
    }

    private void append(E item)
    {
        if(first == null)
            first = new Node<E>(item);
        else
        {
            Node<E> current = first;
            for(; current.next != null; current = current.next);
            current.next = new Node<E>(item);
        }

        ++size;
    }

    public int size()
    {
        return size;
    }

    public void add(int index, E item)
    {
        Node<E> n = new Node<E>(item);
        if(index == 0)
        {
            n.next = first;
            first = n;
            ++size;
        }
        else if(index == size)
            append(item);
        else
        {
            insertBefore(index + 1, item);
        }
    }

    public E set(int index, E item)
    {
        if(index >= size)
            return null;

        Node<E> n = node(index);
        n.data = item;
        return item;
    }

    public E remove(int index)
    {
        if(index >= size)
            return null;

        Node<E> current = first;
        Node<E> prev = null;
        for(int i = 0; i < index; i++, current = current.next)
            prev = current;

        E result = current.data;
        prev.next = current.next;
        --size;
        return result;
    }

    private void insertBefore(int index, E item)
    {
        Node<E> presentNode = node(index);
        Node<E> n = new Node<E>(item);
        n.next = presentNode.next;
        presentNode.next = n;
        ++size;
    }

    public String toString()
    {
        Node<E> current = first;
        String s = "";

        for(; current != null; current = current.next)
            s = s + current.data + " -> ";
        return s;
    }

    private Node<E> node(int index)
    {
        Node<E> current = first;
        for(int i = 0; i < index; i++)
            current = current.next;

        return current;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

}



