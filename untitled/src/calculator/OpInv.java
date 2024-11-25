package calculator;

public class OpInv extends Operator{
    public OpInv(State state) {
        this.state = state;
    }

    // this bouton put the inverse of the current value in the current value
    @Override
    public void execute(){
        state.currentValue = Double.toString(1/Double.parseDouble(state.currentValue));
        state.lastOperator = this;
    }
}
