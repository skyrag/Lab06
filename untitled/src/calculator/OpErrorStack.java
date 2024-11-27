package calculator;

/**
 * Opérateur qui vérifie l'état de la pile avant d'exécuter une opération.
 * Cet opérateur hérite de {@link OpNotEditor} et ajoute une vérification d'erreur
 * avant d'effectuer une opération. Si la pile est vide, il affiche un message d'erreur.
 *
 * Hérite de la classe {@link OpNotEditor}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpErrorStack extends OpNotEditor {

    /**
     * Exécute l'opération après avoir effectué une vérification d'erreur :
     * - Si la pile est vide, un message d'erreur ("# error #") est affiché.
     * - Sinon, l'opération héritée de {@link OpNotEditor} est exécutée normalement.
     */
    @Override
    public void execute() {
        super.execute();
        if (state.stack.size() == 0) {
            state.currentValue = "# error #";
        }
    }
}
