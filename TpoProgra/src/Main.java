import java.util.Stack;

import EJ1.StaticQueueOfStacks;
import EJ4.StaticSet;
import EJ6.DynamicCyclicDoubleQueue;
import EJ6.StaticSetWithDuplicates;
import Ejercicio2.*;
import Ejercicio3.*;
import static Ejercicio2.Ejercicio1.invertirStack;
import static Ejercicio2.Punto2.copiarSet;
import static Ejercicio5.PilaSinRepetidosYOrdenada.pilaOrdenadaSinRepetidos;

public class Main {
    public static void main(String[] args) {



        /* Ejercicio 2
        // Ejemplo con una pila
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);



        System.out.println("Invertir Stack:");
        Stack<Integer> stackInvertido = invertirStack(stack);
        while (!stackInvertido.isEmpty()) {
            System.out.println(stackInvertido.pop());
        }

        // Ejemplo con una cola
        Set<String> conjunto = new Set<>();
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");

        System.out.println("\nCopiar Set:");
        Set<String> copiaConjunto = copiarSet(conjunto);
        for (String elemento : copiaConjunto.getElements()) {
            System.out.println(elemento);
        }
    }*/

        /* Ejercicio 3
        Cola<Integer> cola1 = new Cola<>();
        cola1.enqueue(1);
        cola1.enqueue(2);
        cola1.enqueue(3);

        Cola<Integer> cola2 = new Cola<>();
        cola2.enqueue(4);
        cola2.enqueue(5);
        cola2.enqueue(6);

        Cola<Integer> cola3 = new Cola<>();
        cola3.enqueue(7);
        cola3.enqueue(8);
        cola3.enqueue(9);

        QueueOfQueue<Integer> queueOfQueue1 = new QueueOfQueue<>();
        queueOfQueue1.addQueue(cola1);
        queueOfQueue1.addQueue(cola2);
        queueOfQueue1.addQueue(cola3);

        System.out.println("QueueOfQueue before reverseWithDepth:");
        queueOfQueue1.printQueueOfQueue();

        Cola<Integer> flatQueue = queueOfQueue1.flat();
        System.out.println("Flat Queue: " + flatQueue.getElements());

        queueOfQueue1.reverseWithDepth();
        System.out.println("QueueOfQueue after reverseWithDepth:");
        queueOfQueue1.printQueueOfQueue();

        QueueOfQueue<Integer> queueOfQueue2 = new QueueOfQueue<>();
        queueOfQueue2.addQueue(cola3);
        queueOfQueue2.addQueue(cola2);

        QueueOfQueue<Integer> concatenated = QueueOfQueue.concatenate(queueOfQueue1, queueOfQueue2);
        System.out.println("Concatenated QueueOfQueue:");
        concatenated.printQueueOfQueue();
    }*/


        //Ejercicio 5
        Stack<Integer> pilaOriginal = new Stack<>();


        pilaOriginal.push(3);
        pilaOriginal.push(1);
        pilaOriginal.push(4);
        pilaOriginal.push(1);
        pilaOriginal.push(5);
        pilaOriginal.push(9);
        pilaOriginal.push(2);
        pilaOriginal.push(6);
        pilaOriginal.push(5);

        System.out.println("Pila original: " + pilaOriginal);


        Stack<Integer> pilaSinRepetidosYOrdenada = pilaOrdenadaSinRepetidos(pilaOriginal);

        System.out.println("Pila ordenada y sin repetidos: " + pilaSinRepetidosYOrdenada);
    }

            /*
//        StaticQueueOfStacks matriz = new StaticQueueOfStacks(3);
//        StaticQueueOfStacks matriz2 = new StaticQueueOfStacks(3);
//        matriz.addElement(3);
//        matriz2.addElement(3);
//
//        matriz.addElement(4);
//        matriz2.addElement(4);
//
//        matriz.addElement(5);
//        matriz2.addElement(7);
//
//
//        System.out.println("La traza es " + (matriz.calcularTraza(matriz)));
//        matriz.calcularTraspuesta(matriz);
//        StaticQueueOfStacks resultado = StaticQueueOfStacks.sumaMatrices(matriz,matriz2);
//
//        resultado.printMatrix();
//
//
//
//        StaticSet set = new StaticSet.Builder()
//                .add(1)
//                .add(2)
//                .add(3)
//                .build();
//
//
//        StaticSet set2 = new StaticSet.Builder()
//                .add(0)
//                .addAll(set)
//                .add(4)
//                .build();

//        DynamicCyclicDoubleQueue queue = new DynamicCyclicDoubleQueue();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//
//        System.out.println("el primer eklemento es: " + queue.getFirst());
//
//        queue.remove();
//        System.out.println("el primer eklemento deps de remover: " + queue.getFirst());
//        queue.add(4);
//        queue.add(5);
//
//        System.out.println("El primer elemento después de agregar más elementos: " + queue.getFirst());



        StaticSetWithDuplicates set = new StaticSetWithDuplicates();
        set.add(1);
        set.add(2);
        set.add(1);

        set.add(1);

        System.out.println("valor elegido al azar: " +set.choose());
        set.remove(1);
        System.out.println("valor elegido al azar desp de eliminar: " +set.choose());

        System.out.println("Esta vacio el set? " + set.isEmpty());
    }

*/
}
