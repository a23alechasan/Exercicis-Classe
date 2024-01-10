import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] taulell = new int[91];
        for (int i = 0; i < 91; i++) {
            int bola = rand.nextInt(1, 91);
            for (int j = 0; j < 91; j++) {
                if (bola == taulell[j]){
                    bola = rand.nextInt(1, 91);
                    j--;
                }
                else {
                    bola = taulell[i];
                }
            }
            System.out.println("AAAAAAAAAAAAAA");
        }
    }
}