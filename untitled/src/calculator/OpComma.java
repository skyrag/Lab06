package calculator;

public class OpComma extends Operator{
    public OpComma(State state) {
        this.state = state;
    }

    // Apply a coma to the number if it doesn't already has one
    @Override
    public void execute(){
        if (state.currentValue != null){
            if (!state.currentValue.contains(".") || state.modeEdition){
                state.currentValue = state.currentValue.concat(".");
            }
        }
    }
}
