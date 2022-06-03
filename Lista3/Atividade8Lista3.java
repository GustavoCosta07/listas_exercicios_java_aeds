package Lista3;
import java.util.Scanner;

public class Atividade8Lista3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       
        int continuarPrograma = 1;

        while (continuarPrograma == 1) {
            System.out.println("Digite o valor de N: ");
            int valorN = entrada.nextInt();
            System.out.printf("O resultado da fórmula é: %.2f \n", + calcularFormula(valorN));
            System.out.println("Deseja Continuar o programa? Se sim Digite 1, Se não, Digite Qualquer Coisa ");
            continuarPrograma = entrada.nextInt();
            
        }

        

        
        entrada.close();
    }

    public static float calcularFormula(int num) {
        float base = (2f / 4 + 5f / 5 + 10f / 6 + 17f / 7 + 26f / 8);
        return (float) base + ((num * num) + 1) / (num + 3);
    }
}