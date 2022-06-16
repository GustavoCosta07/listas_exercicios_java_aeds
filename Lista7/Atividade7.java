import java.util.Scanner;
import java.io.*;

public class Atividade7 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a quantidade de letras que deseja digitar: ");
        int quantidade = entrada.nextInt();
        String controle = "";
        for (int i = 0; i <= quantidade; i++) {
            System.out.println("Digite uma letra: ");
            controle += entrada.nextLine();
             
        }
        criarArquivo("arquivo_questao7.txt", controle);
        vogais(controle);
        
        
        entrada.close();
    }
    public static void criarArquivo(String caminho, String texto) throws IOException{
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(texto);
        pw.close();
    }
    private static void vogais (String texto){
        int contarVogais = 0;
        
        texto.toLowerCase();
        
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        
        System.out.println("A quantidade e vogais inseridas é de: "+contarVogais); 
    }
}