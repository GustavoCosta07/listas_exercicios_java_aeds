package Lista2;
import java.util.Scanner;

public class Atividade5Lista2{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor");
        int n1 = 0, n2 = 1, n3=0;
        int qtd = entrada.nextInt();
       while (n1 <= qtd ) {
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        
        System.out.println("Fim");
    }
}
