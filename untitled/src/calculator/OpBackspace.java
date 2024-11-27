package calculator;

public class OpBackspace extends Operator{
    public OpBackspace(State state) {
        this.state = state;
    }

    //TO-DO <= (backspace) supprime le dernier caractère d’une valeur en cours d’introduction
    @Override
    public void execute(){
        if (!(state.currentValue == null) && !state.currentValue.contains("#")){
            state.currentValue = state.currentValue.substring(0, state.currentValue.length()-1);
        }
    }
}
