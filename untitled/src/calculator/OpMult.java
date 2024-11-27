package calculator;

/**
 * Opérateur qui effectue une multiplication.
 * Cet opérateur multiplie la valeur actuelle par le premier nombre de la pile.
 *
 * Hérite de la classe {@link OpErrorStack}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpMult extends OpErrorStack {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpMult(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de multiplication :
     * - Si la valeur actuelle ne contient pas d'erreur (pas de "#"), la valeur en tête de la pile est multipliée par la valeur actuelle.
     * - Le résultat de la multiplication est ensuite assigné à {@code currentValue}.
     * - Si la pile est vide ou si une erreur est présente dans la valeur actuelle, l'opération n'est pas effectuée.
     */
    @Override
    public void execute() {
        super.execute();
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(state.stack.Pop() * Double.parseDouble(state.currentValue));
        }
    }
}
