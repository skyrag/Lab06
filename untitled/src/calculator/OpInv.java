package calculator;

/**
 * Opérateur qui inverse la valeur actuelle.
 * Cet opérateur calcule l'inverse (1/x) de la valeur actuelle et la remplace dans la valeur actuelle.
 * Si la valeur est égale à zéro, une erreur sera affichée.
 *
 * Hérite de la classe {@link OpNotEditor}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpInv extends OpNotEditor {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpInv(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération d'inversion de la valeur actuelle :
     * - Si la valeur actuelle ne contient pas d'erreur (pas de "#"), elle est convertie en double et son inverse (1/x) est calculé.
     * - Si la valeur est égale à zéro, une erreur d'inversion est générée (bien que cette erreur ne soit pas explicitement gérée dans ce code).
     * - Le résultat de l'inversion est ensuite stocké dans {@code currentValue}.
     */
    @Override
    public void execute() {
        super.execute();
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(1 / Double.parseDouble(state.currentValue));
        }
    }
}
