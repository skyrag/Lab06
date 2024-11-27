package calculator;

public class OpMult extends OpErrorStack{
    public OpMult(State state) {
        this.state = state;
    }

    // this button multiply the head of the stack with the current value

    @Override
    public void execute(){
        super.execute();
        if (!state.currentValue.contains("#")){
            state.currentValue = Double.toString(state.stack.Pop() * Double.parseDouble(state.currentValue));
        }
    }
}
