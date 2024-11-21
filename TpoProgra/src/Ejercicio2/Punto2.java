package Ejercicio2;

public class Punto2 {
    public static <T> Set<T> copiarSet(Set<T> original) {
        Set<T> copia = new Set<>();
        for (T elemento : original.getElements()) {
            copia.add(elemento);
        }
        return copia;
    }

}
