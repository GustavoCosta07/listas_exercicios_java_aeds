import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine().toUpperCase().trim();
        System.out.println(frase);
        entrada.close();
    }
}