package calculator;

public class OpPlus extends OpErrorStack {
    public OpPlus(State state) {
        this.state = state;
    }

    // This button add the current value to the head of the stack that is popped
    @Override
    public void execute(){
        super.execute();
        if (!state.currentValue.contains("#")){
            state.currentValue = Double.toString(state.stack.Pop() + Double.parseDouble(state.currentValue));
        }
    }
}
