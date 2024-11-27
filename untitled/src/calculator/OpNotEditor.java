package calculator;

/**
 * Opérateur qui désactive le mode édition.
 * Cet opérateur met à jour l'état de la calculatrice pour désactiver le mode d'édition,
 * ce qui empêche la modification de la valeur actuelle pendant l'exécution d'autres opérations.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpNotEditor extends Operator {

    /**
     * Exécute l'opération qui désactive le mode édition :
     * - Le mode édition est désactivé, ce qui empêche la modification directe de la valeur actuelle.
     * - Cette opération est généralement utilisée avant l'exécution de certaines opérations sur la pile.
     */
    @Override
    public void execute() {
        state.modeEdition = false;
    }
}
