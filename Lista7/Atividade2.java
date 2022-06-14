import java.util.Scanner;
import java.io.*;

public class Atividade2 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        File file = new File("arquivo_questao2.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("Insira um texto: ");
        String texto =  entrada.nextLine();

        pw.print(texto);

        pw.close();
        entrada.close();
    }
}