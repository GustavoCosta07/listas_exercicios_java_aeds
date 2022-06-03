import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetorUm[] = new int[10];
        int vetorDois[] = new int[10];

        for (int posicao = 0; posicao < vetorUm.length; posicao++) {
            int numeros = entrada.nextInt();
            preenche(numeros, posicao, vetorUm);

        }

        System.out.println("insira os valores");
        for (int posicao2 = 0; posicao2 < vetorDois.length; posicao2++) {
            int numeros2 = entrada.nextInt();
            preenche(numeros2, posicao2, vetorDois);
        }
        preenche3(vetorUm, vetorDois);
        entrada.close();
    }

    public static void preenche(int numeros, int posicao, int[] vetorUm) {

        vetorUm[posicao] = numeros;

    }

    public static void preenche3(int vetorUm[], int vetorDois[]) {

        int vetor3[] = new int[20];

        int contadorPrimeiroVetor = 0;
        int contadorSegundoVetor = 0;

        for (int contador = 0; contador < vetor3.length; contador++) {
            if (contador % 2 == 0) {
                vetor3[contador] = vetorUm[contadorPrimeiroVetor];
                contadorPrimeiroVetor++;
            } else {
                vetor3[contador] = vetorDois[contadorSegundoVetor];
                contadorSegundoVetor++;
            }
        }

        System.out.println("Numeros do vetor: ");

        for (int index = 0; index < vetor3.length; index++) {
            System.out.println(vetor3[index]);
        }

    }

}
