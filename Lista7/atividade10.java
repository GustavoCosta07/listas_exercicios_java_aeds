import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite 20 números para serem gravados no arquivo: ");
        for (int i = 0; i <= 20; i++) {
            int numeros = entrada.nextInt();
            criarArquivo("arquivo.txt", numeros);
        }

        entrada.close();
    }
    
    public static void criarArquivo(String caminho, int numeros) throws IOException {
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(numeros);
        pw.close();
    }
}
