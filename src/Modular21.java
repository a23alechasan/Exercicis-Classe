import java.util.Scanner;

public class Modular21 {
    public static void main(String[] args){
        int n = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        if (esPerfecte(n)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    /** Aquesta funció comprova que el nombre introduit per l'usuari és un nombre enter, i el torna a demanar
     * si no és així, evitant l'error i l'aturada de l'execució en cas que l'usuari introdueixi un altre
     * tipus de dades.
     *
     * @param missatge un missatge que es mostra per consola demanant un nombre enter a l'usuari
     * @return un nombre enter que l'usuari ha introduit per consola.
     */
    public static int scannerNombre(String missatge){
        System.out.println(missatge);
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Introdueix un nombre vàlid, sisplau.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /** Aquesta funció, a través d'una fòrmula matemàtica que comprova si tots els divisors del nombre sumats
     * equivalen al nombre. Això ho fa primer comprovant els seus divisors i després sumant-los tots. Si aquests
     * divisors sumats equivalen al nombre, la funció retornarà un booleà true, si no equival, un booleà fals.
     *
     * @param n nombre que volem saber si és perfecte
     * @return booleà true si és perfecte, booleà fals si no ho és
     */
    public static boolean esPerfecte (int n){
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma = suma + i;
            }
        }
        return suma == n;
    }
}
