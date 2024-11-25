package calculator;

public class OpDiv extends Operator {
    public OpDiv(State state) {
        this.state = state;
    }

    // applique la division de sorte que le premier nombre de la pile soit divisé par le nombre actuel
    @Override
    public void execute(){
        double temp = state.stack.Pop();
        state.currentValue = Double.toString(temp / Double.parseDouble(state.currentValue));
        state.lastOperator = this;
    }
}
