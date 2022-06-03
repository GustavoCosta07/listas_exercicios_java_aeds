package Lista2;
import java.util.Scanner;

public class Atividade4Lista2{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos");
        int n1 = 0, n2 = 1;
        for (int qtd = entrada.nextInt(); qtd > 0; qtd--) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("Fim");
    }
}
