package calculator;

public class OpCe extends Operator{
    public OpCe(State state) {
        this.state = state;
    }

    // TO-DO CE (clear error) réinitialise l’affichage à 0 et supprime une éventuelle erreur.
    @Override
    void execute() {
        state.lastOperator = this;
    }
}
