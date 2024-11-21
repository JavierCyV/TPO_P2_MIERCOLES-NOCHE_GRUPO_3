package EJ1;



public class StaticQueueOfStacks {
    private final StaticQueue queue;
    private final int maxStacks;
    private final int maxStackSize;

    public StaticQueueOfStacks(int n) {
        this.maxStacks = n;
        this.maxStackSize = n;
        this.queue = new StaticQueue();


        for (int i = 0; i < maxStacks; i++) {
            this.queue.addStack(new StaticStack());
        }
    }

    public void addElement(int element) {
        for (int i = 0; i < maxStacks; i++) {
            StaticStack stack = (StaticStack) queue.getFirst();
            if (!stack.isFull()) {
                stack.add(element);
                return;
            }
            queue.remove();
            queue.addStack(stack);
        }
        throw new RuntimeException("Todas las pilas están llenas. No se pueden añadir más elementos.");
    }

    public void printMatrix() {

        for (int i = 0; i < maxStacks; i++) {
            StaticStack stack = (StaticStack) queue.getFirst();
            System.out.print("Pila " + (i + 1) + ": ");
            stack.printStack();
            queue.remove();
            queue.addStack(stack);
        }
    }

    public int calcularTraza() { //O(N)
        int traza = 0;

        for (int i = 0; i < maxStacks; i++) {
            StaticStack stack = (StaticStack) queue.getFirst();
            if (stack.size() > i) {
                traza += stack.get(i);
            }
            queue.remove();
            queue.addStack(stack);
        }
        return traza;
    }

    public static void calcularTraspuesta(StaticQueueOfStacks queueOfStacks) { // O(N)

        for (int j = 0; j < queueOfStacks.maxStackSize; j++) {
            for (int i = 0; i < queueOfStacks.maxStacks; i++) {
                StaticStack stack = (StaticStack) queueOfStacks.queue.getFirst();
                System.out.print(stack.get(j) + " ");
                queueOfStacks.queue.remove();
                queueOfStacks.queue.addStack(stack);
            }
            System.out.println();
        }
    }

    public static StaticQueueOfStacks sumaMatrices(StaticQueueOfStacks queue1, StaticQueueOfStacks queue2) {

        if (queue1.maxStacks != queue2.maxStacks || queue1.maxStackSize != queue2.maxStackSize) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño para poder sumarlas.");
        }

        StaticQueueOfStacks resultado = new StaticQueueOfStacks(queue1.maxStacks);

        for (int i = 0; i < queue1.maxStacks; i++) {
            StaticStack stack1 = (StaticStack) queue1.queue.getFirst();
            StaticStack stack2 = (StaticStack) queue2.queue.getFirst();
            StaticStack stackResultado = new StaticStack();

            for (int j = 0; j < queue1.maxStackSize; j++) {
                int suma = stack1.get(j) + stack2.get(j);
                stackResultado.add(suma);
            }

            resultado.queue.addStack(stackResultado);

            queue1.queue.remove();
            queue2.queue.remove();

            queue1.queue.addStack(stack1);
            queue2.queue.addStack(stack2);
        }

        return resultado;
    }

}
