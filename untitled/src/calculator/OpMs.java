package calculator;

/**
 * Opérateur qui stocke la valeur actuelle dans la mémoire.
 * Cet opérateur permet de mémoriser la valeur actuelle afin de la récupérer ultérieurement.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpMs extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpMs(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de stockage dans la mémoire :
     * - Si la valeur actuelle ne contient pas d'erreur (pas de "#"), la valeur actuelle est mémorisée dans {@code memory}.
     * - Si la valeur actuelle contient une erreur, l'opération de stockage n'est pas effectuée.
     */
    @Override
    public void execute() {
        if (!state.currentValue.contains("#")) {
            state.memory = state.currentValue;
        }
    }
}
