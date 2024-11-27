package calculator;

/**
 * Opérateur qui change le signe de la valeur actuelle.
 * Cet opérateur permet de transformer une valeur positive en négative, ou inversement.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpChange extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpChange(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de changement de signe :
     * - Si la valeur actuelle est positive, elle devient négative (un signe `-` est préfixé).
     * - Si la valeur actuelle est négative, le signe `-` est supprimé pour la rendre positive.
     * - Si aucune valeur n'est définie, l'opération n'a aucun effet.
     */
    @Override
    public void execute() {
        if (state.currentValue != null) {
            if (state.currentValue.contains("-")) {
                state.currentValue = state.currentValue.replace("-", "");
            } else {
                state.currentValue = "-" + state.currentValue;
            }
        }
    }
}
