package utils;

import java.util.NoSuchElementException;

/*****************************************************************
 * This class ArrayList implements a contiguous block of data
 * using an array.
 *****************************************************************/

public class ArrayList<E> implements List<E>{

    private int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int numberOfElements;

    public ArrayList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        numberOfElements = 0;
    }

    public ArrayList(int size) {
        this.DEFAULT_CAPACITY = size;
        data = (E[]) new Object[DEFAULT_CAPACITY];
        numberOfElements = 0;
    }

    @Override
    public boolean add(E item) {
        if (numberOfElements == data.length) {
            System.out.println(data.length + " " + numberOfElements);
            E[] tmp = (E[]) new Object[data.length * 2];
            int i = 0;
            for (i = 0; i < data.length; i++) {
                tmp[i] = data[i];
            }
            data = tmp;
            data[i] = item;
            numberOfElements++;
            this.DEFAULT_CAPACITY = data.length;
            return true;

        }
        data[numberOfElements] = item;
        numberOfElements++;
        return true;
    }

    @Override
    public void add(int index, E item) {
        for (int i = numberOfElements; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = item;
        this.numberOfElements++;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= numberOfElements) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numberOfElements);
        }
    }

    public void clear() {
        for (int i = 0; i < this.numberOfElements; i++) {
            data[i] = null;
        }
        numberOfElements = 0;
    }

    @Override
    public boolean contains(E item) {
        for (int i = 0; i < numberOfElements; i++) {
            if (data[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int targetCapacity) {
        if (targetCapacity > DEFAULT_CAPACITY) {
            while (DEFAULT_CAPACITY < targetCapacity) {
                DEFAULT_CAPACITY *= 2;
            }
            E[] newData = (E[]) new Object[DEFAULT_CAPACITY];
            for (int i = 0; i < numberOfElements; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public int indexOf(E item) {
        for (int i = 0; i < numberOfElements; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E res = data[index];
        for (int i = index; i < numberOfElements; i++) {
            data[i] = data[i + 1];
        }
        data[numberOfElements - 1] = null;
        numberOfElements--;
        return res;
    }

    @Override
    public boolean remove(E item) {
        int index = indexOf(item);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    public E set(int index, E item) {
        checkIndex(index);
        E res = data[index];
        data[index] = item;
        return res;
    }

    public void shiftLeft(int index) {
        for (int i = index; i < numberOfElements; i++) {
            data[i] = data[i + 1];
        }
        data[numberOfElements - 1] = null;
        numberOfElements--;
    }

    public void shiftRight(int index) {
        for (int i = numberOfElements; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = null;
        numberOfElements--;
    }
    @Override
    public int size() {
        return numberOfElements;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < numberOfElements; i++) {
            sb.append(data[i]);
            if (i != numberOfElements - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();

    }

    public Iterator<E> iterator() {
        return new ArrayListIterator<>();
    }

    private class ArrayListIterator<E> implements Iterator<E> {
        private int currentIndex;
        private int lastReturnedIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
            this.lastReturnedIndex = -1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < numberOfElements;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturnedIndex = currentIndex;
            currentIndex++;
            return (E) data[lastReturnedIndex];
        }

        @Override
        public void remove() {
            //remove the item returned by the last call to next().
            //Uses remove method from its enclosing class to do the operation. If remove() has been called without a
            //call on next(), throws an IllegalStateException
            if (lastReturnedIndex == -1) {
                throw new IllegalStateException();
            }
            currentIndex--;
            ArrayList.this.remove(lastReturnedIndex);
        }
    }
}








