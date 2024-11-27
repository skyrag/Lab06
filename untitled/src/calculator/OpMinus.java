package calculator;

/**
 * Opérateur qui effectue une soustraction.
 * Cet opérateur soustrait la valeur actuelle du premier nombre de la pile.
 *
 * Hérite de la classe {@link OpErrorStack}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpMinus extends OpErrorStack {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpMinus(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de soustraction :
     * - Si la valeur actuelle ne contient pas d'erreur, la valeur en tête de la pile est soustraite de la valeur actuelle.
     * - Si l'opération réussit, le résultat de la soustraction est affiché comme nouvelle valeur actuelle.
     * - Si la pile est vide ou si une erreur est présente dans la valeur actuelle, l'opération n'est pas effectuée.
     */
    @Override
    public void execute() {
        super.execute();
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(state.stack.Pop() - Double.parseDouble(state.currentValue));
        }
    }
}
