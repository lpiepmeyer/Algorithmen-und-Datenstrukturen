package de.hfu.ad.chapter06;

public class NumberContainer {
    private int[] numbers;
    private int size = 0;

    public NumberContainer(int capacity) {
        numbers = new int[capacity];
    }

    public int size() {
        return size;
    }

    public boolean add(int number) {
        if (size >= numbers.length) {
            return false;
        }
        numbers[size] = number;
        size++;
        return true;
    }

    private int index(int number) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int number) {
        int i = index(number);
        if (i < 0) return false;
        numbers[i] = numbers[size - 1];
        size--;
        return true;
    }

    public boolean contains(int number) {
        return index(number) >= 0;
    }
}
