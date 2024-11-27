package calculator;

public class OpNotEditor extends Operator{

    @Override
    public void execute(){
        state.modeEdition = false;
    }
}
