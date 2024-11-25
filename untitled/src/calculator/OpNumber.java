package calculator;

public class OpNumber extends Operator{
    private int number;

    public OpNumber(State state, int number) {
        this.state = state;
        this.number = number;
    }

    @Override
    public void execute(){
        if (state.lastOperator instanceof OpNumber || state.lastOperator instanceof OpComma || state.lastOperator instanceof OpBackspace) {
            state.currentValue = state.currentValue + number;
        } else {
            if (state.currentValue != null) {
                state.stack.Push(Double.parseDouble(state.currentValue));
            }
            state.currentValue = Integer.toString(number);
        }
        state.lastOperator = this;
    }
}
