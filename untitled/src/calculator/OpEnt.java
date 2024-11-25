package calculator;

public class OpEnt extends Operator{
    public OpEnt(State state) {
        this.state = state;
    }

    // this put the current number in the stack otherwise it does nothing
    @Override
    public void execute(){
        state.stack.Push(Double.parseDouble(state.currentValue));
        state.currentValue = null;
        state.lastOperator = this;
    }
}
