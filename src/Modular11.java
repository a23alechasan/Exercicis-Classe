import java.util.Scanner;

public class Modular11 {
    public static void main(String[] args) {
        int numero = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        System.out.println("El quadrat és " + calcularQuadrat(numero));
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

    /**Aquesta funció multiplica un nombre enter per sí mateix, és a dir, l'eleva al quadrat.
     *
     * @param a un nombre enter
     * @return el nombre enter al quadrat
     */
    public static int calcularQuadrat (int a){
        return a*a;
    }
}