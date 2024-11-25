package calculator;

import javax.swing.*;

public class OpC extends Operator{
    private JTextField needReset;

    public OpC(State state, JTextField toReset) {
        this.state = state;
        this.needReset = toReset;
    }

    // TO-DO C (clear) réinitialise l’affichage, supprime une éventuelle erreur et vide la pile.
    @Override
    public void execute() {
        state.stack.COrCe(true);
        needReset.setText("0");
        state.currentValue = null;
        state.lastOperator = this;
    }
}
