import java.util.Scanner;

public class Atividade8 {
    public static final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensagem = new String();
        int chave = 0;
        System.out.print("Insira o texto: ");
        mensagem = entrada.nextLine();
        System.out.println("Insira a chave: ");
        chave = entrada.nextInt();
        System.out.println("Deseja criptogafar ou descriptografar? (c/d): ");
        String opcao = entrada.next();
        if (opcao.equals("c")) {
            System.out.println("Mensagem criptografada: " + encrypt(mensagem, chave));
        } else {
            System.out.println("Mensagem descriptografada: " + decrypt(mensagem, chave));
        }
        entrada.close();
    }
    
    public static String encrypt(String mensagem, int chave) {
        mensagem = mensagem.toLowerCase();
        String textoCriptografado = "";
        for (int contador = 0; contador < mensagem.length(); contador++) {
            int posicao = alfabeto.indexOf(mensagem.charAt(contador));
            if (posicao == -1) {
                textoCriptografado += '0';
                continue;
            }
            int valorChave = (chave + posicao) % alfabeto.length();
            char substituirValor = alfabeto.charAt(valorChave);
            textoCriptografado += substituirValor;
        }
        return textoCriptografado;
    }

    public static String decrypt(String mensagem, int chave) {
        mensagem = mensagem.toLowerCase();
        String textoDesCriptografado = "";
        for (int contador = 0; contador < mensagem.length(); contador++) {
            int posicaoCaracterer = alfabeto.indexOf(mensagem.charAt(contador));
            if (posicaoCaracterer == -1) {
                textoDesCriptografado += ' ';
                continue;
            }
            int valorChave = (posicaoCaracterer - chave) % 26;
            if (valorChave < 0) {
                valorChave = alfabeto.length() + valorChave;
            }
            char substituiValor = alfabeto.charAt(valorChave);
            textoDesCriptografado += substituiValor;
        }
        return textoDesCriptografado;
    }
}