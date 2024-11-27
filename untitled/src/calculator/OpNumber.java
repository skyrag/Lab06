package calculator;

/**
 * Opérateur qui ajoute un nombre à la valeur actuelle.
 * Cet opérateur permet d'ajouter un chiffre ou un nombre à la valeur en cours de saisie dans la calculatrice.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpNumber extends Operator {
    private int number;

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice et le nombre à ajouter.
     *
     * @param state l'état actuel de la calculatrice
     * @param number le nombre à ajouter à la valeur actuelle
     */
    public OpNumber(State state, int number) {
        this.state = state;
        this.number = number;
    }

    /**
     * Exécute l'opération d'ajout d'un nombre :
     * - Si le mode d'édition est activé, le nombre est ajouté à la valeur actuelle.
     * - Si une valeur est déjà présente dans {@code currentValue}, le nombre est concaténé à la valeur existante.
     * - Si {@code currentValue} est null (aucune valeur en cours de saisie), le nombre devient la nouvelle valeur.
     */
    @Override
    public void execute() {
        if (state.modeEdition) {
            if (state.currentValue != null && !state.currentValue.isEmpty()) {
                state.currentValue = state.currentValue + number;
            } else {
                state.currentValue = Integer.toString(number);
            }
        } else {
            state.stack.Push(Double.valueOf(state.currentValue));
            state.currentValue = Integer.toString(number);
            state.modeEdition = true;
        }
    }
}
