import java.util.Scanner;
import java.io.*;

public class Atividade5 {

    private static Scanner entrada = null;

    public static void main(String[] args) throws IOException {
        entrada = new Scanner(System.in);
        String texto = capturaTexto("Insira um trecho para o primeiro texto:");
        criarArquivo("texto.txt", texto);
        String texto2 = capturaTexto("Insira um trecho para o segundo texto:");
        criarArquivo("texto2.txt", texto2);
        criarArquivo("texto3.txt", texto + " " + texto2);
        entrada.close();
    }

    private static String capturaTexto (String mensagem) {
        System.out.println(mensagem);
        String texto = entrada.nextLine();
        return texto;
    }

    private static void criarArquivo(String caminho, String texto) throws IOException{
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(texto);
        pw.close();
    }
}
