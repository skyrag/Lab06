package calculator;

public class OpMinus extends Operator {
    public OpMinus(State state) {
        this.state = state;
    }

    // this boutton subtract the current value to the head of the stack
    @Override
    public void execute(){
        state.currentValue = Double.toString(state.stack.Pop() - Double.parseDouble(state.currentValue));
        state.lastOperator = this;
    }
}
