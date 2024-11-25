package calculator;

public class OpSq extends Operator {
    public OpSq(State state) {
        this.state = state;
    }

    // This button make the square of the currentValue
    @Override
    public void execute(){
        state.currentValue = Double.toString(Math.pow(Double.parseDouble(state.currentValue), 2));
        state.lastOperator = this;
    }
}
