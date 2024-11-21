package EJ6;

import EJ1.Queue;
import EJ6.Nodes.DoubleNode;

public class DynamicCyclicDoubleQueue implements Queue {
    private DoubleNode first;  // Primer nodo de la cola (frente)
    private DoubleNode last;   // Último nodo de la cola (final)

    // Constructor
    public DynamicCyclicDoubleQueue() {
        this.first = null;
        this.last = null;
    }


    @Override
    public int getFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede obtener el primer elemento de una cola vacía");
        }
        return this.first.getValue();
    }


    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede desacolar una cola vacía");
        }

        if (this.first == this.last) {

            this.first = this.last = null;
        } else {

            this.first = this.first.getNext();
            this.first.setPrev(null);
            this.last.setNext(this.first);
            this.first.setPrev(this.last);
        }
    }


    @Override
    public void add(int value) {
        DoubleNode newNode = new DoubleNode(value,null);

        if (this.isEmpty()) {

            this.first = this.last = newNode;
            newNode.setNext(this.first);
            newNode.setPrev(this.last);
        } else {
            // Agregar al final de la cola
            newNode.setPrev(this.last);
            newNode.setNext(this.first);
            this.last.setNext(newNode);  // El antiguo último nodo ahora apunta al nuevo nodo
            this.first.setPrev(newNode);
            this.last = newNode;
        }
    }


    @Override
    public boolean isEmpty() {
        return this.first == null;
    }


}
