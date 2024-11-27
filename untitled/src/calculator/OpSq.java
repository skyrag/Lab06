package calculator;

public class OpSq extends OpNotEditor {
    public OpSq(State state) {
        this.state = state;
    }

    // This button make the square of the currentValue
    @Override
    public void execute(){
        super.execute();
        if (!state.currentValue.contains("#")) {
            state.currentValue = Double.toString(Math.pow(Double.parseDouble(state.currentValue), 2));
        }
    }
}
