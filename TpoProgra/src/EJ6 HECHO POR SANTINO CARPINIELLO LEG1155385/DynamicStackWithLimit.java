package EJ6;

public class DynamicStackWithLimit {

    private Node top;
    private int size;
    private final int limit;

    // Constructor
    public DynamicStackWithLimit(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        this.limit = limit;
        this.top = null;
        this.size = 0;
    }


    public void add(int value) {
        if (size == limit) {
            throw new RuntimeException("La pila ha alcanzado su capacidad máxima");
        }
        Node newNode = new Node(value, top);
        top = newNode;
        size++;
    }


    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("No se puede eliminar de una pila vacía");
        }
        top = top.next;
        size--;
    }


    public int getTop() {
        if (isEmpty()) {
            throw new RuntimeException("No se puede obtener el tope de una pila vacía");
        }
        return top.value;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int getSize() {
        return size;
    }


    public int getLimit() {
        return limit;
    }


    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
