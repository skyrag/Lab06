package calculator;

abstract class Operator
{
  protected StackCalc<Object> stack;
  abstract void execute();
}
