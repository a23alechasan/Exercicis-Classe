import java.util.Scanner;

public class PuntoG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutsLiterals = input.nextInt();
        int hores = minutsLiterals/60;
        int minuts = minutsLiterals%60;
        System.out.println(hores+":"+minuts);
    }
}
