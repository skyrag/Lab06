package calculator;

/**
 * Représente un itérateur générique pour parcourir une structure de données chaînée.
 * L'itérateur permet de naviguer élément par élément à partir d'un point de départ donné.
 *
 * @param <T> le type des éléments dans la structure de données
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class Iterator<T> {
    /**
     * L'élément courant dans la structure de données.
     */
    private Element<T> element;

    /**
     * Initialise un itérateur à partir de l'élément de tête fourni.
     *
     * @param head l'élément de départ pour l'itération
     */
    public Iterator(Element<T> head) {
        element = head;
    }

    /**
     * Retourne la valeur de l'élément courant sans avancer l'itérateur.
     *
     * @return la valeur de l'élément courant
     */
    public T current() {
        return element.getValue();
    }

    /**
     * Vérifie si l'itérateur peut encore avancer vers un autre élément.
     *
     * @return {@code true} si un élément suivant existe, {@code false} sinon
     */
    public boolean hasNext() {
        return element != null;
    }

    /**
     * Avance l'itérateur vers l'élément suivant dans la chaîne et retourne la valeur de l'élément courant.
     *
     * @return la valeur de l'élément courant après l'avance
     * @throws RuntimeException si aucun élément suivant n'est disponible
     */
    public T next() {
        if (element == null) {
            throw new RuntimeException("No more elements in the stack");
        }
        T value = element.getValue();
        element = element.getNext();
        return value;
    }
}
