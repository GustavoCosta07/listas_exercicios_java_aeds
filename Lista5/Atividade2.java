import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        float[] valores = new float[10];
        preencherValores(valores);
        float numeroNegativos[] = verificaNumerosNegativos(valores);
        for (int posicao = 0; posicao < numeroNegativos.length; posicao++) {
            System.out.println(numeroNegativos[posicao]);
        }
    }

    public static void preencherValores(float valores[]) {
        Scanner entrada = new Scanner(System.in);
        for (int posicao = 0; posicao < valores.length; posicao++) {
            float valor = entrada.nextFloat();
            valores[posicao] = valor;
        }
        entrada.close();
    }

    public static float[] verificaNumerosNegativos(float valores[]) {

        int quantidadeNumerosNegativos = 0;

        for (int posicao = 0; posicao < valores.length; posicao++) {
            if (valores[posicao] < 0) {
                quantidadeNumerosNegativos++;
            }
        }
        float numerosNegativos[] = new float[quantidadeNumerosNegativos];

        quantidadeNumerosNegativos = 0;

        for (int posicao = 0; posicao < valores.length; posicao++) {
            if (valores[posicao] < 0) {
                numerosNegativos[quantidadeNumerosNegativos] = valores[posicao];
                quantidadeNumerosNegativos++;
            }
        }
        return numerosNegativos;
        // Nesta função declarei uma variável para alocar a quantidade de numeros
        // negativos do vetor
        // Coloquei um for para iterar sobre os valores do vetor e coloquei um if para
        // somar mais um na variavel quando houver um numero negativo
        // depois preenchi um vetor com os numeros negativos e retornei esse vetor para
        // o programa principal
    }
}
