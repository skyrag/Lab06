package calculator;


public class OpRoot extends OpNotEditor{
    public OpRoot(State state) {
        this.state = state;
    }

    @Override
    public void execute(){
        if (state.currentValue.contains("-")){
            state.currentValue = "# error #";
        }
        if (!state.currentValue.contains("#")){
            state.currentValue = Double.toString(Math.sqrt(Double.parseDouble(state.currentValue)));
        }
    }
}
