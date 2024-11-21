package Ejercicio2;

public class Ejercicio1 {
    public static <T> Stack<T> invertirStack(Stack<T> stack) {
        Stack<T> aux = new Stack<>();
        while (!stack.isEmpty()) {
            aux.push(stack.pop());
        }
        return aux;
    }

}
