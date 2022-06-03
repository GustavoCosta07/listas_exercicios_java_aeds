package Lista1;
import java.util.Scanner;

public class Atividade2lista {
    
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int nota;

    System.out.println("Digite a nota tirada: ");
    nota = entrada.nextInt();
 
 
 if (nota >=8 == nota <=10  ) {
     System.out.println("Sua nota foi: ótimo");
 } else
     if (nota >= 7 == nota <8) {
         System.out.println("Sua nota foi: bom");
     }else
    if (nota >=5 == nota <7) {
     System.out.println("Sua nota foi: Regular");
    }else
 if (nota <5) {
     System.out.println("Sua nota foi: insatisfatório");
    }else
   

    entrada.close();
}
}