package Lista2;
import java.util.Scanner;

public class Atividade7Lista2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alberto = 0;
        int lucia = 0;
        int dolores = 0;
        int ricardo = 0;
        int votoNulo = 0;
        int votoEmBranco = 0;
        int continuarVotacao = 1;

        do {
            System.out.println("Olá cidadão, Digite o código de 1 a 6 para votação: ");
            System.out.println("1 - Alberto");
            System.out.println("2 - Lucia");
            System.out.println("3 - Dolores");
            System.out.println("4 - Ricardo");
            System.out.println("5 - Voto nulo");
            System.out.println("6 - Voto em Branco");
            int voto = entrada.nextInt();

            if (voto == 1) {
                alberto++;
            } else if (voto == 2) {
                lucia++;
            } else if (voto == 3) {
                dolores++;
            } else if (voto == 4) {
                ricardo++;
            } else if (voto == 5) {
                votoNulo++;
            } else if (voto == 6) {
                votoEmBranco++;
            }
            System.out.println("Deseja continuar a votação? Se sim Digite 1, Se não, Digite 2");
            continuarVotacao = entrada.nextInt();
        } while (continuarVotacao == 1);
        if (continuarVotacao != 1) {
            System.out.println("Votos: ");
            System.out.println("Alberto: " + alberto);
            System.out.println("Lucia: " + lucia);
            System.out.println("Dolores: " + dolores);
            System.out.println("Ricardo: " + ricardo);
            System.out.println("Nulos: " + votoNulo);
            System.out.println("Brancos: " + votoEmBranco);
        }
        entrada.close();
    }
}