package calculator;

import javax.swing.*;

public class OpCe extends Operator{
    private JTextField needReset;

    public OpCe(State state, JTextField toReset) {
        this.state = state;
        this.needReset = toReset;
    }

    // TO-DO CE (clear error) réinitialise l’affichage à 0 et supprime une éventuelle erreur.
    @Override
    void execute() {
        state.stack.COrCe(false);
        needReset.setText("0");
        state.currentValue = null;
        state.lastOperator = this;
    }
}
