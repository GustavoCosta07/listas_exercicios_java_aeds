
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = entrada.nextLine();
        String[] data = dataNascimento.split("/");
        String meses [] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        
        int mes = Integer.parseInt(data[1].replace("0", ""));
        System.out.println(meses[mes - 1]);

        entrada.close();
    }
}