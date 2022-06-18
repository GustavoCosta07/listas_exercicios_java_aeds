import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        int [] vetor = new int [20];
        int controle =0;
        System.out.println("Digite 20 números para serem gravados no arquivo: ");
        for (int i = 0; i < vetor.length; i++) {   
            int numeros = entrada.nextInt();
            vetor [i] = numeros; 
            controle += numeros;
            criarArquivo("arquivo.txt", numeros);
        }
        Arrays.sort(vetor); //isso ordena do menor para o maior
        float media = controle /20;
        int maior=vetor[19]; //o maior valor fica na última posição
        int menor=vetor[0]; // e o menor na primeira
        System.out.println("Maior = "+maior+"\nMenor = "+menor+"\nMedia ="+media);
  
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
