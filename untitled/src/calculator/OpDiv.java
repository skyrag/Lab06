package calculator;

/**
 * Opérateur qui effectue une division.
 * Cet opérateur divise le premier nombre de la pile par la valeur actuelle.
 * Si une division par zéro est tentée, une erreur est affichée.
 *
 * Hérite de la classe {@link OpErrorStack}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpDiv extends OpErrorStack {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpDiv(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de division :
     * - Divise le premier nombre de la pile par la valeur actuelle.
     * - Si la division par zéro est tentée (avec les deux opérandes égaux à zéro), un message d'erreur est affiché.
     * - Si l'opération se passe normalement, le résultat de la division est affiché.
     */
    @Override
    public void execute() {
        super.execute();
        double temp = state.stack.Pop();
        if (Double.parseDouble(state.currentValue) == 0.0 && temp == 0.0) {
            state.currentValue = "# error #";
        }
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(temp / Double.parseDouble(state.currentValue));
        }
    }
}
