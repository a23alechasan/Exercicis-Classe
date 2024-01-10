import java.util.Scanner;

public class Modular12 {
    public static void main(String[] args) {
        int a = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        int b = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        if (esMesGran(a, b)){
            System.out.println("El primer és major que el segon.");
        } else {
            System.out.println("El primer no és major que el segon.");
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

    /** Aquesta funció demana dos nombres enters retorna un booleà true si el primer enter és més
     * gran que el segon i viceversa.
     *
     * @param a un nombre enter
     * @param b un altre nombre enter
     * @return un booleà si el primer enter és més gran que el segon i viceversa
     */
    public static boolean esMesGran (int a, int b){
        return a > b;
    }
}
