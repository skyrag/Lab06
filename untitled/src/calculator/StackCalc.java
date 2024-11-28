package calculator;

/**
 * Implémentation d'une pile générique utilisée pour la gestion des éléments dans la calculatrice.
 * Cette pile permet d'ajouter, supprimer des éléments et d'effectuer diverses opérations de manipulation sur la pile.
 *
 * @param <T> le type des éléments stockés dans la pile
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class StackCalc<T> {
    private Element<T> head;

    public StackCalc() {
        head = null;
    }

    /**
     * Supprime et retourne le premier élément de la pile.
     *
     * @return l'élément supprimé de la pile
     */
    public T Pop() {
        Element<T> temp = head;
        head = head.getNext();
        return temp.getValue();
    }

    /**
     * Ajoute un élément au sommet de la pile.
     *
     * @param data l'élément à ajouter à la pile
     */
    public void Push(T data) {
        Element<T> newhead = new Element<>(data);
        newhead.setNext(head);
        head = newhead;
    }

    /**
     * Crée un itérateur pour parcourir la pile.
     *
     * @return un nouvel itérateur pour la pile
     */
    private Iterator<T> iterator() {
        return new Iterator<>(head);
    }

    /**
     * Retourne la taille actuelle de la pile.
     *
     * @return le nombre d'éléments dans la pile
     */
    public int size() {
        Iterator<T> iter = iterator();
        int count = 0;
        while (iter.hasNext()) {
            count++;
            iter.next();
        }
        return count;
    }

    /**
     * Convertit la pile en un tableau de chaînes de caractères.
     *
     * @return un tableau contenant les éléments de la pile sous forme de chaînes
     */
    public String[] toArray() {
        Iterator<T> it = iterator();
        String[] array = new String[size()];
        int count = 0;
        while (it.hasNext()) {
            array[count] = it.current().toString();
            count++;
            it.next();
        }
        return array;
    }

    /**
     * Effectue une opération de réinitialisation sur la pile en fonction du paramètre {@code isC}.
     * Si {@code isC} est vrai, toute la pile est effacée. Sinon, l'élément NaN (le cas échéant) est supprimé.
     *
     * @param isC indique si la pile doit être complètement réinitialisée (true) ou si seule la gestion des erreurs doit être effectuée (false)
     */
    public void COrCe(boolean isC) {
        Iterator<T> it = iterator();
        Element<T> last = head;
        while (it.hasNext()) {
            if (isC) {
                Pop();
            } else {
                if (last.getNext().getValue().equals(Double.NaN)) {
                    last.setNext(last.getNext().getNext());
                } else {
                    last = last.getNext();
                }
            }
            it.next();
        }
    }
}
