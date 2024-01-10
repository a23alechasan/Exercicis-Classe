import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int resultat  = 0;
        boolean sortir = false;
        while (!sortir){
            int memoria = demanarValorMemoria(getMenuMemoria());
            if (memoria == 1){
                int operador2 = demanarValorEnter("Escriu el valor del segon operador: ");
                int opcio = demanarValorMenu(getMenu(), 1, 5);
                switch (opcio) {
                    case 1:
                        resultat = suma(resultat, operador2);
                            break;
                    case 2:
                        resultat = resta(resultat, operador2);
                            break; 
                    case 3:
                        resultat = divisio(resultat, operador2);
                            break;
                    case 4:
                        resultat = multiplicacio(resultat, operador2);
                            break;
                    case 5:
                        sortir = true;
                }
            } else {
                int operador1 = demanarValorEnter("Escriu el valor del primer operador: ");
                int operador2 = demanarValorEnter("Escriu el valor del segon operador: ");
                int opcio = demanarValorMenu(getMenu(), 1, 5);
                switch (opcio) {
                    case 1:
                        resultat = suma(operador1, operador2);
                        break;
                    case 2:
                        resultat = resta(operador1, operador2);
                        break;
                    case 3:
                        resultat = divisio(operador1, operador2);
                        break;
                    case 4:
                        resultat = multiplicacio(operador1, operador2);
                        break;
                    case 5:
                        sortir = true;
                }
            }
            System.out.println("El resulta de la operacio es " + resultat);
        }

    }



    private static String getMenu() {
        return "Quina operació vols realitzar:\n"+
                "  1-suma\n"+
                "  2-resta\n"+
                "  3-divisió\n"+
                "  4-multiplicacio\n"+
                "  5-sortir";
    }
    private static String getMenuMemoria() {
        return "Indica quin vols que sigui el l'operador 1:\n"+
                "  1- resultat enterior\n"+
                "  2- nou operador";
    }

    /**
     * Realitza la suma de valors enters rebuts per paràmetre
     * @param a Primer operador de la operació
     * @param b Segon operador de la operació
     * @return Retorna el resultat de la operació de suma
     */
    public static int suma (int a,int b){
        return a + b;
    }

    public static int resta (int a,int b){
        return a - b;
    }

    public static int divisio (int a,int b){
        return a / b;
    }
    public static int multiplicacio (int a,int b){
        return a * b;
    }


    /**
     * Obté un valor enter per consola descartant els altres tipus
     * @param message Missatge a mostrar al usuari
     * @return Valor int obtingut per consola
     */
    public static int demanarValorEnter(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        while (!input.hasNextInt()){
            System.out.println("Valor incorrecte!!");
            input.next();
        }
        return input.nextInt();
    }
    public static int demanarValorMenu(String missatge, int a, int b) {
        System.out.println(missatge);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Valor incorrecte!!");
                scanner.next();
            }
            int valor = scanner.nextInt();
            if (valor >= a && valor <= b) {
                return valor;
            } else {
                System.out.println("Valor incorrecte!!");
            }
        }
    }
    public static int demanarValorMemoria(String missatge) {
        System.out.println(missatge);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Valor incorrecte!!");
                scanner.next();
            }
            int valor = scanner.nextInt();
            if (valor == 1 || valor == 2) {
                return valor;
            } else {
                System.out.println("Valor incorrecte!!");
            }
        }
    }

}