import java.util.Scanner;

public class Atividade8V2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine().toUpperCase().trim();
        String[] vetorFrase = frase.split("");
        String[] vetorAlfabeto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String[] vetorDeControle = new String[vetorFrase.length];
        for (int i = 0; i < vetorFrase.length; i++) {
            for (int j = 0; j < vetorAlfabeto.length; j++) {
                if (vetorFrase[i].equals(vetorAlfabeto[j])) {
                    vetorDeControle[i] = vetorAlfabeto[j + 3];
                }
            }
        }
        for (int i = 0; i < vetorDeControle.length; i++) {
            String controle = "";
            if (vetorDeControle[i] == null) {
                vetorDeControle[i] = " ";
            }
            controle += vetorDeControle[i];
            System.out.print(controle);
        }

        entrada.close();
    }
}