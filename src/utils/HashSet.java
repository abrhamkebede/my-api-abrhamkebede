package utils;

public class HashSet<E> implements Set<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] items;

    public HashSet() {
        items = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private int hash(E item) {
        return Math.abs(item.hashCode()) % items.length;
    }

    @Override
    public void add(E item) {
        if (contains(item)) {
            return;
        }
        int index = hash(item);
        if (items[index] == null) {
            items[index] = item;
            size++;
        } else {
            int i = index;
            while (items[i] != null) {
                i = (i + 1) % items.length;
            }
            items[i] = item;
            size++;
        }
    }

    @Override
    public boolean contains(E item) {
        int index = hash(item);
        if (items[index] == null) {
            return false;
        } else {
            int i = index;
            while (items[i] != null) {
                if (items[i].equals(item)) {
                    return true;
                }
                i = (i + 1) % items.length;
            }
            return false;
        }
    }

    @Override
    public void clear() {
        items = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void remove(E item) {
        if (!contains(item)) {
            return;
        }
        int index = hash(item);
        if (items[index].equals(item)) {
            items[index] = null;
            size--;
        } else {
            int i = index;
            while (!items[i].equals(item)) {
                i = (i + 1) % items.length;
            }
            items[i] = null;
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                sb.append(items[i]);
                if (i != items.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}



