import java.util.Scanner;

public class Modular24 {
    public static void main(String[] args) {
        int mes = scannerMes("Introdueix un mes vàlid, sisplau.");
        int any = scannerAny("Introdueix un any vàlid, sisplau.");
        System.out.println("El mes " + mes + " de l'any " + any + " té " + nombreDies(mes, any) + " dies.");
    }

    /** Aquesta funció comprova que el nombre introduit per l'usuari és un nombre enter i si
     * és un any vàlid i el torna a demanar si no és així, evitant l'error i l'aturada de l'execució en
     * cas que l'usuari introdueixi un altre tipus de dades o evitant l'error de càlcul en cas que l'any no sigui
     * igual o major a 0.
     *
     * @param missatge un missatge que es mostra per consola demanant un nombre enter a l'usuari
     * @return un nombre enter que l'usuari ha introduit per consola.
     */
    public static int scannerAny(String missatge) {
        System.out.println(missatge);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Introdueix un any vàlid, sisplau.");
                scanner.next();
            }
            int any = scanner.nextInt();
            if (any > 0) {
                return any;
            } else {
                System.out.println("L'any ha de ser major a 0. Torna a introduir-lo.");
            }
        }
    }
    /** Aquesta funció comprova que el nombre introduit per l'usuari és un nombre enter i si
     * és un mes vàlid i el torna a demanar si no és així, evitant l'error i l'aturada de l'execució en
     * cas que l'usuari introdueixi un altre tipus de dades o evitant l'error de càlcul en cas que el
     * mes no sigui un nombre entre 1 i 12.
     *
     * @param missatge un missatge que es mostra per consola demanant un nombre enter a l'usuari
     * @return un nombre enter que l'usuari ha introduit per consola.
     */
    public static int scannerMes(String missatge) {
        System.out.println(missatge);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Introdueix un mes vàlid, sisplau.");
                scanner.next();
            }
            int mes = scanner.nextInt();
            if (mes >= 1 && mes <= 12) {
                return mes;
            } else {
                System.out.println("El mes ha de ser entre 1 i 12. Torna a introduir-lo.");
            }
        }
    }

    /** Aquesta funció retorna el nombre de dies que te un mes d'un determinat any. S'ha tingut en compte
     * les diferents regles dels anys de traspàs
     *
     * @param mes nombre enter que representa un mes
     * @param any nombre enter que representa un any
     * @return el nombre de dies d'aquell mes d'aquell any
     */
    public static int nombreDies(int mes, int any) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            return 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else if (mes == 2) {
            if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 28;
        }
    }
}