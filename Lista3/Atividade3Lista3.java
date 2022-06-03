package Lista3;
import java.util.Scanner;

public class Atividade3Lista3 {
    
    public static void ordem ( int num1, int num2, int num3){
        if ( (num1 >= num2 && num1 >= num3) && num2 >= num3 )
            System.out.printf("Numeros ordem Crescente %d %d %d", num3, num2, num1);
        else if ((num1 >= num2 && num1 >= num3) && num3 >= num2)
            System.out.printf("Numeros ordem Crescente %d %d %d", num2, num3, num1);
        else if ( (num2 >= num1 && num2 >= num3) && num1 >= num3 )
            System.out.printf("Numeros ordem Crescente %d %d %d", num3, num1, num2);
        else if ((num2 >= num1 && num2 >= num3) && num3 >= num1)
            System.out.printf("Numeros ordem Crescente %d %d %d", num1, num3, num2);
        else if ( (num3 >= num2 && num3 >= num1) && num2 >= num1 )
            System.out.printf("Numeros ordem Crescente %d %d %d", num1, num2, num3);
        else if ((num3 >= num2 && num3 >= num1) && num1 >= num2)
            System.out.printf("Numeros ordem Crescente %d %d %d", num2, num1, num3);
    }

      
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);

  int n1 = entrada.nextInt();
  int n2 = entrada.nextInt();
  int n3 = entrada.nextInt();

  ordem(n1, n2, n3);
    

    
   

    entrada.close();
}
}