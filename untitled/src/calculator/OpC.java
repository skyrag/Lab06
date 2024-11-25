package calculator;

public class OpC extends Operator{
    public OpC(State state) {
        this.state = state;
    }

    // TO-DO C (clear) réinitialise l’affichage, supprime une éventuelle erreur et vide la pile.
    @Override
    public void execute() {

        state.lastOperator = this;
    }
}
