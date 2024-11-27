package calculator;

import javax.swing.*;

/**
 * Opérateur qui effectue une réinitialisation partielle de la calculatrice.
 * Cet opérateur simule le bouton "CE" (clear error) d'une calculatrice, réinitialisant l'affichage à 0
 * et supprimant les erreurs éventuelles, sans affecter la pile.
 *
 * Hérite de la classe {@link Operator}.
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class OpCe extends Operator {

    /**
     * Constructeur qui initialise l'opérateur avec l'état de la calculatrice et un champ de texte facultatif.
     *
     * @param state l'état actuel de la calculatrice
     */
    public OpCe(State state) {
        this.state = state;
    }

    /**
     * Exécute l'opération "CE" (clear error) :
     * - Réinitialise la valeur courante à {@code null}.
     * - Active le mode d'édition pour permettre une nouvelle saisie.
     * - Réinitialise uniquement l'affichage sans vider la pile.
     */
    @Override
    void execute() {
        state.stack.COrCe(false);
        state.currentValue = null;
        state.modeEdition = true;
    }
}
