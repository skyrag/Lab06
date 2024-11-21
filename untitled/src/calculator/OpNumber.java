package calculator;

public class OpNumber extends Operator{
    private int number;

    public OpNumber(StackCalc<Integer> stack, int number) {
        this.stack = stack;
        this.number = number;
    }

    @Override
    public void execute(){

    }
}
