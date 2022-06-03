package Lista3;
import java.util.Scanner;

public class Atividade2Lista3 {
    public static void media (float n1, int n2){
        System.out.printf("\n A média salarial entre a população entrevistada é de %.2f",
        (n1 / n2));
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Float salarioAtual = null;
        Float totalDesalario = 0f;
        int numeroDefilhos = 0;
        int pessoasEntrevistadas = 0;
        int continuarPrograma = 1;
        do {
            System.out.println("Digite o valor do seu salário: ");
            salarioAtual = entrada.nextFloat();

            pessoasEntrevistadas++;
            totalDesalario = totalDesalario + salarioAtual;
            System.out.println("Digite a quantidade de filhos que você possui: ");
            numeroDefilhos += entrada.nextInt();
            numeroDefilhos++;
            System.out.println("Deseja Continuar o programa?, Se sim digte 1, Se não digite 2");
            continuarPrograma = entrada.nextInt();

        } while (continuarPrograma == 1);

      media(totalDesalario, numeroDefilhos);
        entrada.close();
    }
    
 
}
