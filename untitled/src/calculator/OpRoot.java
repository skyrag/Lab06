package calculator;

/**
 * Opérateur qui calcule la racine carrée de la valeur actuelle.
 * Cet opérateur applique la fonction racine carrée à la valeur actuelle, à condition que celle-ci soit positive.
 * Si la valeur est négative, une erreur est générée.
 *
 * Hérite de la classe {@link OpNotEditor}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpRoot extends OpNotEditor {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpRoot(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération de calcul de la racine carrée :
     * - Si la valeur actuelle est négative, une erreur est affichée dans {@code currentValue}.
     * - Si la valeur actuelle est positive, la racine carrée est calculée et le résultat est assigné à {@code currentValue}.
     * - Si une erreur est présente dans {@code currentValue}, l'opération n'est pas effectuée.
     */
    @Override
    public void execute() {
        if (state.currentValue.contains("-")) {
            state.currentValue = "# error #";  // En cas de valeur négative, afficher une erreur
        }
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(Math.sqrt(Double.parseDouble(state.currentValue)));
        }
    }
}
