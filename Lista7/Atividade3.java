import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // C:\\Users\\gucos\\Desktop\\codigos\\Listas\\Lista7\\
        Path caminho = Paths.get("arquivo_questao2.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            String[] textoSeparado = leitura.split("");
            int contador = 0;
            String controle = "a";

            for (int i = 0; i < textoSeparado.length; i++) {
                if (textoSeparado[i].equals(controle)) {
                    contador++;
                }
            }
            System.out.println(contador);

        } catch (Exception erro) {
        }

        entrada.close();
    }
}