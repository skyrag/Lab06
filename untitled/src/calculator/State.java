package calculator;

/**
 * Classe représentant l'état de la calculatrice.
 * Elle gère la pile d'éléments, la valeur en cours d'édition, la mémoire et le mode d'édition de la calculatrice.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class State {
    public StackCalc <Double> stack;
    public String currentValue;
    public String memory;
    public boolean modeEdition;

    /**
     * Constructeur initialisant l'état de la calculatrice.
     * Il crée une nouvelle pile vide, réinitialise la valeur actuelle et la mémoire,
     * et définit le mode d'édition à true (mode édition activé).
     */
    public State() {
        this.stack = new StackCalc<>();
        this.currentValue = null;
        this.memory = null;
        this.modeEdition = true;
    }
}
