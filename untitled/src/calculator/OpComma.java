package calculator;

public class OpComma extends Operator{
    public OpComma(State state) {
        this.state = state;
    }

    // Apply a coma to the number if it doesn't already has one
    @Override
    public void execute(){
        if (state.currentValue.contains(".")){
            // ignorée ou affichage d'erreur
        } else {
            state.currentValue = state.currentValue.concat(".");
            state.lastOperator = this;
        }
    }
}
