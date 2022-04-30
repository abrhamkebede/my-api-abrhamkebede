package utils;

/**
 * This class is a generic class that can take any type in the "<>" placeholder
 *
 */

public class SinglyLinkedList<Anything> {

    Node<Anything> first;
    int            size;

    public SinglyLinkedList(){
        first = null;
        size  = 0;
    }


    public boolean add(Anything item){
        int oldSize = size;
        append(item);
        size++;
        return size == (oldSize + 1);
    }

    /**
     * This method add items to the back of list
     * @param item
     */
    private void append(Anything item){
        // find the last node in the list (index location).
        Node<Anything> oldLast = node(size - 1);
        Node<Anything> newNode = new Node<>(item);

        if (isEmpty())
            first = newNode;            // add first item to list, when empty
        else
            oldLast.next = newNode;     // append to last node in list
    }


    public boolean isEmpty(){
        return first == null && size == 0;
    }

    private Node<Anything> node(int index){
        Node<Anything> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int size(){
        return size;
    }

    public String toString(){
        if(isEmpty()){
            return "[]";
        }else{
            StringBuilder result = new StringBuilder("[" + first.data);
            for(Node<Anything> node = first.next; node != null; node = node.next)
                result.append(", ").append(node.data);
            return result + "]";
        }

    }


    /**
     *  This class is decoupled from the outer class Singly Linked List
     *  This is a class that will serve as storage for items in the list.
     */
    private static class Node<E>{
        //data fields (stores values)
        E       data;
        Node<E> next;

        public Node(E data){
            this(data, null);
        }

        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

}