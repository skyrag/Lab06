package calculator;

public class State {
    public StackCalc <Double> stack;
    public String currentValue;
    public String memory;
    public boolean modeEdition;

    public State() {
        this.stack = new StackCalc<>();
        this.currentValue = null;
        this.memory = null;
        this.modeEdition = true;
    }
}
