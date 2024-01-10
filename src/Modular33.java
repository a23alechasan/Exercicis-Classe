import java.util.Scanner;

public class Modular33 {
    public static void main(String[] args) {
        System.out.println(llegirNumeroEnter());
    }

     /** Aquesta funció comprova que el nombre introduit per l'usuari és un nombre enter, i el torna a demanar
     * si no és així, evitant l'error i l'aturada de l'execució en cas que l'usuari introdueixi un altre
     * tipus de dades.
     *
     * @return el nombre introduit per l'usuari.
     */
    public static int llegirNumeroEnter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix un nombre vàlid, sisplau.");
        while(!scanner.hasNextInt()){
            System.out.println("Introdueix un nombre vàlid, sisplau.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
