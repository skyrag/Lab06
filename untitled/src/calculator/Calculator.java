package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private State state;
    private final Map<String, Operator> operators = new HashMap<>();

    public Calculator() {
        this.state = new State();
        operators.put("0", new OpNumber(state, 0));
        operators.put("1", new OpNumber(state, 1));
        operators.put("2", new OpNumber(state, 2));
        operators.put("3", new OpNumber(state, 3));
        operators.put("4", new OpNumber(state, 4));
        operators.put("5", new OpNumber(state, 5));
        operators.put("6", new OpNumber(state, 6));
        operators.put("7", new OpNumber(state, 7));
        operators.put("8", new OpNumber(state, 8));
        operators.put("9", new OpNumber(state, 9));
        operators.put("-", new OpMinus(state));
        operators.put("+", new OpPlus(state));
        operators.put("*", new OpMult(state));
        operators.put("/", new OpDiv(state));
        operators.put("inv", new OpInv(state));
        operators.put("sqrt", new OpRoot(state));
        operators.put("^2", new OpSq(state));
        operators.put("<=", new OpBackspace(state));
        operators.put("reset", new OpC(state, null));
        operators.put("wipe", new OpCe(state, null));
        operators.put(".", new OpComma(state));
        operators.put("ent", new OpEnt(state));
        operators.put("store", new OpMs(state));
        operators.put("recall", new OpMr(state));
        operators.put("sign", new OpChange(state));

        // Ajoutez d'autres opérateurs ici
    }

    public void processInput(String input) {
        if (operators.containsKey(input)) {
            operators.get(input).execute();
        } else if (input.equalsIgnoreCase("exit")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid input: " + input);
            System.out.println();
        }
        System.out.print((state.currentValue != null ? state.currentValue : "0")  + " ");
        String[] stack = state.stack.toArray();
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true){
            System.out.print(">");
            String input = sc.nextLine();
            calculator.processInput(input);
        }



    }
}
