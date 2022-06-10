import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        String[] nomeSeparado = nome.split(" ");

        for (int i = 0; i < nomeSeparado.length; i++) {
            if (nomeSeparado[i].length() > 3) {
                char inicial = Character.toUpperCase(nomeSeparado[i].charAt(0));
                System.out.println(inicial);
            }

        }
        // Isso esta criando como se fosse uma matriz, ou uma lista dentro de uma lista

        entrada.close();
    }
}