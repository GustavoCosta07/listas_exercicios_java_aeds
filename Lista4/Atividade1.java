import java.util.Scanner; 

public class Atividade1 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        int total = soma(numero, 0);
        System.out.println("Resultado: " + total);
        entrada.close();
    }

    public static int soma (int numero, int total) {
     
        if (numero > 0) {
            int ultimoDigito = numero % 10; 
            total = total + ultimoDigito;
            numero = numero/10;
            return soma(numero, total);
        }

        return total;
    }
}