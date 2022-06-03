import java.util.Random;

public class Atividade6 {
    public static int[][] matrizPrincipal = new int[10][10];
    public static void main(String[] args) {
        preencherMatrizPrincipal();
        mostrarMatriz(matrizPrincipal);
        // System.out.println("trocando linha 2 por linha 8");
        trocaLinha2PorLinha8();
        // System.out.println("trocando coluna 4 por coluna 10");
        trocaColuna4PorColuna10();
        // mostrarColunaXLinhaMatriz(matrizPrincipal, 4, 'l');
        trocaDiagonalPrincipalComDiagonalSecundaria();
        trocaLinha5ComColuna10();
    }

    private static void preencherMatrizPrincipal() {
        Random random = new Random();
        for (int x = 0; x < matrizPrincipal.length; x++) {
            for (int y = 0; y < matrizPrincipal[x].length; y++) {
                matrizPrincipal[x][y] = random.nextInt(10);
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {
        System.out.println("exibindo matriz");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarColunaXLinhaMatriz(int matriz[][], int posicao, char dimensao) {
        System.out.println("");
        if (dimensao == 'c') {
            for (int x = 0; x < matriz.length; x++) {
                System.out.print(matriz[x][posicao] + " ");
            }
        } else {
            for (int y= 0; y < matriz[posicao].length; y++) {
                System.out.print(matriz[posicao][y] + " ");
            }
            System.out.println();
        }
    }

    public static void trocaLinha2PorLinha8() {
        int[][] matrizTroca = matrizPrincipal.clone();
        int aux;
        for (int y = 0; y < matrizTroca.length; y++) {
            aux = matrizTroca[1][y];
            matrizTroca[1][y] = matrizTroca[7][y];
            matrizTroca[7][y] = aux;
        }
        mostrarMatriz(matrizTroca);
    }

    public static void trocaColuna4PorColuna10() {
        int[][] matrizTroca = matrizPrincipal.clone();
        int vetorDeControle;
        for (int x = 0; x < matrizTroca.length; x++) {
            vetorDeControle = matrizTroca[x][3];
            matrizTroca[x][3] = matrizTroca[x][9];
            matrizTroca[x][9] = vetorDeControle;
        }
        mostrarMatriz(matrizTroca);
    }

    public static void trocaDiagonalPrincipalComDiagonalSecundaria() {
        int matrizDeControle[][] = matrizPrincipal.clone();

        int y = matrizDeControle.length - 1;

        for (int x = 0; x < matrizPrincipal.length; x++) {
            int posicaoY = y - x;
            int aux = matrizDeControle[x][x];
            matrizDeControle[x][x] = matrizDeControle[x][posicaoY];
            matrizDeControle[x][posicaoY] = aux;
        }
        mostrarMatriz(matrizDeControle);
    }

    public static void trocaLinha5ComColuna10() {
        int[][] matrizTroca = matrizPrincipal.clone();
        int vetorDeControle;
        for (int y = 0; y < matrizPrincipal.length; y++) {
            vetorDeControle = matrizPrincipal[4][y];
            matrizTroca[4][y] = matrizTroca[y][9];
            matrizTroca[y][9] = vetorDeControle;
        }
        mostrarMatriz(matrizTroca);
    }
}
