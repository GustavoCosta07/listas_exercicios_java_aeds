import java.util.Scanner;

public class Atividade4 {
    public static int matriz[][];
    public static void main(String[] args) {
        int tamanhoVetor = 5;
        preencher(tamanhoVetor);
        int somaLinha4 = somaLinha4();
        int somaColuna2 = somaColuna2();
        int somaDiagonalPrincipal = somaDiagonalPrincipal();
        int somaDiagonalSecundaria = somaDiagonalSecundaria();
        int somaGeral = somaGeral();
        System.out.println("O valor da soma da linha 4 da matriz é: " + somaLinha4);
        System.out.println("O valor da soma da coluna 2 da matriz é: " + somaColuna2);
        System.out.println("O valor da soma da diagonal principal da matriz é de: " + somaDiagonalPrincipal);
        System.out.println("O valor da soma da diagonal secundária da matriz é de: " + somaDiagonalSecundaria);
        System.out.println("O valor da soma geral da matriz é de: " + somaGeral);

    }

    public static void preencher(int tamanhoVetor) {
        matriz = new int[tamanhoVetor][tamanhoVetor];

        Scanner entrada = new Scanner(System.in);
        int status = 1;
        int total = tamanhoVetor * tamanhoVetor;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Digite o número " + status + "/" + total);
                matriz[x][y] = entrada.nextInt();
                status++;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        entrada.close();
    }

    public static int somaLinha4() {

        int soma = 0;

        for (int j = 0; j < matriz[3].length; j++) {
            soma += matriz[3][j];
        }

        return soma;
    }

    public static int somaColuna2() {

        int soma = 0;

        for (int x = 0; x < matriz.length; x++) {
            soma += matriz[x][1];
        }

        return soma;
    }

    public static int somaDiagonalPrincipal() {

        int soma = 0;

        for (int xy = 0; xy < matriz.length; xy++) {
            soma += matriz[xy][xy];
        }

        return soma;
    }

    public static int somaDiagonalSecundaria() {

        int soma = 0;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (x == 0 && y == 4) {
                    soma += matriz[x][y];
                } else if (x == 1 && y == 3) {
                    soma += matriz[x][y];
                } else if (x == 2 && y == 2) {
                    soma += matriz[x][y];
                } else if (x == 3 && y == 1) {
                    soma += matriz[x][y];
                } else if (x == 4 && y == 0) {
                    soma += matriz[x][y];
                }

            }
        }

        return soma;
    }

    public static int somaGeral() {

        int soma = 0;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                soma += matriz[x][y];
            }
        }

        return soma;
    }
}
