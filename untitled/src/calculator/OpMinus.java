package calculator;

public class OpMinus extends OpErrorStack {
    public OpMinus(State state) {
        this.state = state;
    }

    // this boutton subtract the current value to the head of the stack
    @Override
    public void execute(){
        super.execute();
        if (!state.currentValue.contains("#")){
            state.currentValue = Double.toString(state.stack.Pop() - Double.parseDouble(state.currentValue));
        }
    }
}
