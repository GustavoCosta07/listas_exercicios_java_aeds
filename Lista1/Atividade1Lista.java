package Lista1;
import java.util.Scanner;

public class Atividade1Lista {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int numero1;
    int numero2;
    int numero3;

   System.out.println("Digite dois números inteiros para soma: ");
   numero1 = entrada.nextInt();
   numero2 = entrada.nextInt();
   numero3 = (numero1 + numero2);

   if (numero3 >= 10) {
       System.out.println(" O resultado da sua soma é: "+ (numero3 + 5));
   } else {
    System.out.println(" O resultado da sua soma é: "+ (numero3 + 7));
   }

    

    
   

    entrada.close();
}
}