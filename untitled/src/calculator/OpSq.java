package calculator;

/**
 * Opérateur qui calcule le carré de la valeur actuelle.
 * Cet opérateur applique la fonction puissance (au carré) à la valeur actuelle.
 *
 * Hérite de la classe {@link OpNotEditor}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpSq extends OpNotEditor {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpSq(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de calcul du carré :
     * - Si la valeur actuelle est valide (sans erreur), le carré de la valeur est calculé et le résultat est assigné à {@code currentValue}.
     * - Si une erreur est présente dans {@code currentValue}, l'opération n'est pas effectuée.
     */
    @Override
    public void execute() {
        super.execute();
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(Math.pow(Double.parseDouble(state.currentValue), 2));
        }
    }
}
