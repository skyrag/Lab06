package calculator;

public class OpDiv extends OpErrorStack {
    public OpDiv(State state) {
        this.state = state;
    }

    // applique la division de sorte que le premier nombre de la pile soit divisé par le nombre actuel
    @Override
    public void execute(){
        super.execute();
        double temp = state.stack.Pop();
        if (Double.parseDouble(state.currentValue) == 0.0 && temp == 0.0){
            state.currentValue = "# error #";
        }
        if (!state.currentValue.contains("#")){
            state.currentValue = Double.toString(temp / Double.parseDouble(state.currentValue));
        }
    }
}
