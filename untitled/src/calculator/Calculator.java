package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe principale de la calculatrice en mode console.
 * Permet de gérer des opérations mathématiques basées sur des commandes utilisateurs.
 * Les opérateurs disponibles sont dynamiquement gérés à l'aide d'une table de correspondance.
 *
 * Exemple d'utilisation :
 * <pre>
 * > 5
 * 5.0
 * > 3
 * 3.0 5.0
 * > +
 * 8.0
 * > exit
 * Goodbye!
 * </pre>
 *
 * Les opérateurs incluent des opérations de base (+, -, *, /) ainsi que des fonctions avancées
 * (sqrt, inv, etc.).
 *
 * @see State
 * @see Operator
 * @see OpNumber
 * @see OpPlus
 * @see OpMinus
 * @see OpMult
 * @see OpDiv
 * @see OpRoot
 * @see OpChange
 * @see OpBackspace
 * @see OpC
 * @see OpCe
 *
 * @author Nicolas Duprat, Theo Pilet
 */
public class Calculator {
    /**
     * L'état courant de la calculatrice, qui inclut la valeur actuelle et la pile des opérandes.
     */
    private State state;

    /**
     * Une table de correspondance entre les commandes utilisateur (comme "+", "sqrt")
     * et les opérateurs correspondants.
     */
    private final Map<String, Operator> operators = new HashMap<>();

    /**
     * Initialise la calculatrice et configure les opérateurs disponibles.
     */
    public Calculator() {
        this.state = new State();

        // Ajout des opérateurs numériques
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

        // Ajout des opérateurs mathématiques
        operators.put("-", new OpMinus(state));
        operators.put("+", new OpPlus(state));
        operators.put("*", new OpMult(state));
        operators.put("/", new OpDiv(state));
        operators.put("inv", new OpInv(state));
        operators.put("sqrt", new OpRoot(state));
        operators.put("^2", new OpSq(state));
        operators.put("<=", new OpBackspace(state));

        // Autres commandes
        operators.put("reset", new OpC(state));
        operators.put("wipe", new OpCe(state));
        operators.put(".", new OpComma(state));
        operators.put("ent", new OpEnt(state));
        operators.put("store", new OpMs(state));
        operators.put("recall", new OpMr(state));
        operators.put("sign", new OpChange(state));

        // Vous pouvez ajouter d'autres opérateurs ici
    }

    /**
     * Traite une entrée utilisateur, identifie la commande ou le nombre, et exécute l'opération associée.
     *
     * @param input la commande ou le nombre saisi par l'utilisateur
     */
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

        // Affichage de l'état actuel
        System.out.print((state.currentValue != null ? state.currentValue : "0") + " ");
        String[] stack = state.stack.toArray();
        for (int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    /**
     * Méthode principale de la calculatrice.
     * Gère la boucle d'entrée utilisateur, attend les commandes, et affiche les résultats.
     *
     * @param args non utilisé
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Boucle principale d'entrée utilisateur
        while (true) {
            System.out.print(">");
            String input = sc.nextLine();
            calculator.processInput(input);
        }
    }
}
