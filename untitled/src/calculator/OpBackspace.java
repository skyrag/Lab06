package calculator;

public class OpBackspace extends Operator{
    public OpBackspace(StackCalc<Object> stack) {
        this.stack = stack;
    }

    //TO-DO <= (backspace) supprime le dernier caractère d’une valeur en cours d’introduction
    @Override
    public void execute(){
        Object temp = stack.Pop();
        if (temp instanceof String t){
            temp = (t).substring(0, (t).length() - 1);
        } else {
            
        }

    }
}
