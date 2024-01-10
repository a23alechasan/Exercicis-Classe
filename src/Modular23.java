import java.util.Scanner;

public class Modular23 {
    public static void main(String[] args){
        int n = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        if (esCapicua(n)){
            System.out.println("És capicua.");
        } else {
            System.out.println("No és capicua.");
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

    /** Calcula si el nombre del paràmetre és capicua. No entenc bé el codi perquè no sabia fer-ho i ho
     * he hagut de buscar a google perquè jo ho estava intentant fer amb arrays i no
     * em sortia però aquest funciona!!!
     *
     * @param n nombre enter a validar si és capicua
     * @return booleà true si el nombre és capicúa, booleà fals si el nombre no ho és
     */
    public static boolean esCapicua(int n){
        int aux;
        int invertit = 0;
        int xifra;
        aux = n;
        while (aux!=0){
            xifra = aux % 10;
            invertit = invertit * 10 + xifra;
            aux = aux / 10;
        }
        return n == invertit;
    }
}