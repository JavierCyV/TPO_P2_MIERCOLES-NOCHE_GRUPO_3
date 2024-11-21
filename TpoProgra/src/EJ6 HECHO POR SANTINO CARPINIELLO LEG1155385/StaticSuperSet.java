package EJ6;

import EJ4.Set;
import EJ4.StaticSet;

public class StaticSuperSet extends StaticSet {

    public StaticSuperSet() {
        super();
    }

    public boolean isSubset(Set otherSet) {
        // Verificamos si todos los elementos de this (el superconjunto) están en otherSet
        for (int i = 0; i < this.getCount(); i++) {
            boolean found = false;
            for (int j = 0; j < otherSet.getCount(); j++) {
                if (this.array[i] == otherSet.getElement(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false; // Si algún elemento no está presente, no es subconjunto
            }
        }
        return true;
    }


    public StaticSet complement(Set subset) {
        if (!isSubset(subset)) {
            throw new IllegalArgumentException("El conjunto dado no es subconjunto del superconjunto");
        }

        StaticSet complement = new StaticSet();
        // Agregar elementos de this (superconjunto) que no están en subset
        for (int i = 0; i < this.getCount(); i++) {
            boolean found = false;
            for (int j = 0; j < subset.getCount(); j++) {
                if (this.array[i] == subset.getElement(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                complement.add(this.array[i]);
            }
        }
        return complement;
    }

    // Métodos adicionales para manejar elementos en el conjunto

    public int getCount() {
        return this.getCount();
    }

    public int getElement(int index) {
        if (index >= this.getCount() || index < 0) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return this.array[index];
    }

}
