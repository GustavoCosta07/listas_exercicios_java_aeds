
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        float[] notas = new float[10];
        Scanner entrada = new Scanner(System.in);
        for (int posicao = 0; posicao < notas.length; posicao++) {
            float notaAluno = entrada.nextFloat();
            preenche(notaAluno, posicao, notas);
        }
        entrada.close();
        mostreAlunosAcimasDaMedia(notas);
        // Neste procedimento main estou declarando um vetor e colocando o usuário para digitar os valores
    }

    public static void preenche(float nota, int posicao, float[] notas) {
        notas[posicao] = nota;

        // Neste procedimento estou apenas preenchendo um vetor declarado no programa principal

    }

    public static void mostreAlunosAcimasDaMedia(float notas[]){
        float total = 0f;
        for (int posicao = 0; posicao < notas.length; posicao++) {
            total = total + notas[posicao];
        }

        float media =  total / notas.length;

        int alunosAcimadaMedia = 0;

        for (int posicao = 0; posicao < notas.length; posicao++) {
            if (notas[posicao] > media) {
                alunosAcimadaMedia++;
            }
        }

        System.out.printf("Media geral da turma: %.2f\n", media);
        System.out.println("Quantidade de alunos acima da média: " + alunosAcimadaMedia);

        // Neste procedimento declarei uma variavel para alocar o total de notas de todos os alunos.
        // depois declarei outra variavel para alocar a media da turma baseada no total dividido pela quantidade de alunos
        // declarei outra variavel para somar a quantidade de alunos que ficaram acima da média 
        // após isso mostrei na tela com o print o valor da média e os alunos acima da média

    }
}