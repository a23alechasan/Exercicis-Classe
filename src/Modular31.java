
public class Modular31 {
    public static void main(String[] args) {
        String missatge = "no saps programar.";
        erroritza(missatge);
    }

    /** Imprimeix el missatge del paràmetre de color vermell i amb un "ERROR: " davant.
     *
     * @param error un String amb el missatge que es vol mostrar dins l'error.
     */
    public static void erroritza(String error) {
        String red="\033[31m";
        String reset="\u001B[0m";
        System.out.println(red + "ERROR: " + error + reset);
    }
}
