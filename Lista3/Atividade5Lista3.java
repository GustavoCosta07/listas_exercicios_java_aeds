package Lista3;
import java.util.Scanner;

public class Atividade5Lista3 {

    public static void mostrarNota(float notaAluno) {
        if (notaAluno <= 39) {
            System.out.println("Sua classificação é F");
        } else if (notaAluno >= 40 && notaAluno <= 59) {
            System.out.println("Sua classificação é E");
        } else if (notaAluno >= 60 && notaAluno <= 69) {
            System.out.println("Sua classificação é D");
        } else if (notaAluno >= 70 && notaAluno <= 79) {
            System.out.println("Sua classificação é C");
        } else if (notaAluno >= 80 && notaAluno <= 89) {
            System.out.println("Sua classificação é B");
        } else if (notaAluno >= 90) {
            System.out.println("Sua classificação é A");
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("De Quantos Alunos voce quer saber a media? ");
        int quantidadeAlunos = entrada.nextInt();
        for (int index = 0; index < quantidadeAlunos ; index++) {
            System.out.println("Digite a nota do " + (index + 1) + "º Aluno");
            Float notaAluno = entrada.nextFloat();
            mostrarNota(notaAluno);
            
        }



        entrada.close();
    }
}