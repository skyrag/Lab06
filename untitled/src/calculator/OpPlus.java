package calculator;

public class OpPlus extends Operator {
    public OpPlus(State state) {
        this.state = state;
    }

    // This button add the current value to the head of the stack that is popped
    @Override
    public void execute(){
        state.currentValue = Double.toString(state.stack.Pop() + Double.parseDouble(state.currentValue));
        state.lastOperator = this;
    }
}
