package Lista2;

import java.util.Scanner;

public class Atividade1Lista22 {

    private static int numerosIguaisAzero = 0;
    private static int numerosMaioresQueZero = 0;
    private static int numerosMenoresQueZero = 0;
    private static int continuarPrograma = 1;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        limparTela();

        while (continuarPrograma == 1) {
            exibirMenu();
            System.out.println("Digite um valor inteiro");
            String valorObtido = entrada.next();
            int valorObtidoComoInteiro = 0;

            if(valorObtido.equals("f")){
                continuarPrograma = 0;
            }

            try {
                valorObtidoComoInteiro = Integer.parseInt(valorObtido);
            } catch (Exception e) {
                main(args);
            }

            limparTela();

            if (continuarPrograma == 1) {
                if (valorObtidoComoInteiro < 0) {
                    numerosMenoresQueZero++;
                } else if (valorObtidoComoInteiro == 0) {
                    numerosIguaisAzero++;
                } else if (valorObtidoComoInteiro > 0) {
                    numerosMaioresQueZero++;
                }
            }   
        }

        limparTela();

        System.out.println(
                "A Quantidade de números inteiros positivos maiores que zero digitados peo usuáro foi de: "
                        + numerosMaioresQueZero);
        System.out.println("A Quantidade de números inteiros iguais a zero digitados peo usuáro foi de: "
                + numerosIguaisAzero);
        System.out.println("A Quantidade de números inteiros menores que zero digitados peo usuáro foi de: "
                + numerosMenoresQueZero);
        System.out.println("Fim de programa");
        entrada.close();
    }

    public static void exibirMenu() {
        System.out.println("------------------------------------");
        System.out.println("Digite 'f' para finalizar o programa");
        System.out.println("------------------------------------");
        System.out.println("");
    }

    public static void limparTela() {
        try {
            Runtime.getRuntime().exec("cls");  
        } catch (Exception e) {
        }
    }

}