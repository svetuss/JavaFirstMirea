package ru.mirea.task13.myList;

public class ListThree {
    private int arrsize = 10;
    private int count = 0;

    ListThree(int size) {
        this.arrsize = size;
    }

    private Object[] arr = new Object[arrsize];

    public void add(int index, Object obj) {
        if (index > arr.length) {
            System.out.println("Wrong index");
            System.exit(0);
        }
        Object[] temp = new Object[arr.length + 1];
        if (index >= 0) {
            System.arraycopy(arr, 0, temp, 0, index);
        }
        temp[index] = obj;
        if (arr.length - index >= 0) {
            System.arraycopy(arr, index, temp, index + 1, arr.length - index);
        }
        arr = temp;
        count++;
    }

    public void add(Object obj) {
        if (count == arr.length - 1) {
            resize(arr.length * 2);
        }
        arr[count++] = obj;
    }

    public void remove(int index) {
        if (count - index >= 0) {
            System.arraycopy(arr, index + 1, arr, index, count - index);
        }
        arr[count] = null;
        count--;
    }

    public boolean contains(Object obj) {
        for (int i=0; i<count; ++i) {
            if (arr[i] != obj) {
                continue;
            }
            return true;
        }
        return false;
    }

    public void resize(int size) {
        Object[] newArr = new Object[size];
        System.arraycopy(arr, 0, newArr, 0, count);
        arr = newArr;
    }

    public void set(int index, Object obj) {
        if (index > count) {
            System.out.print("Index out of bound");
            System.exit(0);
        }
        arr[index] = obj;
    }

    public Object get(int index) {
        return arr[index];
    }

    public int size() {
        return count;
    }
}
