package calculator;

public class OpMr extends Operator{
    public OpMr(State state) {
        this.state = state;
    }

    //TO-DO MR (memory recall) permet de la récupérer
    @Override
    public void execute(){

        state.lastOperator = this;
    }
}
