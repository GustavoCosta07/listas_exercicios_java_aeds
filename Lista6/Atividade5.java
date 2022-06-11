import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número de telefone: ");
        String numeroTelefone = entrada.nextLine();

        if (numeroTelefone.contains("-") && numeroTelefone.length() < 10) {
            System.out.println("9" + numeroTelefone);
            entrada.close();
            System.exit(1);
        }

        if (numeroTelefone.length() < 9) {
            System.out.println("9" + numeroTelefone);
            entrada.close();
            System.exit(1);
        }

        System.out.println(numeroTelefone);
        entrada.close();
    }
}