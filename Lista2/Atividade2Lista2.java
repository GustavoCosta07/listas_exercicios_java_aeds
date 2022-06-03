package Lista2;
import java.util.Scanner;

public class Atividade2Lista2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numerosIguaisAzero = 0;
        int numerosMaioresQueZero = 0;
        int numerosMenoresQueZero = 0;
        int continuarPrograma = 1;

        while (continuarPrograma == 1) {
            System.out.println("Digite um valor inteiro");
            int valoresInteiros = entrada.nextInt();

            if (valoresInteiros < 0) {
                numerosMenoresQueZero++;
            } else if (valoresInteiros == 0) {
                numerosIguaisAzero++;
            } else if (valoresInteiros > 0) {
                numerosMaioresQueZero++;
            }
            System.out.println("Deseja Continuar o programa? Se sim Digite 1, Se não, Digite 2 ");
            continuarPrograma = entrada.nextInt();
            if (continuarPrograma != 1) {
                int total = numerosIguaisAzero + numerosMaioresQueZero + numerosMenoresQueZero;
                double p = (double) (numerosMaioresQueZero / total * 100);
                System.out.println(
                        "A Quantidade de números inteiros positivos maiores que zero em porcentagem digitados peo usuáro foi de: "
                                + p + " Porcento");
                p = (double) (numerosIguaisAzero / total * 100);
                System.out.println(
                        "A Quantidade de números inteiros iguais a zero em porcentagem digitados peo usuáro foi de: "
                                + p + " Porcento");
                p = (double) (numerosMenoresQueZero / total * 100);
                System.out.println(
                        "A Quantidade de números inteiros menores que zero em porcentagem digitados peo usuáro foi de: "
                                + p + " Porcento");
                System.out.println("Fim de programa");
            }

        }

        entrada.close();
    }
}

