import java.util.Scanner;
import java.io.*;
public class Atividade6 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int y = entrada.nextInt();
        int controle = 0;
        for(int i = y; i>0;i--){
            if(y%i==0){
                System.out.println(i);
                controle += i;
            }
        }
        criarArquivo("arquivo_questao6.txt", controle);
      
        

        entrada.close();
    }
    public static void criarArquivo(String caminho, int texto) throws IOException{
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.print(texto);
        pw.close();
    }
}