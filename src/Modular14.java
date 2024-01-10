import java.util.Scanner;

public class Modular14 {
    public static void main(String[] args){
        float a = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        float b = scannerNombre("Introdueix un nombre vàlid, sisplau.");
        System.out.println("Introdueix 1 si vols fer una suma entre els dos nombres.");
        System.out.println("Introdueix 2 si vols fer una resta entre els dos nombres.");
        System.out.println("Introdueix 3 si vols fer una multiplicació entre els dos nombres.");
        float tipusoperacio = scannerNombre("Introdueix 4 si vols fer una divisió entre els dos nombres.");
        float resultat = 0;
        switch ((int) tipusoperacio){
            case 1: resultat = suma(a, b);
            break;
            case 2: resultat = resta(a, b);
                break;
            case 3: resultat = multiplicacio(a, b);
                break;
            case 4: resultat = divisio(a, b);
                break;
        }
        System.out.println("El resultat és " + resultat);
    }
    /** Aquesta funció comprova que el nombre introduit per l'usuari és un nombre decimal float, i el torna a demanar
     * si no és així, evitant l'error i l'aturada de l'execució en cas que l'usuari introdueixi un altre
     * tipus de dades.
     *
     * @param missatge un missatge que es mostra per consola demanant un nombre float a l'usuari
     * @return un nombre decimal float que l'usuari ha introduit per consola.
     */
    public static float scannerNombre(String missatge){
        System.out.println(missatge);
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextFloat()){
            System.out.println("Introdueix un nombre vàlid, sisplau.");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    /**Funció que suma un decimal amb un altre i retorna el resultat
     *
     * @param a nombre decimal float sobre el que s'opera
     * @param b nombre decimal float amb el que s'opera
     * @return resultat de l'operació
     */
    public static float suma (float a, float b){
        return a + b;
    }
    /**Funció que resta un decimal a un altre i retorna el resultat
     *
     * @param a nombre decimal float sobre el que s'opera
     * @param b nombre decimal float amb el que s'opera
     * @return resultat de l'operació
     */
    public static float resta (float a, float b){
        return a - b;
    }
    /**Funció que multiplica un decimal amb un altre i retorna el resultat
     *
     * @param a nombre decimal float sobre el que s'opera
     * @param b nombre decimal float amb el que s'opera
     * @return resultat de l'operació
     */
    public static float multiplicacio (float a, float b){
        return a * b;
    }
    /**Funció que divideix un decimal a un altre i retorna el resultat
     *
     * @param a nombre decimal float sobre el que s'opera
     * @param b nombre decimal float amb el que s'opera
     * @return resultat de l'operació
     */
    public static float divisio (float a, float b){
        return a / b;
    }
}
