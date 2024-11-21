package EJ1;

public class StaticStack {

    private static final int MAX = 10000;

    private final int[] array;
    private int count;

    public StaticStack() {
        this.array = new int[MAX];
        this.count = 0;
    }

    public void add(int value) {
        if (this.count == MAX) {
            throw new RuntimeException("La pila está llena");
        }
        this.array[this.count] = value;
        this.count++;
    }

    public int get(int index) {
        if (index >= this.count || index < 0) {
            throw new RuntimeException("Índice fuera de rango en la pila");
        }
        return array[index];
    }

    public int size() {
        return this.count;
    }

    public boolean isFull() {
        return this.count == MAX;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void printStack() {
        for (int i = 0; i < this.count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
