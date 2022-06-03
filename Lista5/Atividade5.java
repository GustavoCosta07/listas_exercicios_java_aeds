import java.util.Random;

public class Atividade5 {
    public static int matrizA[][];
    public static int matrizB[][];

    public static void main(String[] args) {

        preencher();
        int matrizSomada[][] = somaMatriz(matrizA, matrizB);
        mostrarMatriz(matrizSomada);
        int matrizsubtraida[][] = subtrairMatriz(matrizA, matrizB);
        mostrarMatriz(matrizsubtraida);
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

    public static void preencher() {
        matrizA = new int[4][6];
        matrizB = new int[4][6];
        Random random = new Random();

        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                matrizA[x][y] = random.nextInt(60);
            }
        }

        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                matrizB[x][y] = random.nextInt(60);
            }
        }
        mostrarMatriz(matrizA);
        mostrarMatriz(matrizB);
    }

    public static int[][] subtrairMatriz(int matrizA[][], int matrizB[][]) {
        int matrizSubtraida[][] = new int[4][6];

        for (int x = 0; x < matrizSubtraida.length; x++) {
            for (int y = 0; y < matrizSubtraida[x].length; y++) {
                matrizSubtraida[x][y] = (matrizA[x][y] - matrizB[x][y]);
            }
        }
        return matrizSubtraida;
    }

    public static int[][] somaMatriz(int matrizA[][], int matrizB[][]) {
        int matrizSomada[][] = new int[4][6];

        for (int x = 0; x < matrizSomada.length; x++) {
            for (int y = 0; y < matrizSomada[x].length; y++) {
                matrizSomada[x][y] = (matrizA[x][y] + matrizB[x][y]);
            }
        }
        return matrizSomada;
    }
}