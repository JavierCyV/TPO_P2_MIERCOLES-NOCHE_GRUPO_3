package EJ6;

public class DoubleNode {

    private int value;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode(int value, DoubleNode next) {
        this.value = value;
        this.next = next;
        this.prev = null;
    }

    public int getValue() { // C
        return value; // C
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getNext() { // C
        return next; // C
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}
