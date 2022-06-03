package Lista2;
import java.util.Scanner;

public class Atividade1Lista {

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
            System.out.println("Deseja Continuar o programa? Se sim Digite 1, Se não, Digite Qualquer Coisa ");
            continuarPrograma = entrada.nextInt();
            if (continuarPrograma != 1) {
                System.out.println(
                        "A Quantidade de números inteiros positivos maiores que zero digitados peo usuáro foi de: "
                                + numerosMaioresQueZero);
                System.out.println("A Quantidade de números inteiros iguais a zero digitados peo usuáro foi de: "
                        + numerosIguaisAzero);
                System.out.println("A Quantidade de números inteiros menores que zero digitados peo usuáro foi de: "
                        + numerosMenoresQueZero);
                System.out.println("Fim de programa");
            }

        }

        entrada.close();
    }
}