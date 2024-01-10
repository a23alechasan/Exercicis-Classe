import java.util.Scanner;

public class Modular13 {
    public static void main(String[] args) {
        float radi = scannerNombre("Introdueix el radi de l'esfera");
        System.out.println("El volum de l'esfera és " + calcularVolum(radi));
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

    /** Aquesta funció calcula el volum d'una esfera amb el seu radi utilitzant la fòrmula matemàtica
     * del volum de l'esfera.
     *
     * @param r un nombre decimal float, el radi de l'esfera
     * @return un altre decimal float, el volum de l'esfera
     */
    public static double calcularVolum(float r){
        return ((Math.PI * 4)/3)*(r * r * r);
    }
}
