package calculator;

public class OpMs extends Operator{
    public OpMs(State state) {
            this.state = state;
    }

    //TO-DO MS (memory store) stocke en mémoire la valeur courante.
    @Override
    public void execute(){

        state.lastOperator = this;
    }

}
