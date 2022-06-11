
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = entrada.nextLine();
        String[] data = dataNascimento.split("/");
        String meses [] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        //String meses2 [] = {"01","02","03","04","05","06","07","08","09","10","11","12"};
       
        int mes = Integer.parseInt(data[1].replace("0", ""));
        System.out.println(meses[mes - 1]);

        // for (int i = 0; i < meses2.length; i++) {
        //     if (data[1].equals(meses2[i])) {
        //         mes = meses[i];
        //         System.out.println(mes);
        //     }

        // }
        
        entrada.close();
    }
}