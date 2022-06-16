import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import javax.swing.JOptionPane;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

// Problemas: dentro do while a entrada matricula não está sendo respeitada a partir da segunda iteração
// somente a entrada telefone funciona após a primeira iteração

// O JOptionpane não está funcionando, testei o mesmo trecho de código em outro arquivo e funciona
// copie o trecho de código do trychatch a partir do patch e coloque em outro arquivo dentro de main, vai funcionar

public class Atividade9 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os dados de um aluno");
        int continuarPrograma = 1;
        int indice = 1;
        while (continuarPrograma == 1) {
            System.out.println("Digite a matricula do " + indice + "º" + " Aluno");
            String matricula = entrada.nextLine();
            System.out.println("Digite o telefone do " + indice + "º" + " Aluno");
            String telefone = entrada.nextLine();
            criarArquivo("dados.txt", matricula, telefone);
            System.out.println("Deseja continuar o programa? se sim digite 1, se não digite 2");
            continuarPrograma = entrada.nextInt();
            indice++;

        }

        if (continuarPrograma != 1) {
            System.out.println("Deseja ver os dados salvos no arquivo ? se sim digite 1, se não digite 2");
            int verDados = entrada.nextInt();
            if (verDados == 1) {
                Path caminho = Paths.get("dados.txt");
                try {

                    byte[] texto = Files.readAllBytes(caminho);
                    String leitura = new String(texto);
                    System.out.println(leitura);
                    JOptionPane.showMessageDialog(null, "ola");

                } catch (Exception erro) {
                }
            } else if (verDados != 1) {
                System.out.println("Fim de programa");
            }

        } else {
            System.out.println("Fim de programa");
        }

        entrada.close();
    }

    public static void criarArquivo(String caminho, String matricula, String telefone) throws IOException {
        File file = new File(caminho);
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(matricula + " " + telefone);
        pw.close();
    }
}
