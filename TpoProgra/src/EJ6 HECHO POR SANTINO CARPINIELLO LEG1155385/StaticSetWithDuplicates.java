package EJ6;
import java.util.Random;

public class StaticSetWithDuplicates implements Set {

    private static final int MAX = 10000;


    private final Element[] array;
    private int count;
    private final Random random;


    private static class Element {
        int value;
        int count;

        public Element(int value) {
            this.value = value;
            this.count = 1;
        }
    }

    public StaticSetWithDuplicates() {
        this.array = new Element[MAX];
        this.count = 0;
        this.random = new Random();
    }


    @Override
    public void add(int value) {

        for (int i = 0; i < this.count; i++) {
            if (this.array[i].value == value) {

                this.array[i].count++;
                return;
            }
        }

        this.array[this.count] = new Element(value);
        this.count++;
    }


    @Override
    public int choose() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede elegir un elemento de un conjunto vacío");
        }


        int totalWeight = 0;
        for (int i = 0; i < this.count; i++) {
            totalWeight += this.array[i].count;
        }

        int randomIndex = random.nextInt(totalWeight);
        int sum = 0;
        for (int i = 0; i < this.count; i++) {
            sum += this.array[i].count;
            if (sum > randomIndex) {
                return this.array[i].value;
            }
        }


        return this.array[this.count - 1].value;
    }


    @Override
    public void remove(int value) {
        for (int i = 0; i < this.count; i++) {
            if (this.array[i].value == value) {
                if (this.array[i].count > 1) {

                    this.array[i].count--;
                } else {

                    this.array[i] = this.array[this.count - 1];
                    this.count--;
                }
                return;
            }
        }
    }


    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }
}
