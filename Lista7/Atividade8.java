import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a quantidade de veículos da locadora: ");
        int quantidadeVeiculos = entrada.nextInt();
        System.out.println("Digite o valor do aluguel dos veículos: ");
        int valorAluguel = entrada.nextInt();
        float terco = quantidadeVeiculos/3;
        float faturamentoAnual = terco * valorAluguel * 12;
        System.out.println("O faturamento anual é de " +faturamentoAnual);

        float decimo = terco/10;
        float multa = valorAluguel * 20/100;
        float lucroMulta = decimo * multa;
        System.out.println("O faturamento com multas no mes é de: " + lucroMulta);
        entrada.close();

        float doisPorcento = quantidadeVeiculos * 2/100;
        float valorGastoManutAnual = doisPorcento * 600;
        System.out.println("O valor gasto com manutenção anualmente é de: " + valorGastoManutAnual);
        
        criarArquivo("resultado.txt", faturamentoAnual);
        criarArquivo("resultado.txt", lucroMulta);
        criarArquivo("resultado.txt", valorGastoManutAnual);
    }
    public static void criarArquivo(String caminho, float texto) throws IOException{
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(texto);
        pw.close();
    }
}