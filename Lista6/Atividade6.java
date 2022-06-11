import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        String espacos = "";

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(espacos + palavra.charAt(i));
            espacos += "  ";
        }

        entrada.close();
    }
}