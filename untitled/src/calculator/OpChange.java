package calculator;

public class OpChange extends Operator{

    public OpChange(State state) {
        this.state = state;
    }

    // change le signe de la valeur actuel
    @Override
    public void execute(){
        if (state.currentValue != null){
            if (state.currentValue.contains("-")){
                state.currentValue = state.currentValue.replace("-","");
            } else {
                state.currentValue = "-" + state.currentValue;
            }
        }
    }
}
