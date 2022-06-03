package Lista3;
import java.util.ArrayList;
import java.util.List;

public class Atividade1Lista3 {

    public static float calcularMedia(float nota1, float nota2, float nota3, char operacao) {
        if (operacao == 'a' || operacao == 'A') {
            return (float) nota1 + nota2 + nota3 / 3;
        }
        return (float) nota1 + nota2 + nota3 / (5 + 3 + 2);
    }

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno(1, 3, 5));
        alunos.add(new Aluno(6, 4, 7));
        alunos.add(new Aluno(0, 3, 9));
        alunos.add(new Aluno(3, 3, 5));

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            Float mediaAritmetica = calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3, 'a');
            aluno.mediaAritmetica = mediaAritmetica;
            Float mediaPonderada = calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3, 'p');
            aluno.mediaPonderada = mediaPonderada;
            System.out.println("A média aritmética do " + (i + 1) + "ª aluno é: " + aluno.mediaAritmetica);
            System.out.println("A média ponderada do " + (i + 1) + "ª aluno é: " + aluno.mediaPonderada);
        }
    }
}