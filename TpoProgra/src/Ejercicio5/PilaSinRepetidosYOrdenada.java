package Ejercicio5;

import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class PilaSinRepetidosYOrdenada {

    public static Stack<Integer> pilaOrdenadaSinRepetidos(Stack<Integer> pilaOriginal) {
        Set<Integer> conjunto = new HashSet<>();  // Para eliminar duplicados
        // Extraemos los elementos de la pila y los agregamos al conjunto
        while (!pilaOriginal.isEmpty()) {
            conjunto.add(pilaOriginal.pop());
        }

        // Convertimos el conjunto a una lista para ordenarlos
        ArrayList<Integer> lista = new ArrayList<>(conjunto);
        Collections.sort(lista);  // Ordenamos la lista

        // Creamos la nueva pila con los elementos ordenados
        Stack<Integer> pilaOrdenada = new Stack<>();
        for (Integer elemento : lista) {
            pilaOrdenada.push(elemento);
        }

        return pilaOrdenada;  // Retornamos la nueva pila ordenada y sin repetidos
    }
}