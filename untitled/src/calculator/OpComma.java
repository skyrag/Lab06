package calculator;

/**
 * Opérateur qui ajoute un point décimal (virgule) à la valeur actuelle.
 * Cet opérateur permet de convertir une valeur entière en nombre décimal en ajoutant un point (".").
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpComma extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpComma(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération d'ajout d'un point décimal :
     * - Si la valeur actuelle n'a pas déjà un point ou si le mode d'édition est actif,
     *   un point est ajouté à la fin de la valeur.
     * - Si aucune valeur n'est définie, l'opération n'a aucun effet.
     */
    @Override
    public void execute() {
        if (state.currentValue != null && !Double.isInfinite(Double.parseDouble(state.currentValue))) {
            if (!state.currentValue.contains(".") || state.modeEdition) {
                state.currentValue = state.currentValue.concat(".");
            }
        }
    }
}
