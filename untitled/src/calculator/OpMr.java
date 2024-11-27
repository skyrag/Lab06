package calculator;

/**
 * Opérateur qui rappelle la valeur stockée dans la mémoire.
 * Cet opérateur permet de récupérer la valeur mémorisée et de la placer dans la valeur actuelle.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpMr extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpMr(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de rappel de la mémoire :
     * - Si la valeur actuelle ne contient pas d'erreur (pas de "#"), la valeur mémorisée est récupérée et assignée à {@code currentValue}.
     * - Le mode d'édition est activé après le rappel de la mémoire pour permettre une nouvelle saisie ou modification de la valeur.
     * - Si la valeur actuelle contient une erreur, l'opération de rappel de mémoire n'est pas effectuée.
     */
    @Override
    public void execute() {
        if (!state.currentValue.contains("#")) {
            state.currentValue = state.memory;
            state.modeEdition = true;
        }
    }
}
