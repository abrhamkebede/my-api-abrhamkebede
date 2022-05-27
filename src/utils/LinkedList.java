package utils;

import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {
    public int size;
    public Node<E> head;
    public Node<E> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public LinkedList(int size, Node<E> head, Node<E> tail) {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public boolean add(E item) {
        if (this.head == null) {
            this.head = new Node<>(item);
            this.tail = this.head;
        } else {
            Node<E> newNode = new Node<>(item);
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            Node<E> newNode = new Node<>(item);
            newNode.next = this.head;
            this.head = newNode;
            size++;
        } else {
            Node<E> current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(item);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    private void append(E item) {
        if (this.head == null) {
            this.head = new Node<>(item);
            this.tail = this.head;
        }
        Node<E> newNode = new Node<>(item);
        this.tail.next = newNode;
        this.tail = newNode;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean contains(E item) {
        Node<E> current = this.head;
        while (current != null) {
            if (current.data.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private E detach(int index) {
        checkIndex(index);
        if (index == 0) {
            E data = this.head.data;
            this.head = this.head.next;
            size--;
            return data;
        }
        Node<E> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        E data = (E) current.next.data;
        current.next = current.next.next;
        size--;
        return data;
    }

    public int indexOf(E item) {
        Node<E> current = this.head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(item)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    private void insertBefore(int index, E item) {
        if (head == null) {
            head = new Node<>(item);
            tail = head;
        } else if (index == 0) {
            Node<E> newNode = new Node<>(item);
            newNode.next = this.head;
            this.head = newNode;
        }
        Node<E> current = this.head;
        Node<E> previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }
        Node<E> newNode = new Node<>(item);
        newNode.next = current;
        previous.next = newNode;
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private Node node(int index) {
        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public boolean remove(E item) {
        Node<E> current = this.head;
        Node<E> previous = null;
        while (current != null) {
            if (current.data.equals(item)) {
                if (previous == null) {
                    this.head = current.next;

                } else {
                    previous.next = current.next;

                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        return detach(index);
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = this.head;
        while (current != null) {
            sb.append(current.data);
            current = current.next;
            if (current != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public E get(int index) {
        checkIndex(index);
        Node<E> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public E set(int i, E item) {
        checkIndex(i);
        E res = null;
        Node<E> current = this.head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        res = current.data;
        current.data = item;
        return res;
    }

    public Iterator<E> iterator() {
        return new LinkedListIterator<>();
    }

    private class LinkedListIterator<E> implements Iterator<E> {
        private Node<E> current;
        private Node<E> previous;

        public LinkedListIterator() {
            current = (Node<E>) head;
            this.previous = null;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            previous = current;
            current = current.next;
            return previous.data;
        }

        @Override
        public void remove() {
            //remove the item returned by the last call to next().
            //Uses remove method from its enclosing class to do the operation. If remove() has been called without a
            //call on next(), throws an IllegalStateException
            if (previous == null) {
                throw new IllegalStateException();
            }
            Node<E> tmp = (Node<E>) head;
            int ind = -1;
            while (tmp != null) {
                if (tmp.data.equals(previous.data)) {
                    ind++;
                }
                tmp = tmp.next;
            }
            LinkedList.this.remove(ind);
        }
    }
}



