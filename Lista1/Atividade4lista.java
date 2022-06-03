package Lista1;
import java.util.Scanner;

public class Atividade4lista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Float salarioAtual = null;
        Float totalDesalario = 0f;
        int numeroDefilhos = 0;
        int pessoasEntrevistadas = 0;
        Float maiorSalario = 0f;
        int pessoasSalarioAte100 = 0;

        do {
            System.out.println("Digite o valor do seu salário: ");
            salarioAtual = entrada.nextFloat();

            if (salarioAtual >= 0) {
                if (salarioAtual > maiorSalario) {
                    maiorSalario = salarioAtual;
                }
                if (salarioAtual <= 100) {
                    pessoasSalarioAte100++;
                }
                pessoasEntrevistadas++;
                totalDesalario = totalDesalario + salarioAtual;
                System.out.println("Digite a quantidade de filhos que você possui: ");
                numeroDefilhos += entrada.nextInt();
            }

        } while (salarioAtual >= 0);

        System.out.printf("\n A média salarial entre a população entrevistada é de %.2f",
                (totalDesalario / pessoasEntrevistadas));
        System.out.printf("\n A média de filhos entre a população entrevistada é de %.2f",
                (float) (numeroDefilhos / pessoasEntrevistadas));
        System.out.printf("\n O maior salario dentre os entrevistados é de: %.2f \n", maiorSalario);
        System.out.println("A média de pessoas que recebem até 100 entre a população entrevistada é de: " +
                (float) (pessoasSalarioAte100 * 100) / pessoasEntrevistadas + " porcento");

        entrada.close();
    }

}
