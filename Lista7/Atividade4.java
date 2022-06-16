import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Atividade4 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        
      
        Path caminho = Paths.get("arquivo_questao4.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            String[] textoSeparado = leitura.split("\n");
            for (int i = 0; i < textoSeparado.length; i++) {
                System.out.println(textoSeparado[i]);
            }

            int controle = 0; 
            for (int i = 0; i < textoSeparado.length; i++) {
                controle ++;
            }
            System.out.println("Este arquivo possui "+controle+" Linhas");
            
            
        } catch (Exception erro) {
        }
        
        entrada.close();
    }
}