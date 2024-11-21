package EJ1;

public class StaticQueue {

    private static final int MAX = 10000;

    private final StaticStack[] array; // La cola ahora es una cola de pilas
    private int count;

    public StaticQueue() {
        this.array = new StaticStack[MAX];
        this.count = 0;
    }

    public StaticStack getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("No se puede obtener el primero de una cola vacía");
        }
        return array[0];
    }

    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("No se puede eliminar de una cola vacía");
        }
        for (int i = 0; i < count - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        count--;
    }

    public void addStack(StaticStack stack) {
        if (this.count == MAX) {
            throw new RuntimeException("La cola está llena");
        }
        this.array[this.count] = stack;
        this.count++;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }
}
