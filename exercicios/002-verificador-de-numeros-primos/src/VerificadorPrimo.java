import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        boolean ehPrimo = true;

        if (numero <=1) {
            ehPrimo = false;
        } else {
            for(int i = 2; i < numero; i++){
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        sc.close();
    }
}
