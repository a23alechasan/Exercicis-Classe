import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Modular32 {
    public static void main(String[] args) {
        Avui("La data d'avui és: ");
    }

    /** A través d'un mètode d'una llibreria de Java, la funció agafa la data del sistema.
     * Desprès, amb un altre mètode la formata a l'esmentada i la imprimeix per consola.
     *
     * @param missatge un String amb un text abans d'imprimir la fata formatada.
     */
    public static void Avui(String missatge){
        String yellow="\033[33m";
        String reset="\u001B[0m";
        LocalDate dataActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataActual.format(formatter);
        System.out.println(missatge+yellow+dataFormatada+reset);
    }
}
