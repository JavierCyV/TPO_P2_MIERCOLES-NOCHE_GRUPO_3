package EJ4;

import java.util.Random;

public class StaticSet implements Set {

    private static final int MAX = 10000;
    protected final int[] array;
    private int count;
    private final Random random;

    public StaticSet() {
        this.array = new int[MAX];
        this.count = 0;
        this.random = new Random();
    }

    @Override
    public void add(int a) {
        for (int i = 0; i < this.count; i++) {
            if (this.array[i] == a) {
                return;
            }
        }
        this.array[this.count] = a;
        this.count++;
    }

    @Override
    public void addAll(Set otherSet) {
        for (int i = 0; i < otherSet.getCount(); i++) {
            this.add(otherSet.getElement(i));
        }
    }

    @Override
    public int choose() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede elegir un elemento de un conjunto vacío");
        }
        int i = random.nextInt(count);
        return this.array[i];
    }

    @Override
    public void remove(int a) {
        for (int i = 0; i < this.count; i++) {
            if (this.array[i] == a) {
                this.array[i] = this.array[this.count - 1];
                this.count--;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int getCount() {
        return count;
    }



    @Override
    public int getElement(int index) {
        return this.array[index];
    }
    public static class Builder {
        private final int[] array = new int[10000];
        private int count = 0;

        public Builder add(int value) {
            if (count < array.length) {
                array[count++] = value;
            }
            return this;
        }

        public Builder addAll(StaticSet otherSet) {
            for (int i = 0; i < otherSet.count; i++) {
                this.add(otherSet.array[i]);
            }
            return this;
        }

        public StaticSet build() {
            return new StaticSet(); // Al final se construye el objeto
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }





}

    // Builder pattern para StaticSet



