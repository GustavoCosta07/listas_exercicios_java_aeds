import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        float [] vetor = new float [20];
        float controle =0f;
        System.out.println("Digite 20 números em ponto flutuante para serem gravados no arquivo: ");
        for (int i = 0; i < vetor.length; i++) {   
            float numeros = entrada.nextFloat();
            vetor [i] = numeros; 
            controle += numeros;
            criarArquivo("arquivo.txt", numeros);
        }
        Arrays.sort(vetor); //isso ordena do menor para o maior
        float media = controle /20;
        float maior=vetor[19]; //o maior valor fica na última posição
        float menor=vetor[0]; // e o menor na primeira
        System.out.println("Maior = "+maior+"\nMenor = "+menor+"\nMedia ="+media);
  
        entrada.close();
    }
    
    public static void criarArquivo(String caminho, Float numeros) throws IOException {
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(numeros);
        pw.close();
    }
}
