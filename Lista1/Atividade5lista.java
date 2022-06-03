package Lista1;
import java.util.Scanner;

public class Atividade5lista {
    
    public static void main(String[] args) {
        int valor = 0;
        float soma = 1f;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = entrada.nextInt();

        System.out.printf("\nValor de soma %dº: %.2f", 1, soma);

        for (int contador = 2; contador <= valor; contador++) {
            soma = soma + 1f / contador;
            System.out.printf("\nValor de soma %dº: %.2f", contador, soma);
        }

        System.out.printf("\nValor total de soma %.2f", soma);

        entrada.close();
    }
}