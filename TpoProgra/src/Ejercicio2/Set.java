package Ejercicio2;

import java.util.HashSet;

public class Set<T> {
    private HashSet<T> set;

    public Set() {
        this.set = new HashSet<>();
    }

    public void add(T value) {
        set.add(value);
    }

    public void remove(T value) {
        set.remove(value);
    }

    public boolean contains(T value) {
        return set.contains(value);
    }

    public int size() {
        return set.size();
    }

    public HashSet<T> getElements() {
        return new HashSet<>(set);
    }
}
