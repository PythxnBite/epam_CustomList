package com.epam.custom_list;

/**
 * CustomList
 */
import java.util.*;

public class CustomList<T> {
    private int size = 0;
    private int capacity = 10;
    private Object list[];

    public CustomList() {
        list = new Object[capacity];
    }

    private void listDoubling() {
        capacity *= 2;
        list = Arrays.copyOf(list, capacity);

    }

    public void add(T element) {
        if (size == capacity)
            listDoubling();
        list[size++] = element;

    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("List Index out of Range");
        if (index == size - 1)
            list[index] = null;
        else {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            list[size - 1] = null;
        }
        size--;
    }

    @SuppressWarnings("unchecked")
    public T fetch(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("List Index Out of Range");
        return (T) list[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object[] getList() {
        return list;
    }

    public void setList(Object[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += list[i].toString();
            if (i != size - 1)
                res += "->";
        }
        return res;
    }
}
