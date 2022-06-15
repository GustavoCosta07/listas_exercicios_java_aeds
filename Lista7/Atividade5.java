import java.util.Scanner;
// import javax.swing.JOptionPane;
import java.io.*;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;

public class Atividade5 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        
        File file = new File("texto.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("Insira um trecho para o primeiro texto: ");
        String texto =  entrada.nextLine();

        pw.print(texto);

        File file2 = new File("texto2.txt");
        FileWriter fw2 = new FileWriter(file2);
        PrintWriter pw2 = new PrintWriter(fw2);
        System.out.println("Insira um trecho para o segundo texto: ");
        String texto2 =  entrada.nextLine();

        pw2.print(texto2);

        File file3 = new File("texto3.txt");
        FileWriter fw3 = new FileWriter(file3);
        PrintWriter pw3 = new PrintWriter(fw3);
        
        pw3.print(texto +" "+ texto2);
        
        pw.close();
        pw2.close();
        pw3.close();

        // Path caminho = Paths.get("texto3.txt");
        // try {
        //     byte[] texto3 = Files.readAllBytes(caminho);
        //     String leitura = new String(texto3);
            
           
        //     JOptionPane.showMessageDialog(null, leitura);
          

        // } catch (Exception erro) {
        // }

        entrada.close();
    }
}
