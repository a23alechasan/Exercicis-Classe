import java.util.Scanner;

public class Modular22 {
    public static void main(String[] args){
        int n = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        esPerfecte(n);
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

    /** Aquesta funció, a través d'una fòrmula matemàtica que comprova si tots els divisors dels nombres més petits
     * a n sumats equivalen a aquells nombres. Això ho fa primer comprovant els seus divisors i després sumant-los tots. Si aquests
     * divisors sumats equivalen a un dels nombres nombre, la funció imprimirà aquell nombre. Al final, estaran imprimits
     * per consola tots els nombres perfectes més petits que el nombre n.
     *
     * @param n nombre enter que actua com a límit. Es calcularan tots els nombres perfectes entre 0 i aquest nombre.
     */
    public static void esPerfecte (int n){
        int i, j, suma;
        for(i=1;i <= n;i++){
            suma = 0;
            for(j = 1;j < i;j++){
                if(i % j==0){
                    suma = suma + j;
                }
            }
            if(i == suma){
                System.out.println(i);
            }
        }
    }
}

