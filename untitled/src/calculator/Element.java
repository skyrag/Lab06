package calculator;

/**
 * Représente un élément générique dans une structure de données chaînée (comme une pile ou une liste).
 * Chaque élément contient une valeur et une référence vers l'élément suivant dans la chaîne.
 *
 * @param <T> le type de la valeur stockée dans l'élément
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class Element<T> {
    /**
     * Référence vers l'élément suivant dans la chaîne.
     */
    private Element<T> next;

    /**
     * La valeur stockée dans cet élément.
     */
    private T value;

    /**
     * Constructeur qui initialise un élément avec une valeur donnée.
     *
     * @param value la valeur à stocker dans l'élément
     */
    public Element(T value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Retourne la valeur stockée dans cet élément.
     *
     * @return la valeur de l'élément
     */
    public T getValue() {
        return value;
    }

    /**
     * Retourne l'élément suivant dans la chaîne.
     *
     * @return l'élément suivant, ou {@code null} s'il n'y en a pas
     */
    public Element<T> getNext() {
        return next;
    }

    /**
     * Définit l'élément suivant dans la chaîne.
     *
     * @param next l'élément suivant à lier
     */
    public void setNext(Element<T> next) {
        this.next = next;
    }

    /**
     * Retourne une représentation textuelle de la valeur stockée dans cet élément.
     *
     * @return une chaîne représentant la valeur de l'élément
     */
    @Override
    public String toString() {
        return value.toString();
    }
}
