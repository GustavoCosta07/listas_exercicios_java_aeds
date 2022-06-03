package Lista3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade9Lista3 {

   private static List<Float> notas = new ArrayList<Float>();

    public static float calcularMedia() {
        Float notasAlunosAprovados = 0f;
        int alunosAprovados = 0;
        for (int index = 0; index < notas.size(); index++) {
            Float nota = notas.get(index);
            if (nota >= 6){
                notasAlunosAprovados+= nota;
                alunosAprovados++;
            }
        }
        return (notasAlunosAprovados / alunosAprovados);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      
        int continuarPrograma = 1;

        while (continuarPrograma == 1) {
            System.out.println("Digite a nota tirada: ");
            notas.add(entrada.nextFloat());
            System.out.println("Deseja Continuar o programa? Se sim Digite 1, Se não, Digite Qualquer Coisa ");
            continuarPrograma = entrada.nextInt();
        }

        entrada.close();
        System.out.println("Media de alunos aprovados: " + calcularMedia());
    }
}