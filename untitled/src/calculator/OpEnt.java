package calculator;

/**
 * Opérateur qui place la valeur actuelle dans la pile.
 * Cet opérateur prend la valeur actuelle, la convertit en un nombre (double),
 * et la place dans la pile de la calculatrice.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpEnt extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpEnt(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération d'enregistrement de la valeur actuelle dans la pile :
     * - Si la valeur actuelle est non nulle, elle est convertie en double et ajoutée à la pile.
     * - Après avoir ajouté la valeur à la pile, la valeur actuelle est réinitialisée à {@code null}
     *   et le mode d'édition est activé pour permettre une nouvelle saisie.
     * - Si aucune valeur n'est définie, l'opération n'a aucun effet.
     */
    @Override
    public void execute() {
        if (state.currentValue != null) {
            state.stack.Push(Double.parseDouble(state.currentValue));
            state.currentValue = null;
            state.modeEdition = true;
        }
    }
}
