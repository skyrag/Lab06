package calculator;

/**
 * Opérateur qui supprime le dernier caractère de la valeur en cours d'introduction.
 * Cet opérateur simule la fonction de "backspace" d'une calculatrice, permettant de corriger une saisie utilisateur.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpBackspace extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpBackspace(State state) {
        this.state = state;
    }

    /**
     * Supprime le dernier caractère de la valeur courante si celle-ci est en cours d'introduction
     * et ne contient pas le caractère spécial `#`.
     * Si la valeur courante est nulle ou vide, l'opération n'a aucun effet.
     */
    @Override
    public void execute() {
        if (state.currentValue != null && !state.currentValue.contains("#")) {
            state.currentValue = state.currentValue.substring(0, state.currentValue.length() - 1);
        }
    }
}
