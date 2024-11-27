package calculator;

public class OpNumber extends Operator{
    private int number;

    public OpNumber(State state, int number) {
        this.state = state;
        this.number = number;
    }

    @Override
    public void execute(){
        if (state.modeEdition) {
            if (state.currentValue != null){
                state.currentValue = state.currentValue + number;
            } else {
                state.currentValue = Integer.toString(number);
            }

        }
    }
}
