package calculator;

import javax.swing.*;

/**
 * Opérateur qui effectue une réinitialisation complète de la calculatrice.
 * Cet opérateur simule le bouton "C" (clear) d'une calculatrice, réinitialisant l'affichage, supprimant les erreurs éventuelles,
 * et vidant la pile.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpC extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice et un champ de texte facultatif.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpC(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération "C" (clear) :
     * - Vide la pile de la calculatrice.
     * - Réinitialise la valeur courante à null.
     * - Active le mode d'édition pour permettre une nouvelle saisie.
     */
    @Override
    public void execute() {
        state.stack.COrCe(true);
        state.currentValue = null;
        state.modeEdition = true;
    }
}
