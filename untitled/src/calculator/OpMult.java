package calculator;

public class OpMult extends Operator{
    public OpMult(State state) {
        this.state = state;
    }

    // this button multiply the head of the stack with the current value
    @Override
    public void execute(){
        state.currentValue = Double.toString(state.stack.Pop() * Double.parseDouble(state.currentValue));
        state.lastOperator = this;
    }
}
