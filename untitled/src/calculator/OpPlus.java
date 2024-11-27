package calculator;

/**
 * Opérateur qui effectue une addition.
 * Cet opérateur additionne la valeur actuelle au premier nombre de la pile.
 *
 * Hérite de la classe {@link OpErrorStack}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpPlus extends OpErrorStack {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpPlus(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération d'addition :
     * - Si la valeur actuelle ne contient pas d'erreur (pas de "#"), la valeur en tête de la pile est additionnée à la valeur actuelle.
     * - Le résultat de l'addition est ensuite assigné à {@code currentValue}.
     * - Si la pile est vide ou si une erreur est présente dans la valeur actuelle, l'opération n'est pas effectuée.
     */
    @Override
    public void execute() {
        super.execute();
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(state.stack.Pop() + Double.parseDouble(state.currentValue));
        }
    }
}
