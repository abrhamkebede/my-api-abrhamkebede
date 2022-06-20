package utils;

public class HashMap<K,V> implements Map<K,V> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private MapNode<K, V>[] items;

    public HashMap() {
        this.size = 0;
        this.items = new MapNode[DEFAULT_CAPACITY];
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % items.length;
    }

    @Override
    public void clear() {
        this.size = 0;
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

    @Override
    public boolean containsKey(K key) {
        int index = hash(key);
        if (items[index] == null) {
            return false;
        } else {
            int i = index;
            while (items[i] != null) {
                if (items[i].getKey().equals(key)) {
                    return true;
                }
                i = (i + 1) % items.length;
            }
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public V put(K key, V value) {
        int index = hash(key);
        if (items[index] == null) {
            items[index] = new MapNode<K, V>(key, value);
            size++;
            return null;
        } else {
            int i = index;
            while (items[i] != null) {
                if (items[i].getKey().equals(key)) {
                    V oldValue = items[i].getValue();
                    items[i].setValue(value);
                    return oldValue;
                }
                i = (i + 1) % items.length;
            }
            items[i] = new MapNode<K, V>(key, value);
            size++;
            return null;
        }
    }

    @Override
    public V remove(K key) {
        int index = hash(key);
        if (items[index] == null) {
            return null;
        } else {
            int i = index;
            while (items[i] != null) {
                if (items[i].getKey().equals(key)) {
                    V oldValue = items[i].getValue();
                    items[i] = null;
                    size--;
                    return oldValue;
                }
                i = (i + 1) % items.length;
            }
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                sb.append(items[i].toString());
                if (i != items.length - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }
}



