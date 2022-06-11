import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite uma frase e descubra se é um palíndromo ou não: ");
        String frase = entrada.nextLine();
        
        frase = frase.replaceAll("\\s+", "");
        String[] fraseSeparada = frase.split("");

        String fraseInvertida = "";

        for (int i = fraseSeparada.length; i > 0 ; i--) {
           fraseInvertida += fraseSeparada[i - 1];
        }

        if (frase.equals(fraseInvertida)) {
            System.out.println("sua frase é um palíndromo");
        } else {

            System.out.println("sua frase não é um palíndromo");
        }

        entrada.close();
    }
}