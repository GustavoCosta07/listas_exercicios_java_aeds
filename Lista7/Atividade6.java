import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int controle = 0;
        for (int divisor = 2; divisor < args.length; divisor++) {

            if (divisor * (numero / divisor) == numero) {
                controle += divisor;
            }
            
        }
        System.out.println(controle);

        entrada.close();
    }
}