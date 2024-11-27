package calculator;

public class OpErrorStack extends OpNotEditor{

    @Override
    public void execute(){
        super.execute();
        if (state.stack.size() == 0) {
            state.currentValue = "# error #";
        }
    }
}
