package Lista3;
import java.util.Scanner;

public class Atividade7Lista3 {
    public static boolean positivoNegativo(int N) {
        return (N >= 0);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros voce quer verificar: ");
        int quantidadeNumeros = entrada.nextInt();

        String resultado = "";

        for (int index = 0; index < quantidadeNumeros ; index++) {
            System.out.println("Digite o " + (index + 1) +  "º valor: ");
            int valor = entrada.nextInt();
            resultado += "O valor " + valor + " é " + (positivoNegativo(valor) ? "positivo" : "negativo") + "\n";     
        }
        System.out.println(resultado);
        entrada.close();
    }
}