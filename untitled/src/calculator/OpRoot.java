package calculator;


public class OpRoot extends Operator{
    public OpRoot(State state) {
        this.state = state;
    }

    @Override
    public void execute(){
        state.currentValue = Double.toString(Math.sqrt(Double.parseDouble(state.currentValue)));
        state.lastOperator = this;
    }
}
