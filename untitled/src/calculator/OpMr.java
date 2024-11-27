package calculator;

public class OpMr extends Operator{
    public OpMr(State state) {
        this.state = state;
    }

    //TO-DO MR (memory recall) permet de la récupérer
    @Override
    public void execute(){
        if (!state.currentValue.contains("#")){
            state.currentValue = state.memory;
            state.modeEdition = true;
        }
    }
}
